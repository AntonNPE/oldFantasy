<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Displaying team name</title>
</head>
<body>
<h1> Your team is : <%= request.getAttribute("teamName") %>
</h1>
<form action="Servlet" method="post">

    <p><select  name="clubs">
        <option disabled>Choice the team</option>
        <option value="United">United</option>
        <option value="City">City</option>
        <option value="Chelsea">Chelsea</option>
        <option value="Arsenal">Arsenal</option>
        <option value="CustomTeam"><%= request.getAttribute("teamName")%></option>
    </select></p>

    <input type="hidden" name="cmd" value="fullTeamCreate"/>
    <p><input type="submit" value="Enter"></p>
</form>
</body>
</html>
