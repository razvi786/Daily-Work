<%@include file="header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="companyUrl" value="/company/save" />

<div class="container">
	<div class="row">
		<div class="col-3"></div>
		<div class="col-6 p-3">

			<p class="h3 text-center">Manage IPOs</p>

			<form:form action="" modelAttribute="">

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
