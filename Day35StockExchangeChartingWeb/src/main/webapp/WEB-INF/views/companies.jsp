<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="companyUrl" value="/company/save" />

<div class="container">
	<div class="row">
		<div class="col-3"></div>
		<div class="col-6 p-3">

			<p class="h3 text-center">Manage Companies</p>

			<form:form action="${companyUrl }" modelAttribute="company">

				<c:if test="${!empty company.name }">
					<form:label path="id">Id:</form:label>
					<form:input class="form-control" path="id" readonly="true"
						disabled="true" />
						<form:hidden path="id"/>
				</c:if>

				<form:label path="name">Name:</form:label>
				<form:input class="form-control" path="name" />

				<form:label path="turnover">Turnover:</form:label>
				<form:input class="form-control" path="turnover" />

				<form:label path="ceo">CEO:</form:label>
				<form:input class="form-control" path="ceo" />

				<form:label path="sector">Sector:</form:label>
				<form:input class="form-control" path="sector" />

				<form:label path="brief">Brief:</form:label>
				<form:input class="form-control" path="brief" />

				<form:label path="stock_code">Stock Code:</form:label>
				<form:input class="form-control" path="stock_code" />

				<c:if test="${empty company.name }">
					<input class="btn btn-block btn-outline-success mt-3" type="submit"
						value="Add Company" />
				</c:if>

				<c:if test="${!empty company.name }">
					<input class="btn btn-block btn-outline-warning mt-3" type="submit"
						value="Update Company" />
				</c:if>

			</form:form>

		</div>
	</div>
</div>

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
		<th>Actions</th>
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
			<td>
				<a class="btn btn-danger" href="<c:url value='/company/remove/${company.id }'/>">Remove</a>
				<a class="btn btn-warning" href="<c:url value='/company/update/${company.id }'/>">Update</a>
			</td>
		</tr>
	</c:forEach>

</table>

<%@include file="footer.jsp"%>
