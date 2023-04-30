<%-- 
    Document   : taglib1
    Created on : 03-Mar-2023, 3:27:10 PM
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
        <c:set var="age" value="25" scope="session"/>
          <c:remove var="age" scope="session"/>
        <c:out value="${sessionScope.age}"/>
      
    </body>
</html>
