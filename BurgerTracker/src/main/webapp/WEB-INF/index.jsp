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
  
<h1>New Burger</h1>
<form:form action="/add" method="post" modelAttribute="burger">
    <p>
        <form:label path="burgerName">Burger Name: </form:label>
        <form:errors path="burgerName"/>
        <form:input path="burgerName"/>
    </p>
    <p>
        <form:label path="restName">Restaurant name: </form:label>
        <form:errors path="restName"/>
        <form:textarea path="restName"/>
    </p>
    <p>
        <form:label path="rating">Rating out of 5? </form:label>
        <form:errors path="rating"/>
        <form:input type="number" path="rating"/>
    </p>
    <p>
        <form:label path="notes">Notes on the burger? </form:label>
        <form:errors path="notes"/>     
        <form:input path="notes"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    


</body>
</html>