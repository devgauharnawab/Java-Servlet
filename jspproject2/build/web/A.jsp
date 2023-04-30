<%-- 
    Document   : A
    Created on : 28-Feb-2023, 10:42:42 AM
    Author     : gauhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="errordemo.jsp"%>
<%@page session="false"%>
<%@page isThreadSafe="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            int x = 10/0;
            out.println(x);
            %>
    </body>
</html>
