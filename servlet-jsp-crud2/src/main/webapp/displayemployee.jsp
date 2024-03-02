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
	<% List<Employee> li= (List<Employee>)(request.getAttribute("display")); %>	
	<table style="border-collapse:collapse;" border="1px solid blue" ;>
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>EMAIL</th>
		<th>PASSWORD</th>
		<th>SALARY	</th>
	</tr>
		<%for(Employee emp:li) {%>
		<tr>
		<td><%=emp.getId()%></td>
		<td><%=emp.getName()%></td>
		<td><%=emp.getEmail() %></td>
		<td><%=emp.getPassword() %></td>
		<td><%=emp.getSal()%></td>
		
		<td><a href="removeemployee.jsp"> <button>remove</button> </a> </td>
		<td><a href="editemployee.jsp"> <button>edit</button> </a> </td>
		
		
		
		
		</tr>
		
		
		
		<% }%>
	
	
	
	
	
	
	
	
	
	
	
	
	</table>

</body>
</html>