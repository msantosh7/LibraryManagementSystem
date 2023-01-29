<%@ page import="com.cs425.web.model.Document" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Iterator"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>Book search</title>
</head>

<body>
<div class="formcs">
<h1>Search Documents</h1>
<div style="text-align: center">
	<table border="1">
	<tr>
		<th>Doc_Id</th>
		<th>Document Title</th>
	</tr>
	

	
<% ArrayList<Document> docList = (ArrayList) request.getAttribute("bookResult"); 
Iterator<Document> iterator = docList.iterator();
while(iterator.hasNext()) {
	Document doc3 = iterator.next(); //assign individual employee record to the employee class object
	%>
	<tr><td><%=doc3.getdocumentId()%></td>
		<td><%=doc3.getName()%></td>
	</tr>
	<%
}



%>
</table>
	
</div>
</div>
</body>

</html>