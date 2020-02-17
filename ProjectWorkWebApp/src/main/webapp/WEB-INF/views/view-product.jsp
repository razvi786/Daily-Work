<%@include file="header.jsp"%>

<div class="row">

	<div class="col-sm-5">

		<img src="<c:url value='${product.image }'/>" class="img-responsive" />

	</div>

	<div class="col-sm-6 res">

		<div class="row">
			<div class="col">
				<label class="h3" for="id">Name:</label>
			</div>
			<div class="col lead">${product.name }</div>
		</div>
		<hr>

		<div class="row">
			<div class="col">
				<label class="h3" for="id">Rating:</label>
			</div>
			<div class="col">
				<c:forEach begin="1" end="${product.rating }" step="1">
					<i class="fa fa-star fa-2x text-warning"></i>
				</c:forEach>
			</div>
		</div>

		<hr>

		<div class="row">
			<div class="col">
				<label class="h3" for="id">Price:</label>
			</div>
			<div class="col">
				<i class="fa fa-inr"></i> <span class="h5 font-italic">${product.price }</span>
			</div>
		</div>

		<hr>

		<div class="row">
			<div class="col">
				<label class="h3" for="id">Quantity:</label>
			</div>
			<div class="col h3">
				<i>${product.quantity }</i>
			</div>
		</div>

		<hr>

		<div class="row">
			<div class="col">
				<label class="h3" for="id">Specification:</label>
			</div>
		</div>

		<div class="row mt-2">
			<div class="col lead">${product.specification }</div>
		</div>


		<button class="btn btn-sm btn-secondary m-3 p-1 btn-block w-75">Add
			to Cart</button>

		<button class="btn btn-sm btn-warning m-3 p-1 btn-block w-75">Add
			to Wishlist</button>



	</div>


</div>



<%@include file="footer.jsp"%>