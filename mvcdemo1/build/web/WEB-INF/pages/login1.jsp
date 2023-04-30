<%-- 
    Document   : login1
    Created on : 13-Mar-2023, 4:56:06 AM
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
        <form action="http://localhost/8080/mvcdemo1/fcd/?action=model&page=LoginModel" method="POST">
        <input type="text" id="username" name="username">
         <input type="password" id="password" name="password">

          <button type="submit">Log In</button>
       </form>
    </body>
</html>
