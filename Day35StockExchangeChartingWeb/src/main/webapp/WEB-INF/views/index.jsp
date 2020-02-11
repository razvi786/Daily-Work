<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h2>Hello World!</h2>
<hr>
${message}
<hr>

<%-- <ol>
<c:forEach var="name" items="${list}">
	<li>${name }</li>
</c:forEach>
</ol> --%>


<table class="table table-striped">
	<tr class="">
		<th>Id</th>
		<th>Username</th>
		<th>Password</th>
		<th>Email</th>
		<th>Phone</th>
		<th>Admin</th>
		<th>Confirmed</th>
		<th>Code</th>
	</tr>
	<c:forEach var="user" items="${list }">
		<tr>
			<td>${user.id }</td>
			<td>${user.username }</td>
			<td>${user.password }</td>
			<td>${user.email }</td>
			<td>${user.phone }</td>
			<td>${user.admin }</td>
			<td>${user.confirmed }</td>
			<td>${user.code }</td>
		</tr>
	</c:forEach>
	
</table>

</body>
</html>
