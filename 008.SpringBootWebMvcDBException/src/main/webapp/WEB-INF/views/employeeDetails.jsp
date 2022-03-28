<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>

	
<table>

	<tr>
		<td><form:label path="empId">Employee Id:</form:label></td>
		<td>${empId}</td>
	</tr>
		<tr>
		<td><form:label path="empFirstName">Employee FirstName:</form:label></td>
		<td>${empFirstName}</td>
		</tr>
	<tr>
		<td><form:label path="empLastName">Employee LastName:</form:label></td>
		<td>${empLastName}</td>
	</tr>
	<tr>
		<td><form:label path="empSalary">Employee Salary:</form:label></td>
		<td>${empSalary}</td>
	</tr>
	
	<tr> <td colspan = "2"> 
	       <input type="button" value = "back to home" onClick = "history.go(-1)"/>  
		   <input type="button" value = "close me" onClick = "window.close()"/>


</table>

	

</body>
</html>