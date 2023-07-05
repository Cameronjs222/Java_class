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

	<div class="burger-info">
	<h2>Burgers:</h2>
		<table>
			<tr>
				<th>Burger Name</th>
				<th>RestaurantName</th>
				<th>Rating</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="burger" items="${burgers}">
				<tr>
					<td><a href="/burgers/${burger.id}">${burger.burgerName}</a></td>
					<td>${burger.restaurantName}</td>
					<td>${burger.rating}</td>
					<td><a href="/burgers/delete/${burger.id}">Delete</a> | <a href="/burgers/edit/${burger.id}">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>


	<div class="burger-form">
		<h2>New Burger</h2>

		<form:form action="/burgers/add" method="post" modelAttribute="burger">
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