<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/6/2020
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
<h1>Sandwich Condiment</h1>
<form action="/save" method="get">
    <label>Lettuce</label>
    <input type="checkbox" name="condiment" value="Lettuce">
    <label>Tomato</label>
    <input type="checkbox" name="condiment" value="Tomato">
    <label>Mustard</label>
    <input type="checkbox" name="condiment" value="Mustard">
    <label>Sprouts</label>
    <input type="checkbox" name="condiment" value="Sprouts"><br>
    <p>_______________________________________________________</p>
    <input style="color: blue" type="submit" value="Save" class="btn btn-outline-success">
</form>
</body>
</html>
