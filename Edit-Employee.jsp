<%@page import="com.entity.Employee"%>
<%@page import="com.conn.DBConnect"%>
<%@page import="com.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
<%@include file="All-CSS-JS.jsp" %>
</head>
<body>
<div class="topnav">
        <a href="Admin.jsp">Home</a>
        <a class="active"href="#">Add-Employee</a>
        <a href="Holiday.jsp">Manage Holiday Pack</a>
        <a href="Admin-Login.jsp">Logout</a>
</div>


<div class="contener p-5">
   <div class="row">
     <div class="col-md-5 offset-md-3">
     <div class="card">
       <div class="card-body">
         <p class="fs-3 text-center"> Edit Employee</p>
         <!-- Input form -->
         
         <%
           int EmpId =Integer.parseInt(request.getParameter("EmpId"));
           EmployeeDAO dao= new EmployeeDAO(DBConnect.getConn());
           Employee E=dao.getEmpById(EmpId);
           
         %>
         
         
         <form action="update" method="post" onsubmit="myFunction()">
  <div class="mb-3">
    <label class="form-label">Name</label>
    <input type="text" value="<%=E.getName() %>" class="form-control" id="InputName" name="Name">
  </div>      
  <div class="mb-3">
    <label class="form-label">Email address</label>
    <input type="email" value="<%=E.getEmail() %>" class="form-control" id="InputEmail1" aria-describedby="emailHelp" name="Email">
  </div>
  <div class="mb-3">
    <label  class="form-label">Password</label>
    <input type="text" value="<%=E.getPassword() %>" class="form-control" id="InputPassword1" name="Password">
  </div>
  <div class="mb-3">
    <label  class="form-label">Sales Target</label>
    <input type="text" value="<%=E.getSalesTarget() %>" class="form-control" id="InputSalesTarget" name="SalesTarget">
  </div> 
  <div class="mb-3">
    <label  class="form-label">Achieved Target</label>
    <input type="text" value="<%=E.getAchievedTarget() %>" class="form-control" id="InputAchievedTarget" name="AchievedTarget">
  </div> 
   <input type="hidden" name="EmpId" value="<%=E.getEmpId() %>" >
  <div class="d-grid gap-2 col-6 mx-auto">
  <button type="submit" class="btn btn-warning">Update</button>
  </div>
</form>
        </div>
       </div>
     </div>
   </div>
</div>



</body>
</html>