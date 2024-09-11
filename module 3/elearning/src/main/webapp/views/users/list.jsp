<%@ page import="java.util.List" %>
<%@ page import="com.example.elearning.entity.User" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 24/07/2024
  Time: 8:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<User> users = (List<User>) request.getAttribute("users");%>
<html>
<head>
    <title>List User </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<table class="table table-hower">
    <a href="/users/create" class="btn btn-primary"> add new user </a>
    <tr>
        <td>#</td>
        <td>Name</td>
        <td>Email</td>
        <td>Role</td>
        <td>action</td>
    </tr>
    <c:forEach items="${users}" var="user">

        <tr>
            <td>
                <c:out value="${user.id}"/>
            </td>
            <td>
                <c:out value="${user.name}"/>
            </td>
            <td>
                <c:out value="${user.email}"/>
            </td>
            <td>
                <c:if test="${user.role == 1}">
                    <c:out value="Admin"/>
                </c:if>

                <c:if test="${user.role == 2}">
                    <c:out value="client"/>
                </c:if>

                <c:if test="${user.role == 3}">
                    <c:out value="manager"/>
                </c:if>
            </td>
            <td>
                <a href="/users/delete?id=<c:out value="${user.id}"/>" class="btn btn-danger">DELETE</a>
                <a href="/users/update?id=<c:out value="${user.id}"/> " class="btn btn-success"> Update </a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
