<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/6/2020
  Time: 5:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Province</title>
</head>
<body>
<h1>View province: <span th:text="${province.name}"></span></h1>
<a href="/provinces">Province list</a>
<table border="1">
    <tr>
        <th>First name</th>
        <th>Last name</th>
    </tr>
    <th:block th:each="customer : ${customers}">
        <tr>
            <td th:text="${customer.firstName}"></td>
            <td th:text="${customer.lastName}"></td>
        </tr>
    </th:block>
</table>
</body>
</html>
