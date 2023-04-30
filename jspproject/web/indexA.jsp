<%-- 
    Document   : index
    Created on : 23-Feb-2023, 3:43:51 PM
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
        <h1>Hello JSP!</h1>
        <%@include file ="Header.jspf" %>
        <%@include file="Sider.jspf" %>
        <h2>This is Index Page</h2>
        <%@include file="Footer.jspf" %>
        <%
            response.sendRedirect("indexB.jsp");
            %>
            <% request.initGetParameter("name");
            %>
    </body>
</html>
