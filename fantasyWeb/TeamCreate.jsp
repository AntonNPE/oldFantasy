

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<h1>Welcome on TeamCreatePage</h1>
<h1>Please, enter name of your team</h1>

<form action="Servlet" method="post">
    <table>
        <tr>
            <td> Team name is : </td>
            <td><input type="text" name="teamName"/></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="Enter"/></td>
        </tr>
    </table>
    <input type="hidden" name="cmd" value="teamCreate"/>
</form>
</body>
</html>
