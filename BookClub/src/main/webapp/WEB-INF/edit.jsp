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

	<h1>New Book</h1>
	<form:form action="/books/create" method="post"
		modelAttribute="newBook">
		<p>
			<form:label path="title">Title</form:label>
			<form:errors path="title" />
			<form:input path="title" />
		</p>
		<p>
			<form:label path="thoughts">Thoughts on the book: </form:label>
			<form:errors path="thoughts" />
			<form:textarea path="thoughts" />
		</p>
		<p>
			<form:label path="author">Author of the book: </form:label>
			<form:errors path="author" />
			<form:input path="author" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>