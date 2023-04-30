<%-- 
    Document   : session1
    Created on : 25-Feb-2023, 10:36:07 AM
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
        <%
            session.setAttribute("name","Gauhar");
            
            %>
            <a href="session2.jsp">next</a>
    </body>
</html>
