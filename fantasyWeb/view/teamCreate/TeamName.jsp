<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Displaying team name</title>
</head>
<body>
<h1> Your team is : <%= request.getAttribute("teamName") %>
</h1>
<form action="Servlet" method="post">

    <tr>
        <td>b:</td>
        <td><input type="text" name="clubs"/></td>
    </tr>

    <input type="hidden" name="cmd" value="fullTeamCreate"/>
    <p><input type="submit" value="Enter"></p>
</form>
</body>
</html>
