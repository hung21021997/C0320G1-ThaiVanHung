<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/6/2020
  Time: 8:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>
<p>
    <c:if test='${requestScope["message"]!=null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product Information</legend>
        <table>
            <tr>
                <td>NameProduct: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>RateProduct: </td>
                <td><input type="text" name="rate" id="rate"></td>
            </tr>
            <tr>
                <td>MarkerProduct: </td>
                <td><input type="text" name="marker" id="marker"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update Product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
