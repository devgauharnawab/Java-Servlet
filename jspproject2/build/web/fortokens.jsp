<%-- 
    Document   : fortokens
    Created on : 03-Mar-2023, 4:35:16 PM
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
        <%
            String al = "Alahabad-Jaunpur-Sitapur";
            session.setAttribute("cities",al);
            %>
            <form action="#" method="POST">
                <select name="cities">
                    <option value="">select city</option>
                    <c:forTokens var="ct" items="${sessionScope.cities}" delims="-">
                        <option value=${ct} > ${ct}</option> 
                    </c:forTokens>
                </select>
            </form>
    </body>
</html>
