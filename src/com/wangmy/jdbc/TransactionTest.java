package com.wangmy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db","root","");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void addUserData() {
		Connection conn = getConnection();
		Statement st = null;
		try {
			st = conn.createStatement();
			int count = st.executeUpdate("insert into tbl_user (id,name,password,email) " + 
										 "values (5,'tom','444444','tom@gmail.com')");
			System.out.println("向用户表插入了 " + count + " 条数据。");
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void addAddressData() {
		Connection conn = getConnection();
		Statement st = null;
		try {
			st = conn.createStatement();
			int count = st.executeUpdate("insert into tbl_address (id,city,country,user_id) " + 
					"values (1,'shanghai','china',5)");
			System.out.println("向地址表插入了 " + count + " 条数据。");
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		addUserData();
		addAddressData();
	}

}
