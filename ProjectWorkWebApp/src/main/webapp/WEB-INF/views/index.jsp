<%@include file="header.jsp" %>

<c:url var="prodUrl" value="/view-product/"/>

<div class="row">
	<h5 class="main text-center w-100">
		<strong>Welcome to E-Commerce Shopping</strong>
	</h5>
</div>

<div class="row">

	<c:forEach var="product" items="${list }">
	<div class="col-sm-4 col-md-5 m-3">
		<div class="card my-card border border-curved text-center" onclick="location.href='${prodUrl}${product.id}'">
			<div class="card-body">
				<h4 class="card-title card-text">${product.name }</h4>
				<p class="mt-2">
					<c:forEach begin="1" end="${product.rating }" step="1">
						<i class="fa fa-star fa-2x text-warning"></i>
					</c:forEach>
				</p>
				<p><i class="fa fa-inr"></i> <span class="h5 font-italic ">${product.price }</span><i class="ml-5">x${product.quantity }</i></p>
				<p><img src="<c:url value='${product.image }'/>" class="img-responsive-small" /></p>
				
				<button class="btn btn-sm btn-secondary m-1">Add to Cart</button>
				<button class="btn btn-sm btn-warning m-1">Add to Wishlist</button>
			</div>
		</div>
	</div>
	</c:forEach>

</div>

<%@include file="footer.jsp" %>