<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/6/2020
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Province</title>
</head>
<body>
<a href="/create-province">Create new province</a>
<h1>Province</h1>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <th:block th:each="province:${provinces}">
        <tr>
            <td th:text="${province.name}"></td>
            <td><a th:href="@{/edit-province/__${province.id}__}">Edit</a> </td>
            <td><a th:href="@{/delete-province/__${province.id}__}">Delete</a></td>
        </tr>
    </th:block>
</table>
</body>
</html>
