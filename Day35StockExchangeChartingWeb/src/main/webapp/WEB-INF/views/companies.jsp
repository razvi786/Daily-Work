<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<p class="h2 text-center">Companies</p>
<table class="table table-striped">
	<tr class="thead-dark">
		<th>Id</th>
		<th>Company Name</th>
		<th>Turnover</th>
		<th>CEO</th>
		<th>Sector</th>
		<th>Brief</th>
		<th>Stock Code</th>
		<th>Activated</th>
	</tr>
	<c:forEach var="company" items="${list }">
		<tr>
			<td>${company.id }</td>
			<td>${company.name}</td>
			<td>${company.turnover }</td>
			<td>${company.ceo }</td>
			<td>${company.sector }</td>
			<td>${company.brief }</td>
			<td>${company.stock_code }</td>
			<td>${company.activated }</td>
		</tr>
	</c:forEach>
	
</table>

</body>
</html>
