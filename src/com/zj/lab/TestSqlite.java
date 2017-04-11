package com.zj.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSqlite {
	
	private static Connection conn;//连接在哪关闭的？？
	private static Statement statement;//资源在哪释放？？

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url = "jdbc:sqlite://f:/Zj/SqlLite/test.db";
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection(url);
			statement = conn.createStatement();
			  Statement checkHasTables =  conn.createStatement();
			   ResultSet tablesSet = checkHasTables.executeQuery("select mian_ji from xb where rowid=1");
              tablesSet.next();
			   System.out.println(tablesSet.getDouble("MIAN_JI"));
			   conn.close();

			
			

		} catch (ClassNotFoundException e) {// 捕获加载驱动程序异常
			// TODO Auto-generated catch block
			System.out.println("装载JDBC/SQLite驱动异常");
			e.printStackTrace();
			System.exit(1);// // 非正常退出，就是说无论程序正在执行与否，都退出
		} catch (SQLException e) { // 捕获连接数据库异常
			// TODO Auto-generated catch block
			System.out.println("无法连接到数据库");
			e.printStackTrace();
			System.exit(1);// 是非正常退出，就是说无论程序正在执行与否，都退出
		}
	}

}
