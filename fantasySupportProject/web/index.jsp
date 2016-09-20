

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <style> table {
        border-spacing: 0;
        empty-cells: hide;
    }
    td {
        padding: 10px 20px;
        text-align: center;
        border-bottom: 1px solid #F4EEE8;
        transition: all 0.5s linear;
    }
    td:first-child {
        text-align: left;
        color: #3D3511;
        font-weight: bold;
    }
    th {
        padding: 40px 80px;
        color: #3D3511;
        border-bottom: 1px solid #F4EEE8;
        border-top-left-radius: 10px;
        border-top-right-radius: 10px;
    }
    td:nth-child(even) {
        background: #F6D27E;
    }
    td:nth-child(odd) {
        background: #D1C7BF;
    }
    th:nth-child(even)  {
        background: #F6D27E;
    }
    th:nth-child(odd)  {
        background: #D1C7BF;
    }
    .round-top {
        border-top-left-radius: 5px;
    }
    .round-bottom {
        border-bottom-left-radius: 5px;
    }
    tr:hover td{
        background: #D1C7BF;
        font-weight: bold;
    }
    </style>

    </head>
    <body>
<table>
    <tr>
        <th></th>
        <th><a href="sum.jsp"/>sum</th>
        <th><a href="sub.jsp"/>sub</th>
        <th><a href="mul.jsp"/>mul</th>
        <th><a href="div.jsp"/>div</th>
        <th><a href="rest.jsp"/>rest</th>
        <th><a href="fullTeam.jsp"/>FullTeam</th>
    </tr>
</table>
        
    </body>
</html>
