<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add-Holiday-Pack</title>
<%@include file="All-CSS-JS.jsp" %>
       
</head>
<body>
<div class="topnav">
        <a href="Admin.jsp">Home</a>
        <a href="Add-Employee.jsp">Add-Employee</a>
        <a class="active"href="Holiday.jsp">Manage Holiday Pack</a>
        <a href="Admin-Login.jsp">Logout</a>
</div>

<div class="contener p-4">
   <div class="row">
     <div class="col-md-6 offset-md-3">
     <div class="card">
       <div class="card-body">
         <p class="fs-3 text-center"> Add New Holiday Pack</p>
         
         
       
        
         
         <!-- Input form -->
  <form action="Add-holiday" method="post" id="Add-Emp" onsubmit="holidayAdd();">
   
  <div class="mb-3">
    <label class="form-label">AchievedTarget</label>
    <input type="text" class="form-control" required name="AchievedTarget">
  </div>      
    <div class="mb-3">
      <label class="form-label">Holiday Name</label>
      <input type="text" class="form-control"required name="HolidayName">
    </div>
  <div class="mb-3">
    <label  class="form-label">Duration</label>
    <input type="text" class="form-control" required name="Duration">
  </div>
    <div class="mb-3">
       <label  class="form-label">Destination</label>
       <input type="text" class="form-control" required name="Destination">
    </div> 
  <div class="mb-3">
    <label  class="form-label">Location</label>
    <input type="text" class="form-control" required name="Location">
  </div> 
  <div class="mb-3">
    <label  class="form-label">Amenities</label>
    <input type="text" class="form-control" required name="Amenities">
  </div>
   <div class="d-grid gap-2 col-6 mx-auto">
      <button type="submit" class="btn btn-success" >ADD</button>
  
   </div>
</form >
        </div>
       </div>
     </div>
   </div>
</div>

    

   
    

</body>
</html>
 