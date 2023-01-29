<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>

<html>

<div align="center">
<head>
<meta charset="utf-8">

</head>
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
  background-color: red; /* Green */
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
<body>
<div class="formcs">

<form action="deleteuserController" method="post" >
<H1> User Deletion Page </H1>
<TABLE border="1" style="with: 80%"> 
         <TR>
            <TD>
                <label for="deletememberid">User Id:</label>
            </TD>
            <TD>
                <INPUT TYPE="text" NAME="deletememberid" SIZE="15" maxlength="8" value=" "  required  >
            </TD>
        </TR>
          
    </TABLE>    
    <br><br>                 
 <INPUT type="submit" name="submit" class="signin" value="Delete">
</form> 

</body>
</div>
</html>