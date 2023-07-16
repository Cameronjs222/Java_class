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

	<div class="container">

		<h1>register</h1>
		<form:form action="/user/new" method="post" modelAttribute="newUser">
			<p>
				<form:label path="name">Name: </form:label>
				<form:errors path="name" />
				<form:input path="name" />
			</p>
			<p>
				<form:label path="email">Email: </form:label>
				<form:errors path="email" />
				<form:input path="email" />
			</p>
			<p>
				<form:label path="password">Password: </form:label>
				<form:errors path="password" />
				<form:password path="password" />
			</p>
			<p>
				<form:label path="confirm">Confirm password: </form:label>
				<form:errors path="confirm" />
				<form:password path="confirm" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
	<div class="container">

		<h2>Login</h2>
		<form:form action="/user/login" method="post"
			modelAttribute="loginUser">
			<p>
				<form:label path="email">Email: </form:label>
				<form:input path="email" />
			</p>
			<p>
				<form:label path="password">Password: </form:label>
				<form:password path="password" />
			</p>
			<form:errors path="email" />
			<form:errors path="password" />
			<br />
			<input type="submit" value="Submit" />

		</form:form>
	</div>
</body>
</html>