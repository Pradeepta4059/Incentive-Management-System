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

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

   
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
		
		String name=req.getParameter("Name");
		String email=req.getParameter("Email");
		String password=req.getParameter("Password");
		int salesT=Integer.parseInt(req.getParameter("SalesTarget"));
		int achievedT=Integer.parseInt(req.getParameter("AchievedTarget"));
		int Empid=Integer.parseInt(req.getParameter("EmpId"));
		
		Employee employe = new Employee(Empid,name,email,password,salesT,achievedT);
		EmployeeDAO dao= new EmployeeDAO(DBConnect.getConn());
		
		HttpSession session=req.getSession();
		
		boolean f=dao.updateEmployee(employe);
		if(f)
		{
			session.setAttribute("succMsg","Employee Details Updated Sucessfully.");
			resp.sendRedirect("Admin.jsp");
		}
		else {
			session.setAttribute("errorMsg","Somthing worng.");
			resp.sendRedirect("Edit-Employe.jsp");
		}
     }
	
}
