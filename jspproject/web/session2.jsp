<%-- 
    Document   : session2
    Created on : 25-Feb-2023, 10:36:25 AM
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
        <%= session.getAttribute("name")%>
        </body>
</html>
