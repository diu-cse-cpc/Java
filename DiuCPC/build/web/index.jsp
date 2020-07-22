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
        <h1>Hello World!</h1>
        
        <%= Calendar.getInstance().getTime() %>  
        <%!
            String name = "Sam"; //Seclaration Tag
           
            %>
            <br>
            <%
                out.println("<h3>"+name+"</h3>");
                
if (session.isNew()) {
        out.println("<h1>Welcome to DIU CPC</h1>");
    } else {
    out.println("<h1>WelcomeBack to DIU CPC</h1>");
    }

out.println("<h3>"+session.getId()+"</h3>");
out.println("<h3>"+request.getRemoteUser()+"</h3>");

            %>
        
    </body>
</html>
