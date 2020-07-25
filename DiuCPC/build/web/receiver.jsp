<%-- 
    Document   : receiver
    Created on : Jul 25, 2020, 4:16:32 PM
    Author     : rktirtho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String preSet = "qwert";
            String email = (String) request.getParameter("email");
            String password = (String) request.getParameter("pass");

            if (password.equals(preSet)) {
                out.print("<h2>Login Success</h2>");
            } else {
                out.print("<h2 style=\"color:red\">Wrong Password</h2>");
            }
        %>
        <h1>Hello World!</h1>
    </body>
</html>
