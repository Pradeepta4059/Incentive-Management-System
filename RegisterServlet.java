package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conn.DBConnect;
import com.dao.EmployeeDAO;
import com.entity.Employee;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("Name");
		String email=req.getParameter("Email");
		String password=req.getParameter("Password");
		int salesT=Integer.parseInt(req.getParameter("SalesTarget"));
		int achievedT=Integer.parseInt(req.getParameter("AchievedTarget"));
		
		Employee employe=new Employee(name,email,password,salesT,achievedT);
		EmployeeDAO dao= new EmployeeDAO(DBConnect.getConn());
		
		HttpSession session=req.getSession();
		
		boolean f=dao.addEmployee(employe);
		if(f)
		{
			session.setAttribute("succMsg","Employee Details Inserted Sucessfully.");
			resp.sendRedirect("Add-Employee.jsp");
		}
		else {
			session.setAttribute("errorMsg","Somthing worng.");
			resp.sendRedirect("Add-Employee.jsp");
		}
	}

	
}
