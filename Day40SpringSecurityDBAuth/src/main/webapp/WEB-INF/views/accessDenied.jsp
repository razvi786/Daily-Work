<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
	<h1>Access is denied</h1>
	<c:choose>
		<c:when test="${empty username }">
				<h2>You are not authorized to access this</h2>
		</c:when>
		<c:otherwise>
			<h2>Username: ${username }	<br>
					You do not have permission to access this page			
			</h2>
		</c:otherwise>
	</c:choose>
</body>
</html>