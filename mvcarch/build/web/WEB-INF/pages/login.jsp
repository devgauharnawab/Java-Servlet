<%-- 
    Document   : login
    Created on : 16-Mar-2023, 5:00:47 AM
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
        <h1>Login Form</h1>
        <form action="http://localhost:8080/mvcarch/fc/?action=model&page=LoginModel" method="POST">
            <input type="text" name="name" placeholder="Username:"/><br>
            <input type="password" name="password" placeholder="Password:"/><br>
            <input type="submit" value="submit"/>
        </form>
    </body>
</html>
