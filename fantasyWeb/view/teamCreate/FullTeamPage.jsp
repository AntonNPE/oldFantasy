<%--
  Created by IntelliJ IDEA.
  User: Shuric
  Date: 22.09.2016
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Your team is : <%= request.getAttribute("name") %>
    <h1> Your team is : <%= request.getAttribute("team") %>

</body>
</html>
