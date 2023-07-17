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
		<c:choose>
			<c:when test="${book.id}">
				<h1>Change Book</h1>
			</c:when>
			<c:otherwise>
				<h1>New Book</h1>
			</c:otherwise>
		</c:choose>


		<form:form action="/books/create/${bookId}" method="post"
			modelAttribute="userBook" class="book-form">
			<p>
				<form:label path="title">Title</form:label>
				<br />
				<form:errors path="title" />
				<form:input path="title" />
			</p>
			<p>
				<form:label path="author">Author of the book: </form:label>
				<br />
				<form:errors path="author" />
				<form:input path="author" />
			</p>
			<p>
				<form:label path="thoughts">Thoughts on the book: </form:label>
				<br />
				<form:errors path="thoughts" />
				<form:textarea path="thoughts" />
			</p>
			<div class="buttons" style="align-self: end;">			
			<input type="submit" value="Submit" class="button" /><br/>
			<a class="button">Back to shelves</a>
			</div>
		</form:form>
	</div>
</body>
</html>