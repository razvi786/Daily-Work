<%@ include file="header.jsp" %>

<p:out value="Hello World"/>
<br/>
<p:set var="name" value="Aneena Thomas"/>
Name: <p:out value="${name }"/>
<p:remove var="name"/>
<br/>
Name: <p:out value="${name }"/>
<br/>
<p:forEach var="i" begin="1" end="6" step="1">
		<p class="h${i }">Heading ${i }</p>
</p:forEach>
<br/>
Loop with array: <br/>
<p:forEach var="i" items="4,3,2,1">
	<p class="display-${i }">Display ${i }</p>
</p:forEach>
<br/>
<p:set var="active" value="false"/>
<p:if test="${active }">
	<p:redirect url="login.jsp"></p:redirect>
</p:if>
<p:if test="${!active }">
	<button class="btn btn-primary p-2 m-3 disabled">I am Button</button>
</p:if>

<p:set var="n" value="100"/>
<p:choose>
	<p:when test="${n>0&&n<=3 }">0-3</p:when>
	<p:when test="${n>3&&n<=6 }">4-6</p:when>
	<p:when test="${n>6&&n<=9 }">7-9</p:when>
	<p:otherwise>Otherwise</p:otherwise>
</p:choose>

<%@ include file="footer.jsp"%>