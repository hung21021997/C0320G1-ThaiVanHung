<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/6/2020
  Time: 6:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiment</title>
</head>
<body>
<%--<c:if >--%>

<%--</c:if>--%>
<h1>Sandwich Condiment</h1>
<c:forEach items="${condiment}" var="test">
    <h2>${test}</h2>
</c:forEach>

</body>
</html>
