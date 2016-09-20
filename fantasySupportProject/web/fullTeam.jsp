<%--
  Created by IntelliJ IDEA.
  User: Shuric
  Date: 20.09.2016
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>

<h1>Input data:</h1>

<form action="SingleServlet" method="post">
    <input type="hidden" name="cmd" value="fullTeam"/>
    <table>

        <tr>
            <td><input type="submit" value="ShowMeFullTeam!!!"/></td>
        </tr>
    </table>
</form>

</body>
</html>
