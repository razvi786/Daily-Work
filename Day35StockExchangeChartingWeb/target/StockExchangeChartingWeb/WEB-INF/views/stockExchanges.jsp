<%@include file="header.jsp" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="seUrl" value="/stock-exchange/save"/>

<div class="container">
  <div class="row">
    <div class="col-3"></div>
    <div class="col-6 p-3">
    
    <p class="h3 text-center">Manage Stock Exchanges</p>

<form:form action="${seUrl }" modelAttribute="se">

		<c:if test="${!empty se.name }">
     		<form:label path="id">Id:</form:label>
     		<form:input path="id" readonly="true" disabled="true" class="form-control"/>
     		<form:hidden path="id"/>
     	</c:if>

      <form:label path="name">Name:</form:label>
      <form:input class="form-control" path="name"/>

      <form:label path="brief">Brief:</form:label>
      <form:input class="form-control" path="brief" />

      <form:label path="address">Address:</form:label>
      <form:input class="form-control" path="address"/>
      
      <form:label path="remarks">Remarks:</form:label>
      <form:input class="form-control" path="remarks"/>

		<c:if test="${empty se.name }">
     		<input class="btn btn-block btn-outline-success mt-3" type="submit" value="Add Stock Exchange"/>
     	</c:if>
     	
     	<c:if test="${!empty se.name }">
     		<input class="btn btn-block btn-outline-warning mt-3" type="submit" value="Update Stock Exchange"/>
     	</c:if>

</form:form>

</div>
  </div>
</div>

<table class="table table-striped">
	<tr class="thead-dark">
		<th>Id</th>
		<th>Name</th>
		<th>Brief</th>
		<th>Address</th>
		<th>Remarks</th>
		<th>Actions</th>
	</tr>
	<c:forEach var="se" items="${list }">
		<tr>
			<td>${se.id }</td>
			<td>${se.name}</td>
			<td>${se.brief }</td>
			<td>${se.address }</td>
			<td>${se.remarks }</td>
			<td>
				<a href="<c:url value='/stock-exchange/remove/${se.id}'/>" class="btn btn-danger">Remove</a>
				<a href="<c:url value='/stock-exchange/update/${se.id}'/>" class="btn btn-warning">Update</a>
			</td>
		</tr>
	</c:forEach>
	
</table>

<%@include file="footer.jsp" %>
