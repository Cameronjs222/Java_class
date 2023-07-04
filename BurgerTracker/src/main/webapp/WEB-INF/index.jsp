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
	<h2>Burgers:</h2>

	<div class="centered">
		<table>
			<tr>
				<th>Burger Name</th>
				<th>RestaurantName</th>
				<th>Rating</th>
			</tr>
			<c:forEach var="burger" items="${burgers}">
				<tr>
					<td>${burger.burgerName}</td>
					<td><a href="/books/${burger.id}">${burger.restaurantName}</a></td>
					<td>${burger.rating}</td>
					<%--    <td>${book.numberOfPages}</td>--%>
				</tr>
			</c:forEach>
		</table>
	</div>

		<h2>New Burger</h2>

	<div class="centered">

		<form:form action="/add" method="post" modelAttribute="burger">
			<p>
				<form:label path="burgerName">Burger Name: </form:label>
				<form:input path="burgerName" /><br/>
				<form:errors path="burgerName" />
			</p>
			<p>
				<form:label path="RestaurantName">Restaurant name: </form:label>
				<form:textarea path="RestaurantName" /><br/>
				<form:errors path="RestaurantName" />
			</p>
			<p>
				<form:label path="rating">Rating out of 5? </form:label>
				<form:input type="number" path="rating" /><br/>
				<form:errors path="rating" />
			</p>
			<p>
				<form:label path="notes">Notes on the burger? </form:label>
				<form:input path="notes" /><br/>
				<form:errors path="notes" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>

	</div>
</body>
</html>