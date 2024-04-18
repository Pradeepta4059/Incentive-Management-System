<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login as Admin</title>
<%@include file="All-CSS-JS.jsp" %>
</head>
<body>


<div class="main-container">
<h2>Admin Login</h2>

<form action="admin-login" method="post">


  <div class="imgcontainer">
    <img src="https://cdn.vectorstock.com/i/preview-1x/52/38/avatar-icon-vector-11835238.webp" alt="Avatar"class="avatar">
  </div>

  <div class="container">
  
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Your Email" name="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
        
    <button type="submit">Login</button>
    <a href="Employee-Login.jsp" class="btn btn-primary">Login as Employee </a>
    
  </div> 

  
    
</form>
</div>

</body>
</html>
