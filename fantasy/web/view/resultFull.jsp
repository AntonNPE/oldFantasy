
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<jsp:useBean id="service" class="web.model.logic.FullTeamService" />
<jsp:useBean id="team" class="web.model.entity.Team" />

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<c:set var="players" scope="session">
    ${players}
</c:set>
<c:set var="player" scope="session">
    ${player}
</c:set>

<c:set var="allteam" value="${service.team}" />

<c:forEach var="unit" begin="0" end="2">
    <h5>
        <c:out value="${unit}"/> =  <c:out value="${allteam[unit]}"/>
    </h5>

</c:forEach>

</body>
</html>
