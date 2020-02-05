<%@ include file="header.jsp" %>

<%
	session.setAttribute("userId", "101");
%>

	Welcome: user-${sessionScope.userId }<br/>
	Welcome: user-<%= session.getAttribute("userId") %>

<%@ include file="footer.jsp"%>