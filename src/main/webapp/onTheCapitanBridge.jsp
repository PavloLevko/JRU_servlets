<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = request.getParameter("name");
%>
<html>
<head>
    <title>On The Capitan Bridge</title>
</head>
<body>
<h1>You are on the bridge. Who are you? Tell the truth?</h1>
<form action="/onTheCapitanBridge" method="post">
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