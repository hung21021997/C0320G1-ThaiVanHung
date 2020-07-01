<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/6/2020
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/products?action=create">Create new customer</a>
</p>
<table border="l">
    <tr>
        <td>NameProduct</td>
        <td>RateProduct</td>
        <td>MakerProduct</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items = '${requestScope["products"]}' var = "cutomer">
        <tr>
            <td><a href="/products?action=view&id=${product.getIdProduct()}">${product.getNameProduct()}</a> </td>
            <td>${product.getRateProduct}</td>
            <td>${product.getMakerProduct}</td>
            <td><a href="/products?action=edit&id=${product.getIdProduct()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getIdProduct()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
