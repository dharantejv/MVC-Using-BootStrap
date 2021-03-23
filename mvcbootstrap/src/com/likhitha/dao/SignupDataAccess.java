package com.likhitha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.likhitha.been.Signupbeen;
import com.likhitha.connection.GetSignupConnection;

public class SignupDataAccess 
{

	public static String  signUpUser(Signupbeen signupbean)
	{
		String firstname=signupbean.getFirstname();
		String lastname=signupbean.getLastname();
		String email=signupbean.getEmail();
		String password=signupbean.getPassword();
		String repeatpassword=signupbean.getRepeatPassword();
		
		Connection con= null;
		String query=null;
		
		try
		{
			con=GetSignupConnection.getMySqlConnection();
			query=("insert into duser(firstname,lastname,email,password,repeatpassword) values(?,?,?,?,?);");
			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setString(1, firstname);
			preparedStatement.setString(2, lastname);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
			preparedStatement.setString(5, repeatpassword);
			
			int i=preparedStatement.executeUpdate();
			
			if(i!=0)
				return "SUCCESS";
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return "some thing went wrong..";
	}
	
}
