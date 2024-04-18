<%@page import="com.dao.HolidayDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.HolidayPack"%>
<%@page import="com.conn.DBConnect"%>
<%@page import="com.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Holiday-Pack</title>
<%@include file="All-CSS-JS.jsp" %>
       
</head>
<body>
<div class="topnav">
        <a href="Admin.jsp">Home</a>
        <a href="Add-Employee.jsp">Add-Employee</a>
        <a class="active"href="#">Manage Holiday Pack</a>
        <a href="Admin-Login.jsp">Logout</a>
</div>

<div class="d-grid gap-2 d-md-flex justify-content-md-start" style="margin:30px 30px; ">

  <a class="btn btn-success me-md-2"  href="Add-Holiday.jsp">Add New Holiday Pack</a>
  
</div>

<div class="container p-5">
<p class="text-center">All Holiday Package Details</p>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Achieved Target</th>
      <th scope="col">Holiday Name</th>
      <th scope="col">Duration</th>
      <th scope="col">Destination</th>
      <th scope="col">Location</th>
      <th scope="col">Amenites</th>
      <th scope="col">Action</th>
      
      
    </tr>
  </thead>
  <tbody>
  
    <%
     HolidayDAO dao=new HolidayDAO(DBConnect.getConn());
     List<HolidayPack> list = dao.getAllHolidayPack();
     for(HolidayPack E:list)
     {%>
     
  
      <tr>
       <td><%=E.getSlNo() %></td>
       <td><%=E.getAchievedTarget() %></td>
       <td><%=E.getHolidayName() %></td>
       <td><%=E.getDuration() %></td>
       <td><%=E.getDestination() %></td>
       <td><%=E.getLocation() %></td>
       <td><%=E.getAmenities() %></td>
       <td><a href="Edit-Holiday.jsp?SlNo=<%=E.getSlNo()%>" class="btn btn-sm btn-primary">Edit</a> 
           <a href="deleteHP?SlNo=<%=E.getSlNo()%>" class="btn btn-sm btn-danger">Delete</a>
       </td>
    </tr>
    	 
          <%}
    
    
    %>
  
   
    
  </tbody>
</table>
</div>
    

   
    

</body>
</html>
 