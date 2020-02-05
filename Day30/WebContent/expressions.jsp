<%@ include file="header.jsp" %>
<% session.setAttribute("username", "syed"); %>
	<h2>Session username: ${ sessionScope.username}</h2>
	<% Cookie ck=new Cookie("fruit","custard_apple"); response.addCookie(ck); %>
	<h2>Cookie Fruit: ${cookie.fruit.value }</h2>
<%@ include file="footer.jsp"%>