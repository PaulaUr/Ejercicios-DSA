
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
<div class="container">

        <div class="jumbotron">
            <h1>User Web</h1>
        </div>
        <h2><%=request.getAttribute("Result")%></h2>

    <ul class="pager">
        <li class="previous"><a href="index.jsp">Previous</a> </li>
    </ul>
</div>
</body>
</html>
