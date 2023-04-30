<%-- 
    Document   : redirect
    Created on : 04-Mar-2023, 10:04:55 AM
    Author     : gauhar
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:url value="http://facebook.com" var="email">
            <c:param name="name" value="manoj"/>
            <c:param name="age" value="20"/>
        </c:url>
        
        <c:redirect url="${email}"/>
    </body>
</html>
