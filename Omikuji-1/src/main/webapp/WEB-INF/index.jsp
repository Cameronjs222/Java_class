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
	<div class="container">
		<div class="content">
			<form action="/Omikuji/form">
				<label for="number">Number (between 5 and 25):</label> <br> 
				<input type="number" name="number" id="number" min="5" max="25" required><br> 
				<label for="name">Name of real person:</label> <br> 
				<input type="text" name="name" id="name" required> <br> 
				<label for="city">Any city:</label><br> 
				<input type="text" name="city" id="city" required> <br>
				<label for="hobby">Profession or Hobby:</label> <br> 
				<input type="text" name="hobby" id="profession" required> <br>
				<label for="pet">Any living thing:</label><br>
				<input name="pet"><br>
				<label for="message">Nice Message:</label><br> 
				<textarea name="message" id="message" rows="4" required></textarea>
				<br> <input type="submit" value="Submit">
			</form>
		</div>
	</div>
</body>
</html>