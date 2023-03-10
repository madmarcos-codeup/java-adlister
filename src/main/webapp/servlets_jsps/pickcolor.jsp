<%--
  Created by IntelliJ IDEA.
  User: markrobinson
  Date: 3/9/23
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>

<form method="post" action="/pickcolor">
    <label>Enter a color</label>
    <input type="text" id="color" name="color">
    <button type="submit">Submit</button>
</form>
</body>
</html>
