<%--
  Created by IntelliJ IDEA.
  User: markrobinson
  Date: 3/10/23
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>My Ads</title>
</head>
<body>
<h3>Ads</h3>
<c:forEach var="ad" items="${ads}">
    <div class="card">
        <p>${ad.title}</p>
        <p>${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
