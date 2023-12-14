<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Page</title>
</head>
<body>
<h1>You are losing your memory. Accept the UFO challenge?</h1>
<form action="/users" method="post">
  Your answer: <input type="text" name="text"><br>
    <input type="submit" value="Submit" >
    <br>
    <br>
</form>
<h5>Gamecounter ${id} </h5>
</body>
</html>
