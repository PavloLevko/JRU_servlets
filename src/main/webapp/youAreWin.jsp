<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = request.getParameter("name");
%>
<html>
<head>
    <title>Win</title>
</head>
<body>
<h1>You have been returned home! Try again?</h1>
<form action="/youAreWin" method="post">
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