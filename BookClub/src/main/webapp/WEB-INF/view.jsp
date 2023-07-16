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


		<div class="header">
			<h1>
				<c:out value="${book.title }"></c:out>
			</h1>
			<a href="/books/all">Back to the shelves</a>
		</div>

		<div class="text">
			<c:choose>
				<c:when test="${book.user.id.equals(currentUser)}">
					<p>
						You read
						<c:out value="${book.title }"></c:out>
						by
						<c:out value="${book.author}"></c:out>
					</p>
					<p>Here are your thoughts:</p>
				</c:when>
				<c:otherwise>
					<p>
						<c:out value="${book.user.name }"></c:out>
						read
						<c:out value="${book.title}"></c:out>
						by
						<c:out value="${book.author}"></c:out>
					</p>
					<p>
						Here are
						<c:out value="${book.user.name}"></c:out>
						's thoughts
				</c:otherwise>

			</c:choose>
		</div>

		<div class="userThoughts">
			<p>
				<c:out value="${book.thoughts}"></c:out>
			</p>
		</div>

		<div class="buttons">
			<c:if test="${book.user.id.equals(currentUser)}">
				<a class="button" href="/books/edit/${book.id}"> Edit </a>
			</c:if>
			<c:if test="${book.user.id.equals(currentUser)}">
				<a class="button" href="/books/delete/${book.id}"> Delete </a>
			</c:if>
		</div>
	</div>

</body>
</html>