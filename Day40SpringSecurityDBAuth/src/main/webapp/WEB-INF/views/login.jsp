<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="document.loginForm.j_username.focus();">
	<h3>Custom Login Form</h3>
	<%
		String errorString = (String) request.getAttribute("error");
		if (errorString != null && errorString.trim().equals("true")) {
			out.println("<span class=\"errorblock\">Incorrect Login name or Password.</span>");
		}
	%>

	<form name="loginForm" action="<c:url value='login' />" method="POST">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username" value=""></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>\
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="Submit" /></td>
				<td><input name="reset" type="reset" value="Reset" /></td>
			</tr>
		</table>
	</form>
</body>
</html>