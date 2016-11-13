<%--
  Created by IntelliJ IDEA.
  User: pauli
  Date: 13/11/2016
  Time: 2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
    </script>
</head>
<body>
    <div class="conatiner">
    <h1>Fibonacci series hasta: <%=request.getAttribute("p1")%></h1>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Nº </th>
            <th>resultados </th>
        </tr>
        </thead>
        <tbody>
        <tr>

            <td><%=request.getAttribute("result")%></td>
        </tr>
        </tbody>
    </table>
    </div>
</body>
</html>
