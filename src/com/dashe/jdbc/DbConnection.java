package com.dashe.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;




public class DbConnection {

	public static void main(String[] args) throws Exception {
		// 注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 建立连接
		// Connection conn =
		// 
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		// 创建STATEMENT语句对象
		  Statement stmt = conn.createStatement();

		String sql = "insert into cv (name,id) values('zhangsan',25);";

		stmt.executeUpdate(sql);
		// 执行插入数据得操作
		System.out.println("执行结束");
		stmt.close();
		conn.close();

	}

}
