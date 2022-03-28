<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page language = "java" errorPage = "exception.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
<h3><center>Employee Form Data</center></h3>

<form:form action="addEmployee" method="post" modelAttribute = "employee">
<table>

	<tr>
		<td><form:label path="empId">Employee Id:</form:label></td>
		<td><form:input path="empId" type="text" name="empId"/>
	</tr>
		<tr>
		<td><form:label path="empFirstName">Employee FirstName:</form:label></td>
		<td><form:input path="empFirstName" type="text" name="empFirstName"/>
	</tr>
	<tr>
		<td><form:label path="empLastName">Employee LastName:</form:label></td>
		<td><form:input path="empLastName" type="text" name = "empLastName"/>
	</tr>
	<tr>
		<td><form:label path="empSalary">Employee Salary:</form:label></td>
		<td><form:input path="empSalary" type="text" name = "empSalary"/>
	</tr>
	
	<tr> <td colspan = "2"> 
	       <input type="submit" value = "Submit"/>  
		   <input type="reset" value = "Reset"/>


</table>
</form:form>

</body>
</html>