<%@page import="com.entity.HolidayPack"%>
<%@page import="com.dao.HolidayDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.Employee"%>
<%@page import="com.conn.DBConnect"%>
<%@page import="com.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"  
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<%@include file="All-CSS-JS.jsp" %>      
<link href="Login.css" rel="stylesheet">      
</head>
<body>


    <div class="topnav">
        <a class="active" href="#home">Employee Profile</a>
        
        <a href="#contact">Contact</a>
        <a href="Employee-Login.jsp">Logout</a>
    </div>
 <div class="container p-5">
<p class="text-center">Your Details</p>
      
         

    
<table class="table">
  <thead>
    <tr>
      <th scope="col">EmpId</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
      <th scope="col">SalesTarget</th>
      <th scope="col">AchievedTarget</th>
      <th scope="col">Incentive</th>
      <th scope="col">Bonus</th>
      <th scope="col">HolidayPack</th>
      
      
    </tr>
  </thead>
  <tbody>
  
   <%
           String Email =(String)session.getAttribute("email");
           String Password =(String)session.getAttribute("pass");
           EmployeeDAO dao= new EmployeeDAO(DBConnect.getConn());
           List<Employee> list=dao.getEmpByEmailPassword(Email,Password);
           boolean view=false;
           
           for(Employee E:list)
           {%>
     
    <tr>
      <td scope="col"><%=E.getEmpId() %></td>
      <td scope="col"><%=E.getName() %></td>
      <td scope="col"><%=E.getEmail() %></td>
      <td scope="col"><%=E.getPassword() %></td>
      <td scope="col"><%=E.getSalesTarget() %></td>
      <td scope="col"><%=E.getAchievedTarget() %></td>
      <td scope="col"><%=E.getIncentive() %></td>
      <td scope="col"><%=E.getBonus() %></td>
      <td scope="col"><%=E.getHPE()%></td>
      <%  String hpe=E.getHPE();
              if(hpe.equals("Yes"))
              {
            	view=true;
              }
          
          %>
      
    </tr>
   
    	     <%}
    
    
    %>
    	 
  </tbody>
  
</table>
  
           
           
  <% if(view){%>
  
  
            	  </div>

            	  <hr>
            	  <div class="container p-5">
            	  <p class="text-center" >Your Holiday Package Details</p>
            	  <table class="table">
            	    <thead>
            	      <tr>
            	        <th scope="col">SL_No</th>
            	        <th scope="col">Achieved Target</th>
            	        <th scope="col">Holiday Name</th>
            	        <th scope="col">Duration</th>
            	        <th scope="col">Destination</th>
            	        <th scope="col">Location</th>
            	        <th scope="col">Amenites</th>
            	
            	        
            	      </tr>
            	    </thead>
            	    <tbody>
            	    
        <%
         	HolidayDAO dao1=new HolidayDAO(DBConnect.getConn());
         	List<HolidayPack> list1 = dao1.getHolidayPackByAt(60000);
         	for(HolidayPack E1:list1)
     
     {%>
     
  
      <tr>
       <td><%=E1.getSlNo() %></td>
       <td><%=E1.getAchievedTarget() %></td>
       <td><%=E1.getHolidayName() %></td>
       <td><%=E1.getDuration() %></td>
       <td><%=E1.getDestination() %></td>
       <td><%=E1.getLocation() %></td>
       <td><%=E1.getAmenities() %></td>
       
    </tr>
    	 
          <%}  %>	 
            	       
         
            	      
            	    </tbody>
            	  </table>
            	  
            	  
            	  </div>  <%} %>
         
          
      
    
    



</body>
</html>