<%@ include file="header.jsp"%>

	<jsp:useBean id="user" class="com.cts.training.bean.LoginBean" scope="page"></jsp:useBean>
	<%-- <jsp:setProperty property="username" name="user" value="syed007"/>
	<jsp:setProperty property="password" name="user" value="secret"/> --%>

	<jsp:setProperty property="*" name="user"/>
<div class="text-center">
	<h1 class="h2 text-secondary">User Details:</h1>
	Username: <span class="lead"><jsp:getProperty property="username" name="user"/></span><br>
	Password: <span class="lead"><jsp:getProperty property="password" name="user"/></span>
</div>

<%@ include file="footer.jsp"%>