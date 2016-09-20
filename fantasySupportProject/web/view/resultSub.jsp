

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>In Java: <%= request.getParameter("a") + " - " +  request.getParameter("b")  + " = " + request.getAttribute("result")%></h1>
     </body>
</html>
