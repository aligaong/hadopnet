package com.firecode.hadooptest.flume.channel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.flume.ChannelException;
import org.apache.flume.Event;

/**
 * 自定义通道（缓冲区，以mysql作为缓冲区）
 * @author JIANG
 */
public class MyChannel extends AbstractChannel {
	
	static{

	}
	
			prepareStatement.close();
			transaction.commit();
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			transaction.close();
		}
	}

	@Override
	public Event take() throws ChannelException {
		Transaction transaction = getTransaction();
		Connection connect = null;
		PreparedStatement prepareStatement = null;
		ResultSet rs = null;
		try {
			connect = DriverManager.getConnection("jdbc:mysql://server004:3306/flume_remote?createDatabaseIfNotExist=true", "root", "Jiang@123");
			transaction.begin();
			prepareStatement = connect.prepareStatement("select * from test limit 1");
			rs = prepareStatement.executeQuery();
			String msg = null;
			if(rs.next()){
				msg = rs.getString(1);
				if(null != msg && msg.length() != 0){
					PreparedStatement prepareStatement2 = connect.prepareStatement("delete from test where msg = '"+msg+"'");
					prepareStatement2.executeUpdate();
					transaction.commit();
					SimpleEvent e = new SimpleEvent();
					e.setBody((msg==null?"not data":msg).getBytes());
					return e;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(null != rs){
					rs.close();
				}
				if(null != prepareStatement){
					prepareStatement.close();
				}
				if(null != connect){
					connect.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			transaction.close();
		}
		return null;
	}

	@Override
	public Transaction getTransaction() {
		
		return new Transaction(){

			@Override
			public void begin() {
			}
			@Override
			public void commit() {
			}
			@Override
			public void rollback() {
			}
			@Override
			public void close() {
			}
		};
	}
	
}
