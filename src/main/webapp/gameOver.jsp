<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Page</title>
</head>
<body>
<h1>Game over! Play again?</h1>
<form action="/gameOver" method="post">
    Your answer: <input type="text" name="text"><br>
    <input type="submit" value="Submit" >

</form>
</body>
</html>