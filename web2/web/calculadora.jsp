<%--
  Created by IntelliJ IDEA.
  User: pauli
  Date: 12/11/2016
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
</bod>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
    </script>
</head>
<body>

<div class="container">
<form action="/CalServlet" method="POST">

        <div class="jumbotron">
            <h1>Calculadora </h1>
        </div>
    <div class="form-group">
        <label for="num1">Introduce el 1º numero: </label>
    <input type= "text" class="form-control" name="num1" id="num1">
    </div>
    <div class="form-group">
        <label for="num2">Introduce el 2º numero: </label>
        <input type= "text" class="form-control" name="num2" id="num2" >
    </div>

    <div class="form-group">
        <label for="op">Introduce el tipo de operacion(+ , - , * , /): </label>
        <input type= "text" class="form-control" name="op" id="op" >
    </div>
    <button type="submit" class="btn btn-default">Enviar</button>
</form>

    <ul class="pager">
        <li class="previous"><a href="index.jsp">Previous</a> </li>
    </ul>
    </div>
</body>
</html>
