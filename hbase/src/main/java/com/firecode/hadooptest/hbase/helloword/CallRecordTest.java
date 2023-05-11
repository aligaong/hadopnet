package com.firecode.hadooptest.hbase.helloword;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CompareOperator;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.ColumnFamilyDescriptor;
import org.apache.hadoop.hbase.client.ColumnFamilyDescriptorBuilder;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.client.TableDescriptor;
import org.apache.hadoop.hbase.client.TableDescriptorBuilder;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.PrefixFilter;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.Before;
import org.junit.Test;

/**
 * 通话记录数据查询测试
 * @author JIANG
 */
public class CallRecordTest extends HBaseConnectionTest {
	/**
	 * 创建 call_record 通话记录表
	 * @throws IOException
	 */
	@Before
	public void create() throws IOException {
		
		TableName tableName = TableName.valueOf("call_record");
		//表是否存在
		if(!admin.tableExists(tableName)) {
			//列族
			ColumnFamilyDescriptor family = ColumnFamilyDescriptorBuilder.newBuilder(Bytes.toBytes("cf")).build();
			//builder 表
			TableDescriptorBuilder tableBuilder = TableDescriptorBuilder.newBuilder(tableName);
			tableBuilder.setColumnFamily(family);
			TableDescriptor desc = tableBuilder.build();
			admin.createTable(desc);
		}
	}
	
	/**
	 * 插入数据
	 * @throws IOException
	 */
	@Test
	public void insert() throws IOException {
		List<Put> puts = new ArrayList<>();
		for(int i=0;i<10;i++) {
			String phone = getPhoneNum("188");
			for(int j=0;j<100;j++) {
				//对方的手机号码
				String dnumPhone = getPhoneNum("158");
				//通话时长
				String length = String.valueOf(r.nextInt(99));
				//呼叫类型：1  呼入，2 呼出
				String type = String.valueOf(r.nextInt(2));
				//通话时间
				LocalDateTime date = getDate(2019);
				String dateStr = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(date);
				
				Long milliSecond = date.toInstant(ZoneOffset.of("+8")).toEpochMilli();
				//用户Long在最大值减去时间戳，那么最近的通话记录就会排在最前面（因为最近的值最大，减去之后就越小），方便我们查询
				String rowKey = phone+"_"+(Long.MAX_VALUE-milliSecond);
				
				Put put = new Put(Bytes.toBytes(rowKey));
				byte[] family = Bytes.toBytes("cf");
				put.addColumn(family, Bytes.toBytes("dnumPhone"), Bytes.toBytes(dnumPhone));
				put.addColumn(family, Bytes.toBytes("length"), Bytes.toBytes(length));
				put.addColumn(family, Bytes.toBytes("type"), Bytes.toBytes(type));
				put.addColumn(family, Bytes.toBytes("date"), Bytes.toBytes(dateStr));
				puts.add(put);
			}
		}
		TableName tableName = TableName.valueOf("call_record");
		Table table = connection.getTable(tableName);
		table.put(puts);
	}
	
	/**
	 * 用scan获取2月的通话记录
	 * @throws IOException 
	 */
	@Test
	public void scan() throws IOException {
		String phoneNum = "18895873406";
		String  statRow = phoneNum+"_"+(Long.MAX_VALUE-getTime("2019-02-01 00:00:00"));
		String endRow = phoneNum+"_"+(Long.MAX_VALUE-getTime("2019-01-01 00:00:00"));
		
		Scan scan  = new Scan();
		scan.addFamily(Bytes.toBytes("cf"));
		//开始行（指的是Row Key）
		scan.withStartRow(Bytes.toBytes(statRow));
		//结束行（指的是Row Key）
		scan.withStopRow(Bytes.toBytes(endRow));
		
		TableName tableName = TableName.valueOf("call_record");
		Table table = connection.getTable(tableName);
		ResultScanner rss = table.getScanner(scan);
		for(Result rs:rss) {
			Cell cell = rs.getColumnLatestCell(Bytes.toBytes("cf"), Bytes.toBytes("dnumPhone"));
			System.err.print(Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength()));
			
			Cell date = rs.getColumnLatestCell(Bytes.toBytes("cf"), Bytes.toBytes("date"));
			System.err.print("     ");
			System.err.print(Bytes.toString(date.getValueArray(), date.getValueOffset(), date.getValueLength()));
			System.err.println();
		}
	}
	
	@Test
	public void scanByFilter() throws IOException {
		String phoneNum = "18895873406";
		String  statRow = phoneNum+"_"+(Long.MAX_VALUE-getTime("2019-02-01 00:00:00"));
		String endRow = phoneNum+"_"+(Long.MAX_VALUE-getTime("2019-01-01 00:00:00"));
		
		Scan scan  = new Scan();
		scan.addFamily(Bytes.toBytes("cf"));
		//开始行（指的是Row Key）
		scan.withStartRow(Bytes.toBytes(statRow));
		//结束行（指的是Row Key）
		scan.withStopRow(Bytes.toBytes(endRow));
		
		
		FilterList list = new FilterList(FilterList.Operator.MUST_PASS_ALL);
		//前缀过滤器（值的前缀是这个的）
		PrefixFilter filter1 = new PrefixFilter(Bytes.toBytes("18895873406"));
		//列值的过过滤器（我们只要type=1）
		SingleColumnValueFilter filter2 = new SingleColumnValueFilter(Bytes.toBytes("cf"), Bytes.toBytes("type"), CompareOperator.EQUAL, Bytes.toBytes("1"));
		list.addFilter(filter1);
		list.addFilter(filter2);
		//设置过滤器
		scan.setFilter(list);
		
		
		TableName tableName = TableName.valueOf("call_record");
		Table table = connection.getTable(tableName);
		ResultScanner rss = table.getScanner(scan);
		for(Result rs:rss) {
			Cell cell = rs.getColumnLatestCell(Bytes.toBytes("cf"), Bytes.toBytes("dnumPhone"));
			System.err.print(Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength()));
			
			Cell date = rs.getColumnLatestCell(Bytes.toBytes("cf"), Bytes.toBytes("date"));
			System.err.print("     ");
			System.err.print(Bytes.toString(date.getValueArray(), date.getValueOffset(), date.getValueLength()));
			System.err.println();
		}
		
	}
	
	public Long getTime(String date) {
		DateTimeFormatter formmat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return LocalDateTime.parse(date, formmat).toInstant(ZoneOffset.of("+8")).toEpochMilli();
	}
	
	/**
	 * 生成随机的手机号码
	 * @param str
	 * @return
	 */
	private String getPhoneNum(String str) {
		
		return str+String.format("%08d", r.nextInt(99999999));
	}
	
	Random r = new Random();
	
	/**
	 * 生成随机通话时间
	 * @param year
	 * @return
	 */
	private LocalDateTime getDate(int year) {
		
		return LocalDateTime.of(year, r.nextInt(12)+1, r.nextInt(27)+1, r.nextInt(24), r.nextInt(60), r.nextInt(60));
	}
}
