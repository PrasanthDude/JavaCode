package com.prasanth.basic;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao 
{
	public static Connection getConnection() throws Exception{
		 
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con =
		DriverManager.getConnection("jdbc:mysql://localhost:3306/prasanth", "root","Dude1234>"); 
		return con; 
	}  
}
