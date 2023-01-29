<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.formcs{
display: block;
  margin-left: auto;
  margin-right: auto;
box-sizing: border-box;
  height: 90%;
  padding: 20px;
   border: 3px solid black;
  border-collapse: collapse;
  width: 50%;
  text-align: center;
  
}
.signin {
width: 50%;
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 10px 22px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 12px;
}
table {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
  border: 3px solid black;
  
}

td {
 border: 3px solid #ddd;
  padding-top: 12px;
  padding-bottom: 12px;
   text-align: center;
     font:  24px Georgia, serif;
   
}
tr:nth-child(even){background-color: powderblue;}

tr:hover {background-color: #ddd;}

th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color: powderblue;
  color: white;
   border: 3px solid black;
     font:  bold 24px Georgia, serif;
  }
input[type=submit] {
  padding: 14px 20px;
  color:black;
   text-align: center;
  border: 3;
  cursor: pointer;
  width: 100%;
  font: bold 14px Georgia, serif;
}
label,font
{
font: bold 20px Georgia, serif;
}

h1
{
	text-align:center;
	font-family:Monospace;
	color:black;
}
</style>

<meta charset="UTF-8">
<title>Add New Doc</title>
</head>
<div class="formcs">
<body>
	<div style="text-align: center">
	<h1>Add new Document</h1>
	<form method="post" action="newbookController">
	<label><b>Enter Doc ID</b></label>
	<input type="text" placeholder="Enter Doc ID" name="documentid" id="documentid" required>
	<br><br>
	<!--  <label><b>Enter Document Type</b></label>
	<input type="text" placeholder="Enter Doc type" name="documenttype" id="documenttype" required>
	<br><br>-->
	<label><b>Enter Doc name</b></label>
	<input type="text" placeholder="Enter Doc name" name="title" id="title" required>
	<br><br>
    <button type="submit" class="signin">Add Document</button>
	</form>
	</div>
</body>
</div>
</html>