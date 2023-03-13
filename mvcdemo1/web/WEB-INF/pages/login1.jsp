<%-- 
    Document   : login1
    Created on : 13-Mar-2023, 4:56:06 AM
    Author     : gauhar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <% 
             String message = "Hello, world!";
             int num1 = 10;

             int sum = num1 + num2;
          %>
    
             <h1><%= message %></h1>
             <p>The sum of <%= num1 %> and <%= num2 %> is <%= sum %></p>
    </body>
</html>
