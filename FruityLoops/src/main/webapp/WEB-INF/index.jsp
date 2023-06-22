<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div
		style="display: flex; flex-direction: column; justify-content: center; align-items: center; text-align: center; height: 100vh;">
		<h1 style="margin-right: 10vh; color: pink">Fruit List</h1>
		<div
			style="border: 10px solid pink; width: 20vh; color: black">
			<c:forEach var="fruit" items="${listOfFruitItems}">
				<div style="border: 2px solid pink; padding: 20px">${fruit.name}, ${fruit.price}</div>
			</c:forEach>

		</div>
	</div>

</body>
</html>