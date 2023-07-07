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
  <div class="expense-info">
    <div class="info-row">
      <span class="label">Expense Name:</span>
      <span class="value">${expenseToEdit.expenseName}</span>
    </div>
    <div class="info-row">
      <span class="label">Restaurant Name:</span>
      <span class="value">${expenseToEdit.vendorName}</span>
    </div>
    <div class="info-row">
      <span class="label">Amount:</span>
      <span class="value">$${expenseToEdit.amount}</span>
    </div>
    <div class="info-row">
      <span class="label">Description:</span>
      <span class="value">${expenseToEdit.description}</span>
    </div>
    <a href="/expenses">Home</a>
  </div>
  
	
</body>
</html>