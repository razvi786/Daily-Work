<%@ include file="header.jsp"%>
  <div class="row">
      <div class="col-lg-3 col-md-2 col-sm-1"></div>
      <div class="col-lg-6 col-md-8 col-sm-10">
        <form class="form-group border p-3 p-lg-5 border-curved mt-5" action="actions.jsp" method="post">
          <p class="h2 text-muted text-uppercase text-center mb-3 ">Login</p>
       

          <label for="username">Username:</label>
          <input type="text" name="username" class="form-control" placeholder="Your Username">

          <label for="password">Password:</label>
          <input type="password" name="password" class="form-control" placeholder="Your Password">
          
          <button class="btn btn-outline-success text-dark text-center form-control mt-2">Login</button>
          
        </form>
      </div>
  </div>
<%@ include file="footer.jsp"%>