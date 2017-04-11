package com.zj.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPostgres {
	
	public static String url = "jdbc:postgresql://114.215.140.122:5432/postgis";
	
	public static String uName = "postgres";
	
	public static String uPsd = "postgis";
	
	public static String clsName = "org.postgresql.Driver";
	
	public static Connection con;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SSS");
	
		// TODO Auto-generated method stub

		
		Class.forName(clsName); 
		System.out.println(formatter.format(new Date()));
		con = DriverManager.getConnection(url, uName, uPsd);
		int p =21;
		try {
			
			for( int i= 0;i<200; i++){
//			PreparedStatement sql = con.prepareStatement("insert into table1(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,AA,AB,AC,AD,AE,AF,AG,AH)  select *  from table1");
			PreparedStatement sql = con.prepareStatement("SELECT\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '"+i+"' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '22' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n"
					+ 
					
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '46'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '121' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '28' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '49'\r\n" + 
					"		AND c_gclb = '23' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '27' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '40'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	),\r\n" + 
					"	SUM (\r\n" + 
					"		CASE\r\n" + 
					"		WHEN c_lmsy = '30'\r\n" + 
					"		AND c_gclb = '21' THEN\r\n" + 
					"			(\r\n" + 
					"				CASE c_dilei\r\n" + 
					"				WHEN '111' THEN\r\n" + 
					"					\"d_mj\"\r\n" + 
					"				ELSE\r\n" + 
					"					0\r\n" + 
					"				END\r\n" + 
					"			)\r\n" + 
					"		ELSE\r\n" + 
					"			0\r\n" + 
					"		END\r\n" + 
					"	)\r\n" + 
					"FROM\r\n" + 
					"	\"public\".\"j2210000jb2012xbm\"\r\n" + 
					"WHERE\r\n" + 
					"	c_cun = '210123102001'\r\n" + 
					"AND c_lmsy = '40'\r\n" + 
					"AND c_gclb = '21';");
			ResultSet xbSet =sql.executeQuery();
			 i++;
			for(;xbSet.next();) {
//				System.out.println(xbSet.getString(1));
				}
				
			}
			System.out.println(formatter.format(new Date()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			    con.close();	
		}
		
		
		
	}
	
	public  static void queryByCode(String xzqh){
		
		if(xzqh.length()==20){
		try {
			PreparedStatement sql = con.prepareStatement("select  A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,AA,AB,AC,AD,AE,AF,AG,AH from j2210000jb2012xbm");
				sql.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 }
		else{
			try {
				PreparedStatement sql = con.prepareStatement("select code_index from j2_unitcode where code_index like  ?____");
				sql.setString(0, xzqh);
				ResultSet xbmSet = sql.executeQuery();
				while(xbmSet.next()){
					queryByCode(xbmSet.getString(1));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}

}
