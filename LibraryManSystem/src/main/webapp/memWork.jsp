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

</head>
<body>
	<div style="text-align: center">
	<div class="formcs">
	<h1 style="background-color:powderblue;">Library Management System</h1>
	<div class="signup-image">
						<figure>
							<img src="images/memberhome.png" alt="sing up image">
						</figure>
				
	</div>
	<h2 style="background-color:powderblue;">Member Home page</h2>
	
	<br><br>
	<form method="post" action="searchidController">
		<label><b>Search with Document Id</b></label>
		<input type="text" name="bookId">  
		<button type="Submit" class="signin">Search </button>
		
	</form>
	<br><br>
	<form method="post" action="searchtitleController">
	<label><b>Search with Document Title</b></label>
		<input type="text" name="bookTitle">  
		<button type="Submit" class="signin">Search </button>
		</form>
		<br><br>
	</div>
	</div>
</body>
</html>