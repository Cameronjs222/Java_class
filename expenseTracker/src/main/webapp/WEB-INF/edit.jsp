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

	<div class="expense-form">
		<h2>Update Expense</h2>

		<form:form action="/expenses/update/${expenseToEdit.id}" method="post" modelAttribute="expenseToEdit">
			<p>
				<form:label path="expenseName">Expense: </form:label>
				<form:input path="expenseName" /><br/>
				<form:errors path="expenseName" />
			</p>
			<p>
				<form:label path="vendorName">Vendor name: </form:label>
				<form:input path="vendorName" /><br/>
				<form:errors path="vendorName" />
			</p>
			<p>
				<form:label path="amount">How much was this expense? </form:label>
				<form:input type="number" path="amount" /><br/>
				<form:errors path="amount" />
			</p>
			<p>
				<form:label path="description">Description of the expense? </form:label>
				<form:textarea path="description" /><br/>
				<form:errors path="description" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>

	</div>
</body>
</html>
