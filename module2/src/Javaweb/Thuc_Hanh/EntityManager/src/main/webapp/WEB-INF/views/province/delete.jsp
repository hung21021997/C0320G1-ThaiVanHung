<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/6/2020
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete province</title>
</head>
<body>
<h1>Delete province</h1>
<h2>Are you sure?</h2>
<p>
    <a href="/provinces">Province List</a>
</p>
<form th:action="@{/delete-province}" th:object="${province}" method="post">
    <input th:type="hidden" name="id" th:fied="*{id}">
    <table>
        <tr>
            <td>Name: </td>
            <td th:text="${province.name}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Delete province"></td>
        </tr>
    </table>
</form>
</body>
</html>
