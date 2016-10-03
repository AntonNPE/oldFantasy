<%@ page import="org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 29.09.2016
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>jsp</title>
    <style>
        table {
            border: 1px solid black;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
    </style>
</head>

<form action="Servlet" method="post">

    <h1> Your team is : <%=request.getParameter("teamName")%>
    </h1>
    <table>
        <tr>
            <th>Club Type Sort</th>
            <th>Position Type Sort</th>
            <th>Price Type Sort</th>
            <th></th>
        </tr>
        <tr>
            <td>
                <select name="clubSort">
                    <option selected disabled><%=request.getParameter("clubSort")%>
                    </option>
                    <option value="none">none</option>
                    <option value="United">United</option>
                    <option value="City">City</option>
                    <option value="Chelsea">Chelsea</option>
                    <option value="Arsenal">Arsenal</option>
                    <option value="Liverpool">Liverpool</option>
                </select>
            </td>
            <td>
                <select name="positionSort">
                    <option selected disabled><%=request.getParameter("positionSort")%>
                    </option>
                    <option value="none">none</option>
                    <option value="goalkeeper">goalkeeper</option>
                    <option value="defender">defender</option>
                    <option value="midfielder">midfielder</option>
                    <option value="forward">forward</option>
                </select>
            </td>
            <td>
                <select name="priceSort">
                    <option selected disabled><%=request.getParameter("priceSort")%>
                    </option>
                    <option value="none">none</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                </select>
            </td>
            <td><input type="submit" value="TryAgain"></td>
        </tr>
    </table>
    <input type="hidden" name="cmd" value="tempCommand"/>
    <input type="hidden" name="teamName" value="<%= request.getParameter("teamName") %>"/>
    <input type="hidden" name="playersByName" value="<%= request.getAttribute("playersByName") %>"/>
    <input type="hidden" name="clubSort" value="<%= request.getParameter("clubSort") %>"/>
    <input type="hidden" name="positionSort" value="<%= request.getParameter("positionSort") %>"/>
    <input type="hidden" name="priceSort" value="<%= request.getParameter("priceSort") %>"/>
</form>
    <h1>Results</h1>
    <table style="table-layout:fixed; float:left">
        <c:forEach items="${sortedTeam}" var="player">
            <form action="Servlet" method="post">
        <tr>
            <td><input type="submit" value="I"/></td>
            <td><input type="submit" value="Add"/></td>
            <input type="hidden" name="playersId" value="${player.id}"/>
            <input type="hidden" name="cmd" value="addCommand"/>
            <input type="hidden" name="teamName" value="<%= request.getParameter("teamName") %>"/>
            <input type="hidden" name="sortedTeam" value="${sortedTeam}"/>
            <input type="hidden" name="playersByName" value="<%= request.getAttribute("playersByName") %>"/>
            <input type="hidden" name="clubSort" value="<%= request.getParameter("clubSort") %>"/>
            <input type="hidden" name="positionSort" value="<%= request.getParameter("positionSort") %>"/>
            <input type="hidden" name="priceSort" value="<%= request.getParameter("priceSort") %>"/>

</form>
<td><c:out value="${player.id}"/></td>
<td><c:out value="${player.name}"/></td>
<td><c:out value="${player.age}"/></td>
<td><c:out value="${player.nationality}"/></td>
<td><c:out value="${player.club}"/></td>
<td><c:out value="${player.position}"/></td>
<td><c:out value="${player.price}"/></td>
</tr>
</c:forEach>

</table>

<table border="1" cellpadding="0" cellspacing="0">
    <c:forEach items="${playersByName}" var="players">
        <form action="Servlet" method="post">
        <tr>
            <td><input type="submit" value="-"/></td>
            <input type="hidden" name="playersId" value="${players.id}"/>
            <input type="hidden" name="cmd" value="subCommand"/>
            <input type="hidden" name="teamName" value="<%= request.getParameter("teamName") %>"/>
            <input type="hidden" name="sortedTeam" value="${sortedTeam}"/>
            <input type="hidden" name="playersByName" value="<%= request.getAttribute("playersByName") %>"/>
            <input type="hidden" name="clubSort" value="<%= request.getParameter("clubSort") %>"/>
            <input type="hidden" name="positionSort" value="<%= request.getParameter("positionSort") %>"/>
            <input type="hidden" name="priceSort" value="<%= request.getParameter("priceSort") %>"/>
        </form>
            <td><c:out value="${players.id}"/></td>
            <td><c:out value="${players.name}"/></td>
            <td><c:out value="${players.age}"/></td>
            <td><c:out value="${players.nationality}"/></td>
            <td><c:out value="${players.club}"/></td>
            <td><c:out value="${players.position}"/></td>
            <td><c:out value="${players.price}"/></td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
