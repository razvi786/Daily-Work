<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url var="productUrl" value="/product/save" />
<form:form action="${productUrl}" modelAttribute="product">
	<div class="row">
		<h5 class="main text-center w-100">
			<strong>Manage Products</strong>
		</h5>
	</div>
	<div class="container justify-content-center">
		<c:if test="${!empty product.name }">
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
		
		<div class="row my-1">
			<div class="col-sm-3">
				<form:label path="price">Price</form:label>
			</div>
			<div class="col-sm-6">
				<form:input class="form-control" path="price"
					placeholder="Price"/>
			</div>
		</div>
		
		<div class="row my-1">
			<div class="col-sm-3">
				<form:label path="quantity">Quantity</form:label>
			</div>
			<div class="col-sm-6">
				<form:input type="number" class="form-control" path="quantity"
					placeholder="Quantity"/>
			</div>
		</div>
		
		<div class="row my-1">
			<div class="col-sm-3">
				<form:label path="specification">Specification</form:label>
			</div>
			<div class="col-sm-6">
					<form:textarea path="specification" class="form-control"
					placeholder="Specification" rows="3"/>
			</div>
		</div>

		<div class="row my-1">
			<div class="col-sm-3">
				<form:label path="rating">Rating</form:label>
			</div>
			<div class="col-sm-6">
				<form:input type="number" class="form-control" path="rating" min="1" max="10"
					placeholder="Rating" />
			</div>
		</div>
		<div class="row my-1">
			<div class="col-sm-3">
				<form:label path="image">Image</form:label>
			</div>
			<div class="col-sm-6">
					<form:input path="image" class="form-control"
					placeholder="Image" value="/resources/assets/images/default.png"/>
			</div>
		</div>
		<c:if test="${empty product.name }">
			<div class="row justify-content-center mt-3">
				<div class="col-sm-3">
					<button type="submit" class="btn btn-outline-success btn-block">Add</button>
				</div>
			</div>
		</c:if>
		<c:if test="${!empty product.name }">
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
				<th scope="col">Price</th>
				<th scope="col">Quantity</th>
				<th scope="col">Specification</th>
				<th scope="col">Rating</th>
				<th scope="col">Image</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${list }">
				<tr>
					<td>${product.id }</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>${product.quantity}</td>
					<td>${product.specification}</td>
					<td>${product.rating}</td>
					<td>${product.image}</td>
					<c:url var="updateUrl" value="/product/update/${product.id}" />
					<c:url var="deleteUrl" value="/product/delete/${product.id}" />
					<td><button type="button" class="btn btn-primary"
							data-toggle="tooltip" data-placement="top" title="Edit"
							onclick="location.href='${updateUrl}'">
							<i class="fa fa-edit"></i>
						</button>
						<button type="button" class="btn btn-danger" data-toggle="tooltip"
							data-placement="top" title="Delete"
							onclick="location.href='${deleteUrl}'">
							<i class="fa fa-trash"></i>
						</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>