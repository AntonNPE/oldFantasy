<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<c:forEach var="row" items="${collection}" varStatus="rowCounter">
    <tr>
        <td><c:out value="${rowCounter.count}"/></td>
        <td><c:out value="${row.id}"/></td>
        <td><c:out value="${row.name}"/></td>
        <td><c:out value="${row.description}"/></td>
    </tr>
</c:forEach>
</body>
</html>
