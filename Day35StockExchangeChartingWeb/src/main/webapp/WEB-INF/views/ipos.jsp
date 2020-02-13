<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="ipoUrl" value="/ipo/save" />

<div class="container">
	<div class="row">
		<div class="col-3"></div>
		<div class="col-6 p-3">

			<p class="h3 text-center">Manage IPOs</p>

			<form:form action="${ipoUrl }" modelAttribute="ipo">

				<c:if test="${!empty ipo.company_name }">
					<form:label path="id">Id:</form:label>
					<form:input class="form-control" path="id" readonly="true"
						disabled="true" />
					<form:hidden path="id" />
				</c:if>

				<form:label path="company_name">Company Name:</form:label>
				<form:input class="form-control" path="company_name" />

				<form:label path="stock_exchange">Stock Exchange:</form:label>
				<form:input class="form-control" path="stock_exchange" />

				<form:label path="price_per_share">Price Per Share:</form:label>
				<form:input type="number" class="form-control" path="price_per_share" />

				<form:label path="total_shares">Total Shares:</form:label>
				<form:input type="number" class="form-control" path="total_shares" />

				<form:label path="open_date_time">Open Date and  Time:</form:label>
				<form:input type="datetime-local" class="form-control"
					path="open_date_time" />

				<form:label path="remarks">Remarks:</form:label>
				<form:input class="form-control" path="remarks" />

				<c:if test="${empty ipo.company_name  }">
					<input class="btn btn-block btn-outline-success mt-3" type="submit"
						value="Add IPO" />
				</c:if>

				<c:if test="${!empty ipo.company_name  }">
					<input class="btn btn-block btn-outline-warning mt-3" type="submit"
						value="Update IPO" />
				</c:if>

			</form:form>

		</div>
	</div>
</div>
<table class="table table-striped">
	<tr class="thead-dark">
		<th>Id</th>
		<th>Company Name</th>
		<th>Stock Exchange</th>
		<th>Price Per Share</th>
		<th>Total Shares</th>
		<th>Open Date and Time</th>
		<th>Remarks</th>
		<th>Actions</th>
	</tr>
	<c:forEach var="ipo" items="${list }">
		<tr>
			<td>${ipo.id }</td>
			<td>${ipo.company_name}</td>
			<td>${ipo.stock_exchange }</td>
			<td>${ipo.price_per_share }</td>
			<td>${ipo.total_shares }</td>
			<td>${ipo.open_date_time }</td>
			<td>${ipo.remarks }</td>
			<td>
				<a class="btn btn-danger" href="<c:url value='/ipo/remove/${ipo.id}'/>">Remove</a>
				<a class="btn btn-warning" href="<c:url value='/ipo/update/${ ipo.id}'/>">Update</a>
			</td>
		</tr>
	</c:forEach>

</table>

<%@include file="footer.jsp"%>
