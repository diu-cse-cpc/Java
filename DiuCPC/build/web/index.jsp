<%-- 
    Document   : index
    Created on : Jul 22, 2020, 4:19:17 PM
    Author     : rktirtho
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <fieldset>
        <form action="receiver.jsp" method="POST">
           
            Email : <input type="email" name="email" /><br>
            Password: <input type="password" name ="pass" /><br>
            <input type="submit"/>
        </form>
            
        </fieldset>
        <a href="receiver.jsp">Go Next Page</a>

    </body>
</html>
