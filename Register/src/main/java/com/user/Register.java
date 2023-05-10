package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//		getting all the incoming details from the request...
		
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String password = request.getParameter("user_password");
		
		out.println("<h1>"+name+"</h1>");
		out.println("<h1>"+email+"</h1>");
		out.println("<h1>"+password+"</h1>");
		
		//db connection................
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","root");
			
		//query.......................
			String q = "insert into user(name,password,email) values(?,?,?)";
			
			PreparedStatement stmt = con.prepareStatement(q);
			stmt.setString(1, name);
			stmt.setString(2,password);
			stmt.setString(3,email);
			
			stmt.executeUpdate();
			out.println("<h1> Done ..... </h1>");
			
		}catch(Exception e)
		{
			e.printStackTrace();
			out.println("<h1> Error ..... </h1>");
		}
		
		
		
		
	}

}
