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

	<div class="expense-info">
	<h2>Expenses:</h2>
		<table>
			<tr>
				<th>Expense Name</th>
				<th>VendorName</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="expense" items="${expenses}">
				<tr>
					<td><a href="/expenses/${expense.id}">${expense.expenseName}</a></td>
					<td>${expense.vendorName}</td>
					<td>${expense.amount}</td>
					<td><a href="/expenses/delete/${expense.id}">Delete</a> | <a href="/expenses/edit/${expense.id}">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>


	<div class="expense-form">
		<h2>New Expense</h2>

		<form:form action="/expenses/add" method="post" modelAttribute="expense">
			<p>
				<form:label path="expenseName">expense Name: </form:label>
				<form:input path="expenseName" /><br/>
				<form:errors path="expenseName" />
			</p>
			<p>
				<form:label path="vendorName">Vendor name: </form:label>
				<form:input path="vendorName" /><br/>
				<form:errors path="vendorName" />
			</p>
			<p>
				<form:label path="amount">Value of expense? </form:label>
				<form:input type="float" path="amount" placeholder="0.0" value=""/><br/>
				<form:errors path="amount" />
			</p>
			<p>
				<form:label path="description">Description on the expense? </form:label>
				<form:textarea path="description" /><br/>
				<form:errors path="description" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>

	</div>
</body>
</html>