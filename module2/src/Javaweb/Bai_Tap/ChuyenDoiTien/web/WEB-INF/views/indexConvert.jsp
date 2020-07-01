<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/6/2020
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert Controller</title>
</head>
<body>
<h1>Converter</h1>
<form action="/converter/result" method="get">
    <label>Rate: </label>
    <input type="text" name="rate" value="22000"><br>
    <label>USD: </label>
    <input type="text" name="usd" value="1"><br>
    <input type="submit" id="submit">
</form>
</body>
</html>
