package com.likhitha.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.likhitha.been.Signupbeen;
import com.likhitha.dao.SignupDataAccess;


/**
 * Servlet implementation class SignupUser
 */
@WebServlet("/SignupUser")
public class SignupUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String Email=request.getParameter("email");
		String Password=request.getParameter("password");
		String Repeatpassword=request.getParameter("repeatpassword");

		Signupbeen signupbean= new Signupbeen();
		
		signupbean.setFirstname(firstName);
		signupbean.setLastname(lastName);
		signupbean.setEmail(Email);
		signupbean.setPassword(Password);
		signupbean.setRepeatpassword(Repeatpassword);
		
		SignupDataAccess signupDataAcces=new SignupDataAccess();
		
		String userRegistered=SignupDataAccess.signUpUser(signupbean);
		
		if(userRegistered.equals("SUCCESS"))
		{
		 request.getRequestDispatcher("/Succesful.jsp").forward(request, response);	
		}
		else
		{
			request.setAttribute("errorMessage", userRegistered);
			request.getRequestDispatcher("/Failure.jsp").forward(request, response);
		}
		
	}

}
