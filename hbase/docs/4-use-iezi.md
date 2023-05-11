#### 一、人员-角色
```bash
需求：
1，人员有多少个角色，角色优先级
2，角色有多少个人员
3，人员可以删除添加角色
4，角色可以添加删除人员
5，人员，角色的删除添加
 
解决思路：设计两张表(个人总觉得这种设计会有问题,当角色拥有大批量人员的的时候,该如何查询,比如如何分页)
 
人员表(person)：
--------------------|------------------------- |---------------------------------------------------------|
rowKey(人员ID)      |     cf1(个人信息列族)     |          cf2(人员拥有的角色列族(Key是角色ID,值是优先级))   |
--------------------|--------------------------|---------------------------------------------------------|
     001            |     cf1:name=张三        |          cf2:100=1                                      |
--------------------|--------------------------|---------------------------------------------------------|
     002            |     cf1:name=王五        |          cf2:100=1;cf2:200=1                            |
------------------- |--------------------------|---------------------------------------------------------|
 

角色表(role)：
--------------------|--------------------------|---------------------------------------------------------|
rowKey(角色ID)      |     cf1(角色信息列族)     |          cf2(角色拥有的人员列族)                          |
------------------- |--------------------------|---------------------------------------------------------|
      100           |     cf1:name=管理员       |         cf2:001=张三                                    |
--------------------|--------------------------|---------------------------------------------------------|
      200           |     cf1:name=财务        |          cf2:001=张三;cf2:002=王五                       |
--------------------|--------------------------|---------------------------------------------------------|
```
 
#### 二、组织架构，部门-子部门
```bash
需求：
1，查询等级部门
2，查询每个部门的子部门
3，部门添加删除
4，部门添加删除子部门

设计思路：一张表

组织架构表(dept)：
-------------------------|---------------------------------------------|-----------------------------------------|
rowKey(部门等级_部门ID)   |      cf1(部门信息列族)                       |     cf2(子部门信息列族)                  |
-------------------------|---------------------------------------------|-----------------------------------------|
        0_001            |      cf1:name=集团总部                       |    cf2:1_002=华北大区;cf2:1_003=华南大区 |
-------------------------|---------------------------------------------|-----------------------------------------|
        1_002            |      cf1:name=华北大区;cf1:parentId=0_001    |    cf2:2_004=天津办事处                  |
-------------------------|---------------------------------------------|-----------------------------------------|
        1_003            |      cf1:name=华南大区;cf1:parentId=0_001    |    cf2:2_005=广东办事处                  |
-------------------------|---------------------------------------------|-----------------------------------------|
```

#### 三、微博
```bash
需求：
1，添加、查看关注
2，粉丝列表
3，写微博
4，查看首页，所有关注过的好友发布的最新微博
5，查看某个用户发布的所有微博，降序排列

解决思路：设计三张表

关注粉丝表(focus_fans)：(数据关系：小米001关注小红002,小黑003关注小红002,小红002有粉丝小米001和小黑003,小米001关注小豆004)
-----------------|------------------------------|------------------------------------------|
rowKey(人员ID)   |    cf1(关注列表列族)          |      cf2(粉丝列表列族)                    |
-----------------|------------------------------|------------------------------------------|
      001        |    cf1:002=小红;cf1:004=小豆  |                                          | 
-----------------|------------------------------|------------------------------------------|
      002        |                              |     cf2:001=小米;cf2:003=小黑             | 
-----------------|------------------------------|------------------------------------------|
      003        |    cf1:002=小红              |                                          |
-----------------|------------------------------|------------------------------------------|
      004        |                              |     cf2:001=小米                         |
-----------------|------------------------------|------------------------------------------|


微博表(weibo)：
----------------------------------------|--------------------------------------------------|
rowKey(用户ID_(Long.max()-timestamp))   |          cf1(内容列族)                            |
----------------------------------------|--------------------------------------------------|
           002_2121515                  |         cf1:title=心情;cf1:content=好好           |
----------------------------------------|--------------------------------------------------|           
           004_2121516                  |         cf1:title=天气;cf1:content=晴             |
----------------------------------------|--------------------------------------------------|

微博收取表(weibo_collect)：
需求：用于查看首页，所有关注过的好友发布的最新微博：
思路：将列族cf1设置一个最大版本号，用户每接收一条微博，就往cf1列族sq列插一条数据。因为设置了最大版本，所以不会去修改数据，而是增加数据，且记录版本，当到达最大版本时，自动删除旧的版本数据
------------------|-----------------------------------------------------------------------------------------------------|
rowKey(用户ID)    |          cf1(收取列族,version=10000,同一个用户，这个列族最多10000个版本的数据),数据描述： (收取=微博ID)   |
------------------|-----------------------------------------------------------------------------------------------------|  
                  |         cf1:sq=002_2121515                                                                          |
     001          |         cf1:sq=004_2121516                                                                          |
------------------|-----------------------------------------------------------------------------------------------------|     
```