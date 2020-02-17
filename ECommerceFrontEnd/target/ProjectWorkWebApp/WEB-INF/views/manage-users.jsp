<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url var="userUrl" value="/user/save" />
<form:form action="${userUrl}" modelAttribute="user">
	<div class="row">
		<h5 class="main text-center w-100">
			<strong>Manage Users</strong>
		</h5>
	</div>
	<div class="container justify-content-center">
		<c:if test="${!empty user.username }">
			<div class="row my-1">
				<div class="col-sm-3">
					<form:label path="id">ID</form:label>
				</div>
				<div class="col-sm-6">
					<form:input type="number" class="form-control" path="id"
						placeholder="id" readonly="true" disabled="true" />
				</div>
				<form:hidden path="id" />
			</div>
		</c:if>
		<div class="row my-1">
			<div class="col-sm-3">
				<form:label path="username">Username</form:label>
			</div>
			<div class="col-sm-6">
				<form:input path="username" class="form-control"
					placeholder="Enter username" />
			</div>
		</div>
		<div class="row my-1">
			<div class="col-sm-3">
				<form:label path="password">Password</form:label>
			</div>
			<div class="col-sm-6">
				<form:input type="password" class="form-control" path="password"
					placeholder="Enter password" />
			</div>
		</div>
	</div>
	<c:if test="${empty user.username }">
		<div class="row justify-content-center mt-3">
			<div class="col-sm-3">
				<button type="submit" class="btn btn-outline-success btn-block">Add</button>
			</div>
		</div>
	</c:if>
	<c:if test="${!empty user.username }">
		<div class="row justify-content-center mt-3">
			<div class="col-sm-3">
				<button type="submit" class="btn btn-outline-warning btn-block">Update</button>
			</div>
		</div>
	</c:if>
</form:form>
<hr>
<div>
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Username</th>
				<th scope="col">Password</th>
				<th scope="col">Confirmed</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${list }">
				<tr>
					<td>${user.id }</td>
					<td>${user.username }</td>
					<td>${user.password}</td>
					<td>${user.confirmed }</td>
					<c:url var="updateUrl" value="/user/update/${user.id}" />
					<c:url var="deleteUrl" value="/user/delete/${user.id}" />
					<c:url var="activateUrl" value="/user/activate/${user.id}" />
					<c:url var="deactivateUrl" value="/user/deactivate/${user.id}" />
					<td><button type="button" class="btn btn-primary"
							data-toggle="tooltip" data-placement="top" title="Edit"
							onclick="location.href='${updateUrl}'">
							<i class="fa fa-edit"></i>
						</button>
						<button type="button" class="btn btn-danger" data-toggle="tooltip"
							data-placement="top" title="Delete"
							onclick="location.href='${deleteUrl}'">
							<i class="fa fa-trash"></i>
						</button> <c:if test="${!user.confirmed }">
							<button type="button" class="btn btn-warning"
								data-toggle="tooltip" data-placement="top" title="Activate"
								onclick="location.href='${activateUrl}'">
								<i class="fa fa-check"></i>
							</button>
						</c:if> <c:if test="${user.confirmed }">
							<button type="button" class="btn btn-danger"
								data-toggle="tooltip" data-placement="top" title="Deactivate"
								onclick="location.href='${deactivateUrl}'">
								<i class="fa fa-times"></i>
							</button>
						</c:if></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>