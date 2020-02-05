<%@ include file="header.jsp" %>
<br>
	<%
	RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
	rd.forward(request, response);
	%>
<%@ include file="footer.jsp"%>