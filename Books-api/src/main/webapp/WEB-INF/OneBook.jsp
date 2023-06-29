<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
</head>

<body>
<div>
<h1><c:out value="${Book.title}"></c:out></h1>
<p>Description: <c:out value="${Book.description }"></c:out></p>
<p>Language: <c:out value="${Book.language }"></c:out></p>
<p>Number of Pages: <c:out value="${Book.numberOfPages }"></c:out></p>
<a href="/books">Home</a>
</div>
</body>
</html>