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
	<div>
		<form action="">
			<h1>New Ninja</h1>
			<form:label path="">Dojo: </form:label>
			<form:select path="">
				<c:forEach var="iterator" items="${dojos}">
					<option>${iterator}</option>
				</c:forEach>
			</form:select>
			<form:errors />

			<form:label path="">First Name:</form:label>
			<form:input path="" />
			<form:errors></form:errors>

			<form:label path="">Last Name:</form:label>
			<form:input path="" />
			<form:errors></form:errors>

			<form:label path="">Age: </form:label>
			<form:input path="" type="number" />
			<form:errors></form:errors>

			<button>Create</button>

		</form>

	</div>
</body>
</html>