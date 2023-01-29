<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>

.signin {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 10px 22px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 12px;
}
.formcs{
display: block;
  margin-left: auto;
  margin-right: auto;
box-sizing: border-box;
  height: 90%;
  padding: 20px;
   border: 3px solid black;
   font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 50%;
  text-align: center;
}


</style>
<meta charset="UTF-8">
<title>Librarian HomePage</title>
</head>
<body>
	<div style="text-align: center">
	<div class="formcs">
	<h1 style="background-color:powderblue;">Library Management System</h1>
	<div class="signup-image">
						<figure>
							<img src="images/libraryManagement.jpeg" alt="sing up image">
						</figure>
				
	</div>
	<h2 style="background-color:powderblue;">Librarian Home page</h2>
	
	<br><br>
	<br><br>
	
	<h3><a href="checkoverdue" action="/checkoverdue">Check Overdue</a>
	<br><br>
	<a href="newbook" action="/newbook">Add New Document</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	
	<a href="deletenewbook" action="/deletenewbook">Delete Document</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</h3>
	<h3>
	
	<form method="post" action="searchidController">
		<label><b>Document Id</b></label>
		<input type="text" name="bookId">  
		<button type="Submit" class="signin">Search </button>
	</form>
	<br><br>
	<h3><a href="addmember" action="/addmember">Add new Member</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	
	<a href="deletemember" action="/deletemember">Delete Member</a></h3>
	</div>
	</div>
</body>
</html>