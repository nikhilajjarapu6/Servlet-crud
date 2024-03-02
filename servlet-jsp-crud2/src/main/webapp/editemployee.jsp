<%@page import="com.jsp.employeedto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="getById" method="post">
	<h6>ENTER EMPLOYEE NUMBER TO UPDATE</h6>
	<input type="text" name="id"  >
	<input type="hidden" id="id" name="id" value="${currentId}">
	<input type="submit" value="search">
	
	</form>
</body>
</html>