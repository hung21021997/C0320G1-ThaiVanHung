<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/6/2020
  Time: 8:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting Product</title>
</head>
<body>
<h1>Delete Product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
<h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
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
                <td>${requestScope["product"].getMarkerPrduct}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete Product"></td>
                <td><a href="/products">Back to product list</a> </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
