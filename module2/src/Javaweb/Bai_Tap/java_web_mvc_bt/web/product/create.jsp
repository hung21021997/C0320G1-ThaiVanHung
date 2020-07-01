<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/6/2020
  Time: 7:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
</head>
<body>
<h1>Create new product</h1>
<p>
    <c:if test='${requestScope["message"]!=null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to product list</a>
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
                <td><input type="submit" value="Create Product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
