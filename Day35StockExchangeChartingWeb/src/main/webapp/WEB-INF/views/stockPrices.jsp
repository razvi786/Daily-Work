<%@include file="header.jsp"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="spUrl" value="/stock-price/save" />

<div class="container">
	<div class="row">
		<div class="col-3"></div>
		<div class="col-6 p-3">

			<p class="h3 text-center">Manage Stock Prices</p>

			<form:form action="${spUrl }" modelAttribute="sp">

				<c:if test="${!empty sp.stock_exchange }">
					<form:label path="id">Id:</form:label>
					<form:input path="id" class="form-control" readonly="true"
						disabled="true" />
					<form:hidden path="id" />
				</c:if>

				<form:label path="stock_exchange">Stock Exchange:</form:label>
				<form:input path="stock_exchange" class="form-control" />

				<form:label path="current_price">Current Price:</form:label>
				<form:input type="number" path="current_price" class="form-control" />


				<c:if test="${empty sp.stock_exchange }">
					<input type="submit" class="btn btn-block btn-outline-success mt-3"
						value="Add Stock Price" />
				</c:if>

				<c:if test="${!empty sp.stock_exchange }">
					<input type="submit" class="btn btn-block btn-outline-warning mt-3"
						value="Update Stock Price" />
				</c:if>

			</form:form>

		</div>
	</div>
</div>

<table class="table table-striped">
	<thead class="thead-dark">
		<tr>
			<th>Id</th>
			<th>Stock Exchange</th>
			<th>Current Price</th>
			<th>Date</th>
			<th>Time</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="sp" items="${list }">
			<tr>
				<td>${sp.id }</td>
				<td>${sp.stock_exchange }</td>
				<td>${sp.current_price }</td>
				<td>${sp.date }</td>
				<td>${sp.time }</td>
				<td><a class="btn btn-danger"
					href="<c:url value='/stock-price/remove/${sp.id }'/>">Remove</a> <a
					class="btn btn-warning"
					href="<c:url value='/stock-price/update/${sp.id }'/>">Update</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>



<%@include file="footer.jsp"%>