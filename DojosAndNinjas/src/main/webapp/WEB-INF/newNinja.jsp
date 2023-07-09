<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
</head>

<body>
	<h1>New Ninja</h1>
	<form:form action="/ninja/new" method="post" modelAttribute="newNinja">
		<p>
			<form:label path="dojo">Dojo location: </form:label>
			<form:select path="dojo">
			<form:option value="">Please select your dojo</form:option>
			<c:forEach var="iterator" items="${dojos}">
				<form:option value="${iterator}">${iterator.nameDojo}</form:option>
			</c:forEach>
			</form:select>
			<form:errors path="dojo" />
		</p>
		<p>
			<form:label path="firstName">First name: </form:label>
			<form:errors path="firstName" />
			<form:input path="firstName" />
		</p>
		<p>
			<form:label path="lastName">Last name: </form:label>
			<form:errors path="lastName" />
			<form:input path="lastName" />
		</p>
		<p>
			<form:label path="age">Age:</form:label>
			<form:errors path="age" />
			<form:input type="number" path="age" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>