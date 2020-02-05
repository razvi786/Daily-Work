<%@ include file="header.jsp"%>
	<div>
  <div class="row">
      <div class="col-lg-3 col-md-2 col-sm-1"></div>
      <div class="col-lg-6 col-md-8 col-sm-10">
        <form class="form-group border p-3 p-lg-5 border-curved mt-5" action="register" method="post">
          <p class="h2 text-muted text-uppercase text-center">Registration</p>

          <label for="username">Username:</label>
          <input name="username" type="text" class="form-control" placeholder="Your Username">

          <label for="password">Password:</label>
          <input name="password" type="password" class="form-control" placeholder="Your Password">

          <label for="confirm_password">Confirm Password:</label>
          <input name="confirm_password" type="password" class="form-control" placeholder="Confirm Password">

          <label for="email">Email:</label>
          <input name="email" type="email" class="form-control" placeholder="Your Email">

          <label for="phone">Mobile Number:</label>
          <input name="phone" type="number" class="form-control" placeholder="Your Mobile Number">

			<label>Programming Languages:</label>
			<div class="checkbox">
			  <label><input name="prog" type="checkbox" value="java">Java</label>
			</div>
			<div class="checkbox">
			  <label><input name="prog" type="checkbox" value="cpp">C++</label>
			</div>
			<div class="checkbox">
			  <label><input name="prog" type="checkbox" value="dotnet">.Net</label>
			</div>

          <button type="submit" class="btn btn-outline-success text-dark text-center form-control mt-2">Register</button>
        </form>
      </div>
  </div>
</div>
<%@ include file="footer.jsp"%>