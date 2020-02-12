<%@include file="header.jsp" %>
<p class="h2 text-center">ManageStock Exchanges</p>

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

<%@include file="footer.jsp" %>
