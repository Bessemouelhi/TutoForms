<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${ !empty sessionScope.login }">
<p><c:out value="${ sessionScope.login }" /></p>
</c:if>

<h2>
<c:if test="${ !empty form.resultat }">
<c:out value="${ form.resultat }" />
</c:if>
</h2>

	<form action="connection" method="POST">
		<input type="text" name="login" placeholder="Nom">
		<input type="password" name="pass" placeholder="Password">
		<input type="submit" value="Envoyer">
	</form>

</body>
</html>