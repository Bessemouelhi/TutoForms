<c:if test="${ !empty sessionScope.login }">
<p><i>Connecté : <c:out value="${ sessionScope.login }" /></i></p>
</c:if>