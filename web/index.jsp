<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 30.03.2017
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>
        Вторая страница
    </title>
    <link href="css/fwa.css" type="text/css" rel="stylesheet">
</head>

<body>
<h1>Результат запроса</h1>

<%--<div id="table">--%>
<table id="table" border="1">
    <tr><th>ID</th><th>Имя</th><th>Фамилия</th></tr>
    <tr><td>${requestScope.id}</td><td>${requestScope.name}</td><td>${requestScope.secondName}</td></tr>
</table>
<%--</div>--%>
</body>


</html>
