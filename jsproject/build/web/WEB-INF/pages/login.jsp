<%-- 
    Document   : login
    Created on : 16-Mar-2023, 11:45:10 AM
    Author     : gauhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="http://localhost/8080/jsproject/fc/?action=Model&page=LoginModel" method="POST">
            <input type="text" name="username" placeholder="name"/><br>
            <input type="password" name="password" placeholder="Password"/><br>
            <input type="submit" value="submit"/>
        </form>
    </body>
</html>
