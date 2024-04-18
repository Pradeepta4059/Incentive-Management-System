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
<title>ADMINE</title>
<%@include file="All-CSS-JS.jsp" %>
       
</head>
<body>
<div class="topnav">
        <a class="active" href="Admin.jsp">Home</a>
        <a href="Add-Employee.jsp">Add-Employee</a>
        <a href="Holiday.jsp">Manage Holiday Pack</a>
        <a href="Admin-Login.jsp">Logout</a>
      </div>

<div class="container p-5">
<p class="text-center">All Employee</p>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Emp Id</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
      <th scope="col">Sales Target</th>
      <th scope="col">Achieved Target</th>
      <th scope="col">Incentive</th>
      <th scope="col">Bonus</th>
      <th scope="col">Holiday Pack</th>
      <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>
  
    <%
     EmployeeDAO dao=new EmployeeDAO(DBConnect.getConn());
     List<Employee> list=dao.getAllEmployee();
     for(Employee E:list)
     {%>
     
     
      <tr>
      <th scope="row"><%=E.getEmpId() %></th>
      <td><%=E.getName() %></</td>
      <td><%=E.getEmail() %></</td>
      <td><%=E.getPassword() %></td>
      <td><%=E.getSalesTarget() %></td>
      <td><%=E.getAchievedTarget() %></td>
      <td><%=E.getIncentive() %></td>
      <td><%=E.getBonus() %></td>
      <td>
          <%=E.getHPE() %>
          <%  String hpe=E.getHPE();
              if(hpe.equals("Yes"))
              {
            	%>  <a href="#hpe" class="btn btn-sm btn-success">View</a><%
              }
          
          %></td>
       <td><a href="Edit-Employee.jsp?EmpId=<%=E.getEmpId()%>" class="btn btn-sm btn-primary">Edit</a> 
           <a href="delete?EmpId=<%=E.getEmpId()%>" class="btn btn-sm btn-danger">Delete</a>
       </td>
    </tr>
    	 
     <%}
    
    
    %>
  
  
   
    
  </tbody>
</table>
</div>
    

   
    

</body>
</html>