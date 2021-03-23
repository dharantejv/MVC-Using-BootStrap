<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>       
<head>
<meta charset="ISO-8859-1" >

<link href="css/bootstrap.css" rel="stylesheet"  type="text/css">
 
  <script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/jquery.js"></script>
	 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  
<title>Signup.com</title>

<style> 

.container .row .form-control
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
.container .form-group  .form-control
{
color:#ff0000;
background-color: #ffffff;
}
</style>

</head>
<body>
<form  name="form" action="SignupUser" method="post">

<div class="container">
	<div class="container">
	<div><br></div>
<center><h2>Create an Account!</h2></center>
<div><br></div>
  <form>
  
  
   <div class="row  mb-3">
    <div class="col">
      <input type="text" class="form-control"  placeholder="First name" name="firstname" required>
    </div>
    <div class="col">
      <input type="text" class="form-control" placeholder="Last name" name="lastname" required>
    </div>
 	 </div>
  
     <div class="row mb-3">
    <div class="col"> 
      <input type="text" class="form-control"  placeholder="Enter the Email address.." name="email" required>
    </div>
    </div>
    
    <div class="row mb-3">
    <div class="col">
      <input type="password" class="form-control"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"  title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters"  placeholder="Password" name="password" required>
    </div>
    <div class="col">
      <input type="password" class="form-control" placeholder="Repeat Password" name="repeatpassword">
    </div>
 	 </div>
    
    <div> 
    <button type="submit" class="btn btn-primary btn-md btn-block">Register Account</button>
    </div>
    
    
    <div><hr></div>
    
    
    <div> 
    <button type="submit" class="btn btn-danger btn-md btn-block">Register with Google</button>
    </div>
    <br>
    <div> 
    <button type="submit" class="btn btn-primary btn-md btn-block">Register with Facebook</button>
    </div>
    
    <div><hr></div>
    
    <center><a href="Signup.jsp">Forgot Password?</a></center>
    <center><a href="LoginForm.jsp">Already have an account?Login!</a></center>
   
    
  </form>
</div>
</div>
</form>
</body>
</html>