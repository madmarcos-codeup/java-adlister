<%--
  Created by IntelliJ IDEA.
  User: markrobinson
  Date: 3/8/23
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login</title>
    <%@ include file="partials/head.jsp" %>

</head>
<body>

<%@ include file="partials/navbar.jsp" %>

<div class="container-fluid">
    <h4>Please login:</h4>

    <form method="post" action="login">
        <div class="mb-3">
            <label for="username" class="form-label">Username</label>
            <input type="text" class="form-control w-25" id="username" name="username" placeholder="Enter username plz" value="admin">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control w-25" id="password" name="password" placeholder="" value="password">
        </div>

        <button type="submit" class="btn-primary">Login</button>
    </form>
</div>

<%@ include file="partials/foot.jsp" %>

</body>
</html>
