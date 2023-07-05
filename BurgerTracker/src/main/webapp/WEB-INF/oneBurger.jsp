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
  <div class="burger-info">
    <div class="info-row">
      <span class="label">Burger Name:</span>
      <span class="value">${burgerToEdit.burgerName}</span>
    </div>
    <div class="info-row">
      <span class="label">Restaurant Name:</span>
      <span class="value">${burgerToEdit.restaurantName}</span>
    </div>
    <div class="info-row">
      <span class="label">Rating:</span>
      <span class="value">${burgerToEdit.rating}</span>
    </div>
    <div class="info-row">
      <span class="label">Notes:</span>
      <span class="value">${burgerToEdit.notes}</span>
    </div>
    <a href="/burgers">Home</a>
  </div>
  
	
</body>
</html>