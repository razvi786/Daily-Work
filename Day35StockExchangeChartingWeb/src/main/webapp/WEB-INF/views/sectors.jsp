<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="sectorUrl" value="/sector/save" />

<div class="container">
	<div class="row">
		<div class="col-3"></div>
		<div class="col-6 p-3">

			<p class="h3 text-center">Manage Sectors</p>

			<form:form action="${sectorUrl }" modelAttribute="sector">

				<c:if test="${!empty sector.name }">
					<form:label path="id">Id:</form:label>
					<form:input path="id" class="form-control" readonly="true"
						disabled="true" />
					<form:hidden path="id" />
				</c:if>

				<form:label path="name">Name:</form:label>
				<form:input path="name" class="form-control" />

				<form:label path="brief">Brief:</form:label>
				<form:input path="brief" class="form-control" />

				<c:if test="${empty sector.name }">
					<input class="btn btn-block btn-outline-success mt-3" type="submit"
						value="Add Sector">
				</c:if>

				<c:if test="${!empty sector.name }">
					<input class="btn btn-block btn-outline-warning mt-3" type="submit"
						value="Update sector" />
				</c:if>

			</form:form>

		</div>
	</div>
</div>

<table class="table table-striped">
	<thead class="thead-dark">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Brief</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="sector" items="${list }">
			<tr>
				<td>${sector.id }</td>
				<td>${sector.name }</td>
				<td>${sector.brief }</td>
				<td><a class="btn btn-danger"
					href="<c:url value='/sector/remove/${sector.id}'/>">Remove</a> <a
					class="btn btn-warning"
					href="<c:url value='/sector/update/${sector.id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>


<%@include file="footer.jsp"%>