<%-- 
    Document   : loginpages
    Created on : 16-Mar-2023, 7:11:49 AM
    Author     : gauhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Hello Gauhar Nawab</h1>
        <h1>Login Details:</h1>
    <c:forEach var="entry" items="${sendtext}">
        <p>${entry.value}</p>
    </c:forEach>
    </body>
</html>
