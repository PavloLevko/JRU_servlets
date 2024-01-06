<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = request.getParameter("name");
%>
<html>
<head>
    <title>Welcome</title>

</head>
<body>
<h1>Welcome. Do you want to start?</h1>
<form action="/challenge.jsp" method="get">
    <INPUT TYPE="submit" VALUE="START">
    <br>
    <br>
    <tr>
        <td>Input your name</td>
        <td><input type="text" name="name"/></td>
    </tr>
</form>
</body>
</html>
