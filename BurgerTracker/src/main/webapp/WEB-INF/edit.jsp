<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
</head>

<body>
	<h2>Update Burger</h2>

	<div class="centered">
		<form action="/burgers/update/${burgerToEdit.id }" method="POST" modelAttribute="burgerToEdit">
			<p>
				<label for="burgerName">Burger Name:</label> <input type="text"
					id="burgerName" name="burgerName"
					value="<c:out value='${burgerToEdit.burgerName}'/>" /><br />
			</p>
			<p>
				<label for="restaurantName">Restaurant Name:</label>
				<textarea id="restaurantName" name="restaurantName"><c:out
						value='${burgerToEdit.restaurantName}' /></textarea>
				<br />
			</p>
			<p>
				<label for="rating">Rating out of 5:</label> <input type="number"
					id="rating" name="rating"
					value="<c:out value='${burgerToEdit.rating}'/>" /><br />
			</p>
			<p>
				<label for="notes">Notes on Burger:</label> <input type="text"
					id="notes" name="notes"
					value="<c:out value='${burgerToEdit.notes}'/>" /><br />
			</p>
			<input type="submit" value="Update" />
		</form>

	</div>
		<a href="/burgers">Home</a>
</body>
</html>
