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




@WebServlet("/updateHoliday")
public class UpdateHolidayServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int achievedT=Integer.parseInt(req.getParameter("AchievedTarget"));
		String hName=req.getParameter("HolidayName");
		String dur=req.getParameter("Duration"); 
		String des=req.getParameter("Destination");
		String Loc=req.getParameter("Location");
		String Ame=req.getParameter("Amenities");
	    int SlNo=Integer.parseInt(req.getParameter("SlNo"));
		
		HolidayPack holiday = new HolidayPack(SlNo,achievedT,hName,dur,des,Loc,Ame);
		HolidayDAO dao= new HolidayDAO(DBConnect.getConn());
		
		HttpSession session=req.getSession();
		
		boolean f=dao.updateHolidayPack(holiday);
		if(f)
		{
			session.setAttribute("succMsg","Employee Details Updated Sucessfully.");
			resp.sendRedirect("Holiday.jsp");
		}
		else {
			session.setAttribute("errorMsg","Somthing worng.");
			resp.sendRedirect("Edit-Employe.jsp");
		}
     }
		
		
		
}
	
	


