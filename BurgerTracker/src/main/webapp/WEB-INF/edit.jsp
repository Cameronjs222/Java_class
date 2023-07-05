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

	<div class="burger-form">
		<h2>Update Burger</h2>

		<form:form action="/burgers/update/${burgerToEdit.id}" method="post" modelAttribute="burgerToEdit">
			<p>
				<form:label path="burgerName">Burger Name: </form:label>
				<form:input path="burgerName" /><br/>
				<form:errors path="burgerName" />
			</p>
			<p>
				<form:label path="restaurantName">Restaurant name: </form:label>
				<form:input path="restaurantName" /><br/>
				<form:errors path="restaurantName" />
			</p>
			<p>
				<form:label path="rating">Rating out of 5? </form:label>
				<form:input type="number" path="rating" /><br/>
				<form:errors path="rating" />
			</p>
			<p>
				<form:label path="notes">Notes on the burger? </form:label>
				<form:textarea path="notes" /><br/>
				<form:errors path="notes" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>

	</div>
</body>
</html>
