<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.awt.print.Book" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 30/07/2024
  Time: 6:35 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<Book> books = (List<Book>) request.getAttribute("books");%>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
    <h2 class="text-center">Books List </h2>
    <a class="btn btn-primary" href="/books/create"> Create new Book</a>
    <table class="table table-hover ">
        <tr class="fw-bold">
            <th>
                ID
            </th>
            <th>
                Name
            </th>
            <th>
                Description
            </th>
            <th>
                Price
            </th>
            <th>
                Category
            </th>
            <th>
                Action
            </th>

        </tr>
       <c:set value="1" var="index"/>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>
                    <c:out value="${index}"/>
                </td>
                <td>
                    <c:out value="${book.name}"/>
                </td>
                <td>
                    <c:out value="${book.description}"/>
                </td>
                <td>
                    <c:out value="${book.price}"/>
                </td>
                <td>
                    <c:out value="${book.category_id}"/>
                </td>
                <td>
                    <a class="btn btn-danger" onclick="return confirm('you want delete book')" href="/books/delete?id=<c:out value="${book.id}"/>">DELETE</a>
                </td>
            </tr>
            <c:set value="${index+1}" var="index"/>
        </c:forEach>
    </table>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</body>
</html>
