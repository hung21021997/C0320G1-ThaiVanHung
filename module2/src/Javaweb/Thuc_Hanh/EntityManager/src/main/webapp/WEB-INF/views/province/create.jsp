<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/6/2020
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Province</title>
</head>
<body>
<h1>Create province</h1>
<p>
    <a href="/provinces">Province list</a>
</p>
<th:block th:if="${message}">
    <p th:text="${message}"></p>
</th:block>
<form th:action="@{/create-province}" th:object="${province}" method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" th:href="*{name}"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create province"></td>
        </tr>
        <tr>
            <td>Province:</td>
            <td>
                <select th:field="*{province}">
                    <option th:each="p:${provinces}" th:value="${p.id}" th:text="${p.name}"></option>
                </select>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
