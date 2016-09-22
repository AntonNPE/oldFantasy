<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Displaying team name</title>
</head>
<body>
<form action="Servlet" method="post">
<h1> Your team is : <%= request.getAttribute("teamName") %>
</h1>

    <p><select size="3" multiple name="teamChoice">
        <option disabled>Choice the team</option>
        <option value="United">United</option>
        <option value="City">City</option>
        <option value="Chelsea">Chelsea</option>
        <option value="Arsenal">Arsenal</option>
    </select></p>

    <input type="hidden" name="cmd" value="fullTeamCreate"/>
    <p><input type="submit" value="Enter"></p>
</form>
</body>
</html>
