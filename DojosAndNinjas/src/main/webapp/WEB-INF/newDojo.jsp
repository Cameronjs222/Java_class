<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
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
<form:form action="/dojo/new" method="post" modelAttribute="newDojo">
    <p>
        <form:label path="nameDojo">Title</form:label>
        <form:errors path="nameDojo"/>
        <form:input path="nameDojo"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>    



</body>
</html>