<%@ page import="com.cs425.web.model.Document" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Iterator"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> <html lang="en">
<head>
<style>
.formcs{
display: block;
  margin-left: auto;
  margin-right: auto;
box-sizing: border-box;
  height: 100%;
  padding: 20px;
   border: 3px solid black;
  border-collapse: collapse;
  width: 80%;
  text-align: center;
  
}
.signin {
width: 30%;
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 10px 22px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 12px;
}
.signin2 {
width: 30%;
  background-color: #ff0000; /* Green */
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
  color: black;
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
p
{
	text-align:center;
	font-family:Monospace;
	color:blue;
}
h1
{
	 display: block;
  font-size: 2em;
  margin-top: 0.67em;
  margin-bottom: 0.67em;
  margin-left: 0;
  margin-right: 0;
  font-weight: bold;
}
h255
{
	text-align:center;
	font-family:Monospace;
	color:blue;
}
</style>	
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="formcs">

<h1 style="color:Tomato;">Document Details</h1>
<script type="text/javascript">

$(document).ready(function(){
    $('#showTextArea').click(function(){
    	 $('#myTextArea2').hide();
        $('#myTextArea').show();
    });
});
$(document).ready(function(){
    $('#showTextArea2').click(function(){
    	$('#myTextArea').hide();
        $('#myTextArea2').show();
    });
});
</script>

  

<div id="myTextArea" style="display: none;">
<p> Document has been borrowed </p>
</div>
<div id="myTextArea2" style="display: none;">
<p> Document has been returned</p>
</div>
<table border="1">
	
	<tr>
		<th style="text-align: center">Doc_Id</th>
		<th style="text-align: center">Document Title</th>
		<th style="text-align: center">Borrow/Return Document</th>
	</tr>
	

	
<% ArrayList<Document> docList = (ArrayList) request.getAttribute("bookResult"); 
Iterator<Document> iterator = docList.iterator();
while(iterator.hasNext()) {
	Document doc3 = iterator.next(); //assign individual employee record to the employee class object
	%>
	<tr><td><%=doc3.getdocumentId()%></td>
		<td><%=doc3.getName()%></td>
		<td>
<button onClick="borrowDoc()" value="Show TextArea" id="showTextArea" class="signin">Borrow</button>
<button onClick="returnDoc()" name="2" id="showTextArea2" class="signin2">Return</button>
</td>
	</tr>
	<%
}



%>
</table>
<!--  
<TABLE border="1" style="with: 80%"> 
<thead>
<tr>
<th>Document ID</th>
<th>Document Title</th>
<th>Borrow/Return Document</th>
</tr>
</thead>

<tbody>
<tr *ngFor = "let doc of docsList">
<td>{docID}</td>
<td>{book.title}</td>
<td>
<button onClick="borrowDoc()" value="Show TextArea" id="showTextArea" class="signin">Borrow</button>
<button onClick="returnDoc()" name="2" id="showTextArea2" class="signin2">Return</button>
</td>
</tr>
</tbody>
</table>-->
</div>
</body>
</html>