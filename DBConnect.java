package com.conn;

import java.sql.*;

public class DBConnect 
{
	private static Connection conn = null;
	public static Connection getConn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyscaler","root","Pradeepta@4059");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return conn;
	}
	

}
