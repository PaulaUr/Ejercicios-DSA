<%--
  Created by IntelliJ IDEA.
  User: pauli
  Date: 18/11/2016
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form action="EServlet" method="GET">
    <div class="jumbotron">
        <h1>Series Fibonacci</h1>
    </div>
    <div class="form-group">
        <input type= "text" class="form-control" name="serie" id="num">
    </div>
    <button type="submit" class="btn btn-default">Enviar</button>
</form>


</body>
</html>
