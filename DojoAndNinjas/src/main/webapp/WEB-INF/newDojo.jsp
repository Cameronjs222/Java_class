<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
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
	<h1>New Dojo</h1>
	<form action="/dojos/add" modelAttribute="newDojo">
		<form:label path="dojoName">Name:</form:label>
		<form:input path="dojoName"/>
		<form:errors path="dojoName"/>
		<button>Create</button>		
	</form>
</body>
</html> 