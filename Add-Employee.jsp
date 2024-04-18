<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add-Employee</title>

<%@include file="All-CSS-JS.jsp" %>   
</head>
<body>
<div class="topnav">
        <a href="Admin.jsp">Home</a>
        <a class="active"href="#">Add-Employee</a>
        <a href="Holiday.jsp">Manage Holiday Pack</a>
        <a href="Admin-Login.jsp">Logout</a>
</div>
<div class="contener p-4">
   <div class="row">
     <div class="col-md-6 offset-md-3">
     <div class="card">
       <div class="card-body">
         <p class="fs-3 text-center"> Add New Employee</p>
         
         
       
        
         
         <!-- Input form -->
  <form action="register" method="post" id="Add-Emp" onsubmit="myFunction()">
   
  <div class="mb-3">
    <label class="form-label">Name</label>
    <input type="text" class="form-control" id="InputName"required name="Name">
  </div>      
    <div class="mb-3">
      <label class="form-label">Email address</label>
      <input type="email" class="form-control" id="InputEmail1" aria-describedby="emailHelp"required name="Email">
    </div>
  <div class="mb-3">
    <label  class="form-label">Password</label>
    <input type="text" class="form-control" id="InputPassword1"required name="Password">
  </div>
    <div class="mb-3">
       <label  class="form-label">Sales Target</label>
       <input type="text" class="form-control" id="InputSalesTarget"required name="SalesTarget">
    </div> 
  <div class="mb-3">
    <label  class="form-label">Achieved Target</label>
    <input type="text" class="form-control" id="InputAchievedTarget"required name="AchievedTarget">
  </div> 
   <div class="d-grid gap-2 col-6 mx-auto">
      <button type="submit" class="btn btn-success" >Register</button>
  
   </div>
</form >
        </div>
       </div>
     </div>
   </div>
</div>


</body>
</html>