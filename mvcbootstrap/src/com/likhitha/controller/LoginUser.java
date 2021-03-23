package com.likhitha.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.likhitha.been.Loginbeen;
import com.likhitha.dao.LoginData;

/**
 * Servlet implementation class LoginUser
 */
@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUser() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String Email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Loginbeen loginbeen = new Loginbeen();
		
		loginbeen.setEmail(Email);
		loginbeen.setPassword(password);
		
		LoginData loginData = new LoginData();
		
		String validate = loginData.authenticateUser(loginbeen);
		
		
		 if(validate.equals("SUCCESS")) 
		   {
		    request.setAttribute("email", Email); 
		    request.getRequestDispatcher("/Success.jsp").forward(request, response);
		   }
		   else
		   {
		    request.setAttribute("errMessage", validate);   
		    request.getRequestDispatcher("/Failure.jsp").forward(request, response);
		   }
	}

		
	}


