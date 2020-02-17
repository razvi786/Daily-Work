<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url var="categoryUrl" value="/category/save" />
<form:form action="${categoryUrl}" modelAttribute="category">
<div class="row">
		<h5 class="main text-center w-100">
			<strong>Manage Categories</strong>
		</h5>
	</div>
	<div class="container justify-content-center">
		<c:if test="${!empty category.name }">
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
				<form:label path="name">Name</form:label>
			</div>
			<div class="col-sm-6">
				<form:input path="name" class="form-control"
					placeholder="Enter Name" />
			</div>
		</div>
	</div>
	<c:if test="${empty category.name }">
		<div class="row justify-content-center mt-3">
			<div class="col-sm-3">
				<button type="submit" class="btn btn-outline-success btn-block">Add</button>
			</div>
		</div>
	</c:if>
	<c:if test="${!empty category.name }">
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
				<th scope="col">Name</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="category" items="${list }">
				<tr>
					<td>${category.id }</td>
					<td>${category.name }</td>
					<c:url var="updateUrl" value="/category/update/${category.id}" />
					<c:url var="deleteUrl" value="/category/delete/${category.id}" />
					<td><button type="button" class="btn btn-primary"
							data-toggle="tooltip" data-placement="top" title="Edit"
							onclick="location.href='${updateUrl}'">
							<i class="fa fa-edit"></i>
						</button>
						<button type="button" class="btn btn-danger" data-toggle="tooltip"
							data-placement="top" title="Delete"
							onclick="location.href='${deleteUrl}'">
							<i class="fa fa-trash"></i>
						</button> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>