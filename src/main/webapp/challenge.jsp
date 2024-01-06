<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = request.getParameter("name");
    session.setAttribute("name", name);
%>
<html>
<head>
    <title>Challenge</title>
</head>
<body>
<h1>You are losing your memory. Accept the UFO challenge?</h1>
<form action="/challenge" method="post">
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
