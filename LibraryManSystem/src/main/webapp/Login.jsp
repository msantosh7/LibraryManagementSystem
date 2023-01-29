<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Librarian Login</title>
</head>
<style>

.signin {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}
.formcs{
display: block;
  margin-left: auto;
  margin-right: auto;
box-sizing: border-box;
  height: 90%;
  padding: 50px;
   border: 3px solid black;
   font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 25%;
  text-align: center;
}


</style>
<body>
<div class="formcs">
	<div style="text-align: center">
	<h1 >Librarian login</h1>
	<div class="signup-image">
						<figure>
							<img src="images/finallibrarian.png" alt="sing up image">
						</figure>
				
	</div>
	<form method="post" action="loginController" >
		<label><b>User Id</b></label>
		<input type="text" name="uId">  
		<br><br>
		<label><b>Password</b></label>
		<input type="Password" name="uPass">
		<br><br>
		<button type="Submit" class="signin">Login</button>
	</form>
	</div>
	</div>
</body>
</html>