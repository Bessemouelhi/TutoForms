<c:if test="${ !empty sessionScope.login }">
<p><i>Connect� : <c:out value="${ sessionScope.login }" /></i></p>
</c:if>