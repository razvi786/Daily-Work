<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url var="userUrl" value="/user/register" />
<form:form action="${userUrl}" modelAttribute="user">


	<h3 class="main text-center w-100">
		<strong>Register User</strong>
	</h3>
	<div class="form-group">
		<form:label path="username">Username</form:label>
		<form:input path="username" class="form-control"
			placeholder="Enter username" />
	</div>

	<div class="form-group">
		<label for="password">Password</label>
		<form:input type="password" class="form-control" path="password"
			placeholder="Enter password" />
	</div>

	<div class="form-group">
		<label for="confirm_password">Password</label>
		<input type="password" class="form-control" placeholder="Enter password" />
	</div>

	<button type="submit" class="btn btn-block btn-outline-success">Submit</button>

</form:form>

<%@include file="footer.jsp"%>