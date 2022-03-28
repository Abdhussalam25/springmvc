<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

  <form:form action ="/validateUser" method="post">
	<div align="center">
		<table border="2" bordercolor="brown">
			<tr>
				<th colspan="2"> Login Form</th>
			</tr>
			<tr ><td> User Name</td><td><input type="text" name="userName"/></td></tr>
			<tr ><td> Password</td><td><input type="password" name="password"/></td></tr>
			<tr >
			<td colspan="2"><input type="submit" value="login"/> </td>
			<td colspan="2"><input type="reset" value="refresh"/> </td>
			</tr>
		
		</table>
		<div style="color:red"> ${error}</div>
		<div style="color:green"> ${msg}</div>
		
	</div>  
  
  </form:form>
</body>
</html>