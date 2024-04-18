package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/admin-login")
public class AdminLoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out= resp.getWriter();
		String Email=req.getParameter("email");
		String Password=req.getParameter("psw");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hyscaler","root","Pradeepta@4059");
			PreparedStatement ps= conn.prepareStatement("Select * from admin where Emaill=? and Password=?");
			
			ps.setString(1, Email);
			ps.setString(2, Password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				RequestDispatcher rd= req.getRequestDispatcher("/Admin.jsp");
				rd.include(req, resp);
			}
			else
			{
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'> Invalid Email or Password </h3>");
				RequestDispatcher rd= req.getRequestDispatcher("/Admin-Login.jsp");
				rd.include(req, resp);
			}
			conn.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'> "+e.getMessage()+" </h3>");
			RequestDispatcher rd= req.getRequestDispatcher("/Admin-Login.jsp");
			rd.include(req, resp);
			
		}
		
		
	}
	
	

}
