<%@include file="header.jsp" %>


<div class="row">
      <h5 class="main text-center w-100">
        <strong>Welcome Admin</strong>
      </h5>
    </div>

    <div class="row">

      <!-- Inside For Loop -->
      <div class="col-sm-4 col-md-5 m-3">
        <div class="card my-card bg-warning border h-100 border-curved text-center" onclick="location.href='user-home'">
          <div class="card-body">
            <h4 class="card-title card-text">Manage Users</h4>
          </div>
        </div>
      </div>

      <div class="col-sm-4 col-md-5 m-3">
        <div class="card my-card bg-warning border h-100 border-curved text-center" onclick="location.href='product-home'">
          <div class="card-body">
            <h4 class="card-title card-text">Manage Products</h4>
          </div>
        </div>
      </div>

    </div>
    <div class="row">

      <div class="col-sm-4 col-md-5 m-3">
        <div class="card my-card bg-warning  border border-curved text-center h-100" onclick="location.href='supplier-home'">
          <div class="card-body">
            <h4 class="card-title card-text">Manage Suppliers</h4>
          </div>
        </div>
      </div>

      <div class="col-sm-4 col-md-5 m-3">
        <div class="card my-card bg-warning  border border-curved text-center h-100" onclick="location.href='category-home'">
          <div class="card-body">
            <h4 class="card-title card-text">Manage Categories</h4>
          </div>
        </div>
      </div>


    </div>
    
    <%@include file="footer.jsp" %>