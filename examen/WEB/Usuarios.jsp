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
    <form action="/EServlet" method="POST">

        <div class="jumbotron">
            <h1>Login de Usuarios </h1>
        </div>

        <div class="form-group">
            <label for="login">Login : </label>
            <input type= "text" class="form-control" name="login" id="login">
        </div>
        <div class="form-group">
            <label for="contraseña">Password : </label>
            <input type= "text" class="form-control" name="contraseña" id="contraseña" >
        </div>

        <button type="submit" class="btn btn-default">Enviar</button>
    </form>

    <ul class="pager">
        <li class="previous"><a href="index.jsp">Previous</a> </li>
    </ul>
</div>
</body>
</html>
