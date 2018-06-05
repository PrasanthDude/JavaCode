package com.prasanth.basic;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import com.mysql.jdbc.Connection;

public class JDBCJava 
{
	  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	  static final String DB_URL = "jdbc:mysql://localhost:3306//prasanth";
	  
	  static final String USER = "root";
	  static final String PASS = "Dude1234>";
	  
	   
	   public static void main(String args[])
	   {
		   Connection con = null;
		   Statement stmt = null;
		   
		   try
		   {
			   Class.forName("com.mysql.jdbc.Driver");
			   con = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
			   stmt = con.createStatement();
		       String sql = "SELECT EMP_ID,NAME,DEPARTMENT,SALARY,JOINED_ON from employees";
		       ResultSet rs = stmt.executeQuery(sql);
		       
		       while(rs.next())
		       {
		    	 int EMP_ID = rs.getInt("EMP_ID");
		    	 String NAME = rs.getString("NAME");
		    	 String DEPARTMENT = rs.getString("DEPARTMENT");
		    	 int  SALARY = rs.getInt("SALARY");
		    	 Timestamp JOINED_ON = rs.getTimestamp("JOINED_ON");
		    	 
		    	 System.out.println("Employee id is:" +EMP_ID);
		    	 System.out.println("Employee name is:" +NAME);
		    	 System.out.println("Employee department is" +DEPARTMENT);
		    	 System.out.println("Employee salary is" +SALARY);
		    	 System.out.println("Employee joined on" +JOINED_ON);
		    	 
		    	 
		       }
		       
		       rs.close();
		       stmt.close();
		       con.close();
		       
		   }
		   catch(SQLException e)
		   {
			   e.printStackTrace();
		   }
		   catch(Exception es)
		   {
			   es.printStackTrace();
		   }
		   finally
		   {
			   try
			   {
				   if(stmt!=null)
					   stmt.close();
			   }
			   catch(SQLException se2)
			   {
				  se2.printStackTrace();   
			   }
			   try
			   {
				   if(con!=null)
					   con.close();
			   }
			   catch(SQLException se3)
			   {
				   se3.printStackTrace();
			   }
			   
			   
		   }
	   }
}

