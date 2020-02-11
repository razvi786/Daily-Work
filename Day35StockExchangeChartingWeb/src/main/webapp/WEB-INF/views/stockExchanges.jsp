<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<p class="h2 text-center">Stock Exchanges</p>
<table class="table table-striped">
	<tr class="thead-dark">
		<th>Id</th>
		<th>Name</th>
		<th>Brief</th>
		<th>Address</th>
		<th>Remarks</th>
	</tr>
	<c:forEach var="se" items="${list }">
		<tr>
			<td>${se.id }</td>
			<td>${se.name}</td>
			<td>${se.brief }</td>
			<td>${se.address }</td>
			<td>${se.remarks }</td>
		</tr>
	</c:forEach>
	
</table>

</body>
</html>
