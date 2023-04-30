<%-- 
    Document   : taglibif
    Created on : 03-Mar-2023, 3:55:19 PM
    Author     : gauhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var="age" value="50" scope="session"/>
        <c:if test="${sessionScope.age eq 50}">
        <c:out value="${sessionScope.age}"/>
    </c:if>
    </body>
</html>
