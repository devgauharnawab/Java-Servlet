<%-- 
    Document   : index2
    Created on : 25-Feb-2023, 10:03:32 AM
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
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            out.println("Name is " + name + " age is " + age);
            %>
            
            <h1>Gauhar</h1>
            <h2>Gauhar</h2>
            <h3>Gauhar</h3>
            <h4>Gauhar</h4>
            <h5>Gauhar</h5>
            <h6>Gauhar</h6>
    </body>
</html>
