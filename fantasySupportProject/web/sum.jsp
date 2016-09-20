
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Input data:</h1>

        <form action="SingleServlet" method="post">
            <input type="hidden" name="cmd" value="sum"/>

            <table>
                <tr>
                    <td>a:</td>
                    <td><input type="text" name="a"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        +
                    </td>
                </tr>
                <tr>
                    <td>b:</td>
                    <td><input type="text" name="b"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="calculate"/></td>
                </tr>                
            </table>
        </form>
    </body>
</html>
