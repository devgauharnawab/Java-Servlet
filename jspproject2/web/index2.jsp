<%-- 
    Document   : index2.jsp
    Created on : 28-Feb-2023, 9:48:47 AM
    Author     : gauhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>%
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <% 
            ArrayList<String> al = new ArrayList<>();
            al.add("Lucknow");
            al.add("kanpur");
            for(String s: al){
            }
            out.println(s);
            %>
    </body>
</html>
