package com.likhitha.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.likhitha.been.Loginbeen;
import com.likhitha.connection.GetLoginConnection;

public class LoginData 
{

	public String authenticateUser(Loginbeen loginbeen)
	  {
	   String Email = loginbeen.getEmail();
	   String password = loginbeen.getPassword();

	   Connection con = null;
	   Statement statement = null;
	   ResultSet resultSet = null;

	   String emailDB = "";
	   String passwordDB = "";

	   try
	   {
	    con = GetLoginConnection.createConnection(); 
	    statement = con.createStatement(); 
	    resultSet =statement.executeQuery("select email,password from duser"); 

	    while(resultSet.next()) 
	    {
	     emailDB = resultSet.getString("email"); 
	     passwordDB = resultSet.getString("password");

	      if(Email.equals(emailDB) && password.equals(passwordDB))
	      {
	      return "SUCCESS"; 
	      }
	    }
	   }
	    catch(SQLException e)
	    {
	    e.printStackTrace();
	    }
	    return "Invalid user credentials";    

}
	}
	

