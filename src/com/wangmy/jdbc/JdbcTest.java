package com.wangmy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void insert() {
		Connection conn = getConnection();
		try {
			Statement st = conn.createStatement();
			int count = st.executeUpdate("insert into tbl_user(name,password,email)" + 
							"values('Tom','123456','tom@gmail.com')");
			System.out.println("用户向表中插入了 " + count + " 条数据。");
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void update() {
		Connection conn = getConnection();
		try {
			Statement st = conn.createStatement();
			int count = st.executeUpdate("update tbl_user set name='tommm' where name='Tom'");
			System.out.println("用户向表中更新了 " + count + " 条数据。");
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void delete() {
		Connection conn = getConnection();
		try {
			Statement st = conn.createStatement();
			int count = st.executeUpdate("delete from tbl_user where name='tommm'");
			System.out.println("用户向表中插入了 " + count + " 条数据。");
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void select() {
		Connection conn = getConnection();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM tbl_user");
			while(rs.next()){
				System.out.print(rs.getInt("id") + "    ");
				System.out.print(rs.getString("name") + "    ");
				System.out.print(rs.getString("password") + "    ");
				System.out.print(rs.getString("email") + "    ");
				System.out.println();
			}
			rs.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		insert();
//		update();
		delete();
		select();
	}
}
