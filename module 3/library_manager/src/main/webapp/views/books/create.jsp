<%@ page import="com.example.library_manager.entity.Category" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 30/07/2024
  Time: 9:23 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<Category> categories = (List<Category>) request.getAttribute("catagories");%>
<html>
<head>
    <title>Create New Book </title>
</head>
<body>
<h2 class="text-center">Create New Book</h2>
<form action="/books/create" method="post">
    <label for="name">Name:</label><br>
    <input type="text" name="name" id="name"><br>
    <label for="description">description:</label><br>
    <textarea type="text" name="description" id="description"></textarea><br>
    <label for="price">description:</label><br>
    <input type="number" name="price" id="price"><br>
    <label for="category_id">category:</label><br>
    <select id="category_id" name="category_id">
        <c:forEach var="category" items="${categories}">
            <option value="<c:out value="${category.id}"/>"><c:out value="${category.name}"/></option>
        </c:forEach>
    </select>
    <input type="submit" value="submit">



</form>
</body>
</html>
