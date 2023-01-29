<%@ page import="com.cs425.web.model.Librarian" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Librarian Information</title>
</head>
<body>
	<%
		Librarian ob2 = (Librarian) request.getAttribute("Librarian");
		out.println(ob2);
	%>
</body>
</html>