<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 27/07/2024
  Time: 12:07 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="./users/create" method="post">
    id
    <input type="number" name="id"><br>
   name
    <input type="text" name="name"><br>
    Email
    <input type="email" name="email"><br>

    role:
    <select name="role">
        <option value="1">admin</option>

        <option value="2">client</option>

        <option value="3">manager</option>

    </select>

    <input type="submit" value="submit">
</form>


</body>
</html>
