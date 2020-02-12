<%@include file="header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="userUrl" value="/user/save"/>

<div class="container">
  <div class="row">
    <div class="col-3"></div>
    <div class="col-6 p-3">
    
    <p class="h3 text-center">Manage Users</p>

<form:form action="${userUrl }" modelAttribute="user">

		<c:if test="${!empty user.username }">
			<form:label path="id">Id</form:label>
	      	<form:input class="form-control" path="id" readonly="true" disabled="true"/>
	      	<form:hidden path="id"/>
      </c:if>

      <form:label path="username">Username:</form:label>
      <form:input class="form-control" path="username" />

      <form:label path="password">Password:</form:label>
      <form:password class="form-control" path="password"/>

      <form:label path="email">Email:</form:label>
      <form:input class="form-control" path="email" />

      <form:label path="phone">Phone Number:</form:label>
      <form:input class="form-control" path="phone"/>

      <c:if test="${empty user.username }">
      		<input class="btn btn-block btn-outline-success mt-3" type="submit" value="Add User"/>
      </c:if>
      
      <c:if test="${!empty user.username }">
      		<input class="btn btn-block btn-outline-warning mt-3" type="submit" value="Update User"/>
      </c:if>

</form:form>

</div>
  </div>
</div>


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
		<th	>Actions</th>
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
			<td>
				<a class="btn btn-danger" href="<c:url value='/user/remove/${user.id }'/>">Remove</a>
				<a class="btn btn-warning" href="<c:url value='/user/update/${user.id }'/>">Update</a>
			</td>
		</tr>
	</c:forEach>
	
</table>

<%@include file="footer.jsp" %>

