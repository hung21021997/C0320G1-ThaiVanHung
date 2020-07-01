<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/6/2020
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Province</title>
</head>
<body>
<h1>Edit province</h1>
<p>
    <a href="/provinces">Province list</a>
</p>
<th:block th:if="${message}">
    <p th:text="${message}"></p>
</th:block>
<form th:action="@{/edit-province}" th:object="${province}" method="post">
    <input th:type="hidden" name="id" th:field="*{id}">
    <table>
        <tr>
            <td>First Name: </td>
            <td><input type="text" th:field="*{name}"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update province"></td>
        </tr>
    </table>
</form>
</body>
</html>
