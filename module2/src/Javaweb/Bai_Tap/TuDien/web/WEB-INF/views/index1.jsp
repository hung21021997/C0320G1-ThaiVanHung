<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/6/2020
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>Vietnamese Dictionary</h1>
<form action="/dictionary/search" method="get">
    <input type="text" name="english">
    <input type="submit" name="vietnam" value="Search">
</form>
</body>
</html>
