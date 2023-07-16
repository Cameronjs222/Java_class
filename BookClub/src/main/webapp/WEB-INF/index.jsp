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
  <div class="container">
    <h1>
      Welcome
      <c:out value="${currentUser.name}"></c:out>
    </h1>
    <h3>Books from everyone's shelves:</h3>
    <table class="book-table">
      <thead>
        <tr>
          <th>ID</th>
          <th>Title</th>
          <th>Author Name</th>
          <th>Posted by</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="book" items="${books}">
          <tr>
            <td><c:out value="${book.id}"></c:out></td>
            <td><a class="link" href="/books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
            <td><c:out value="${book.author}"></c:out></td>
            <td><c:out value="${book.user.name}"></c:out></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>

    <a class="link" href="/books">+ Add to my shelf</a>
    <a class="link" href="/user/logout">Logout</a>
  </div>
</body>
</html>