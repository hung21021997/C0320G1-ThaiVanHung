<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/6/2020
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculate" method="get" >
    <input type="text" name="number1">
    <input type="text" name="number2"><br><br>
    <input class="btn btn-primary" type="submit" value="Addition(+)">
    <input class="btn btn-success" type="submit" value="Subtraction(-)">
    <input class="btn btn-danger" type="submit" value="Multiplication(*)">
    <input class="btn btn-warning" type="submit" value="division(/)">
</form>
</body>
</html>
