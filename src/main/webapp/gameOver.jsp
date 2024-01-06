<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game Over</title>
</head>
<body>
<h1>Game over! Play again?</h1>
<form action="/gameOver" method="post">
    <INPUT TYPE="submit" VALUE="Yes" name="buttonValue">
    <INPUT TYPE="submit" VALUE="No" name="buttonValue">
</form>
<br>
<br>
<h3>Name</h3>
<td><%= session.getAttribute("name")%>
</td>
</body>
</html>