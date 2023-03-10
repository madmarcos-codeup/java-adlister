<%--
  Created by IntelliJ IDEA.
  User: markrobinson
  Date: 3/9/23
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>

<form action="/guess" method="post">
  <label>Guess a number from 1 to 3: </label>
  <input type="text" name="guess" id="guess">

  <button type="submit">Submit</button>
</form>
</body>
</html>
