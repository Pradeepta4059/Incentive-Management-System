<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login as Employee</title>
<%@include file="All-CSS-JS.jsp" %>
</head>
<body>
      
<div class="main-container">
<h2>Employee Login</h2>

<form action="Emp-Login" method="post" >

  <div class="imgcontainer">
    <img src="https://static2.bigstockphoto.com/0/2/2/large2/220572721.jpg" alt="Avatar"class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Your Email" name="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
        
    <button type="submit">Login</button>
    <a href="Admin-Login.jsp" class="btn btn-primary">Login as Admin </a>
    
  </div> 

  
</form>
</div>

</body>
</html>