<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> <html lang="en">
<head>
<title>Bootstrap Example</title>	
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h2>Document Details</h2>
<div id="borrowDiv" style="display:none">borrow is successful</div>
<div id="returnDiv" style="display:none">return is successful</div>
<table class="table table-bordered">
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
<button onClick="borrowDoc()" class="btn btn-info">Borrow</button>
<button onClick="returnDoc()" class="btn btn-info" style="margin-left:10px">Return</button>
</td>
</tr>
</tbody>
</table>
</div>
<script>
function borrowDoc(){
var x=document.getElementById("borrowDiv");
if(x.style.display==="none"){
x.style.display="block";
}
}
function returnDoc(){
var y=document.getElementById("returnDiv");
if(y.style.display==="none"){
y.style.display="block";
}
}
</script>
</body>
</html>