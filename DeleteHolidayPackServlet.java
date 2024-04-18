package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conn.DBConnect;
import com.dao.HolidayDAO;




@WebServlet("/deleteHP")
public class DeleteHolidayPackServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
        int SlNo=Integer.parseInt(req.getParameter("SlNo"));
		
		HolidayDAO dao= new HolidayDAO(DBConnect.getConn());
		
		

		HttpSession session = req.getSession();
		boolean f =dao.deleteHolidayPack(SlNo);
		
		if(f)
		{
			session.setAttribute("succMsg","Employee Details Updated Sucessfully.");
			resp.sendRedirect("Holiday.jsp");
		}
		else {
			session.setAttribute("errorMsg","Somthing worng.");
			resp.sendRedirect("Holiday.jsp");
		}
		
	}
	
	

}
