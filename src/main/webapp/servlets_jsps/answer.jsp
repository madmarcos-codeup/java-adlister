<%--
  Created by IntelliJ IDEA.
  User: markrobinson
  Date: 3/9/23
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Answer</title>
</head>
<body>

<c:choose>
    <c:when test="${message == 'correct'}">
        <h1>CORRECT!!!</h1>
    </c:when>
    <c:otherwise>
        <h3>Incorrect :(</h3>
    </c:otherwise>
</c:choose>
</body>
</html>
