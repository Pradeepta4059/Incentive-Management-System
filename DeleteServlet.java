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



@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int EmpId=Integer.parseInt(req.getParameter("EmpId"));
		
		EmployeeDAO dao= new EmployeeDAO(DBConnect.getConn());
		
		

		HttpSession session = req.getSession();
		boolean f =dao.deleteEmployee(EmpId);
		
		if(f)
		{
			session.setAttribute("succMsg","Employee Details Updated Sucessfully.");
			resp.sendRedirect("Admin.jsp");
		}
		else {
			session.setAttribute("errorMsg","Somthing worng.");
			resp.sendRedirect("Admin.jsp");
		}
     
  	
		
	}
	//end
	

}
