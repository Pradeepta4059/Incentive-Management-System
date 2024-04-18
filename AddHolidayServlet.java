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
import com.entity.HolidayPack;


@WebServlet("/Add-holiday")
public class AddHolidayServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		int achievedT=Integer.parseInt(req.getParameter("AchievedTarget"));
		String name=req.getParameter("HolidayName");
		String duration=req.getParameter("Duration");
		String destination=req.getParameter("Destination");
		String location=req.getParameter("Location");
		String ameniti=req.getParameter("Amenities");

		
		
		
		HolidayPack holiday=new HolidayPack(achievedT,name,duration,destination,location,ameniti);
		HolidayDAO dao= new HolidayDAO(DBConnect.getConn());
		
		HttpSession session=req.getSession();
		
		boolean f=dao.addHolidayPack(holiday);
		if(f)
		{
			session.setAttribute("succMsg","Holiday Details Inserted Sucessfully.");
			resp.sendRedirect("Add-Holiday.jsp");
		}
		else {
			session.setAttribute("errorMsg","Somthing worng.");
			resp.sendRedirect("Add-Holiday.jsp");
		}
	}

	
}
