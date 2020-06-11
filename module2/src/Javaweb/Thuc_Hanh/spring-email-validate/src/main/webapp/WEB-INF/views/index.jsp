<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/6/2020
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Validate</title>
</head>
<body>
<h1 style="color: darkblue">Email Validate</h1>
<h3 style="color: red">${message}</h3>
<form action="validate" method="post">
    <input style="color: green" type="text" name="email"><br>
    <input style="color: green" type="submit" value="Validate">
</form>
</body>
</html>
