<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Displaying team name</title>
</head>
<body>
<h1> Your team is : <%= request.getAttribute("teamName") %>
</h1>
<form action="view/teamCreate/FullTeamPage.jsp" method="post">

    <table>
        <tr>
            <th>Club Type Sort</th>
            <th>Position Type Sort</th>
            <th>Price Type Sort</th>
            <th>Show all players</th>
        </tr>
        <tr>
            <td>
                <select name="clubsSort">
                    <option disabled>Choice the team</option>
                    <option value="united">United</option>
                    <option value="city">City</option>
                    <option value="chelsea">Chelsea</option>
                    <option value="arsenal">Arsenal</option>
                    <option value="liverpool">Liverpool</option>
                </select>
            </td>
            <td>
                <select name="positionSort">
                    <option disabled>Choice the position</option>
                    <option value="goalkeeper">goalkeeper</option>
                    <option value="defender">defender</option>
                    <option value="midfielder">midfielder</option>
                    <option value="forward">forward</option>
                </select>
            </td>
            <td>
                <select name="priceSort">
                    <option disabled>Player's price below that :</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                </select>
            </td>
            <td>Show all players</td>
        </tr>
    </table>

    <input type="hidden" name="cmd" value="fullTeamCreate"/>
    <input type="hidden" name="name" value="<%= request.getAttribute("teamName") %>"/>
    <p><input type="submit" value="Enter"></p>
</form>
</body>
</html>
