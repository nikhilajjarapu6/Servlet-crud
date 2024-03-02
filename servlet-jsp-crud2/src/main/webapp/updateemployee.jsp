<%@page import="com.jsp.employeedto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% Employee emp=(Employee)(request.getAttribute("getemployee")); %>
<form action="updateServlet" method="post">
	ID: <input type="text" name="id"value=<%= emp.getId()%> readonly="readonly">
	NAME: <input type="text" name="name" value=<%= emp.getName() %>><br>
	EMAIL: <input type="email" name="email"value=<%= emp.getEmail() %>><br>
	PASSWORD: <input type="password" name="password" value=<%= emp.getPassword() %>><br>
	SALARY: <input type="text"  name="sal"value=<%= emp.getSal() %>><br>
	<input type="submit" name="update"><br>
	
	
	
	
	</form>
</body>
</html>