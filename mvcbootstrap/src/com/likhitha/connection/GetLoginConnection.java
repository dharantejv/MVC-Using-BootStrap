package com.likhitha.connection;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetLoginConnection
{
	public static Connection createConnection()
	 {
	  Connection con = null;
	  String url = "jdbc:mysql://localhost:3306/example"; 
	  String username = "root"; 
	  String password = "12345";  
	  try 
	  {
	   try 
	   {
	   Class.forName("com.mysql.jdbc.Driver"); 
	   } 
	   catch (ClassNotFoundException e)
	   {
	   e.printStackTrace();
	   } 
	   con = DriverManager.getConnection(url, username, password); 
	  } 
	  catch (Exception e) 
	  {
	  e.printStackTrace();
	  }
	  return con; 
	 }
}
