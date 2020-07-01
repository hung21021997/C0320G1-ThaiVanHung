<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/6/2020
  Time: 9:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>View Product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>NameProduct: </td>
        <td>${requestScope["product"].getNameProduct()}</td>
    </tr>
    <tr>
        <td>RateProduct: </td>
        <td>${requestScope["product"].getRateProduct()}</td>
    </tr>
    <tr>
        <td>MarkerProduct: </td>
        <td>${requestScope["product"].getMarkerProduct()}</td>
    </tr>
</table>
</body>
</html>
