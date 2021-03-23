<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="css/bootstrap.css" rel="stylesheet"  type="text/css"> 
  <script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/jquery.js"></script>
	 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>


<title>Login.com</title>
<style>
.container .form-group .form-control
{
border-radius: 50px;
}
.container .btn
{
border-radius: 50px;
}
.container .fb {
  background-color: #3B5998;
  color: white;
}
.container .google {
  background-color: #dd4b39;
  color: white;
}
</style>
</head>
<body>
<form  name="form" action="LoginUser" method="post">

<div class="container">
	<div class="container">
	<div><br></div>
<center><h2>Welcome back!</h2></center>

  <form>
  
  
    <div class="form-group mb-1">
      <label for="email"></label>
      <input type="email" class="form-control " id="email" placeholder="Enter the email address.." name="email">
    </div>
    
    
    <div class="form-group mb-1">
      <label for="pwd"></label>
      <input type="password" class="form-control" id="pwd" placeholder="Password" name="password">
    </div>
    
    
     <div class="custom-control custom-checkbox mb-3">
      <input type="checkbox" class="custom-control-input" id="customCheck" name="example1">
      <label class="custom-control-label" for="customCheck">Remember me</label>
   </div>
   
   
    <div> 
    <button type="submit" class="btn btn-primary btn-md btn-block">Submit</button>
    </div>
    
    
    <div><hr></div>
    
    
    <div> 
    <button type="submit" class="btn btn-danger btn-md btn-block">Login with Google</button>
    </div>
    <br>
    <div> 
    <button type="submit" class="btn btn-primary btn-md btn-block">Login with Facebook</button>
    </div>
    
    <div><hr></div>
    
    <center><a href="Signup.jsp">Forgot Password?</a></center>
    <center><a href="Signup.jsp">Create an account!</a></center>
    
  </form>
</div>
</div>
</form>
</body>
</html>