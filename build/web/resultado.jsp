<%-- 
    Document   : index
    Created on : 2 feb 2022, 22:21:02
    Author     : Usre
--%>

<%@page import="java.util.Scanner"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="calculos.Triangulo"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>Hello World!</h1>
    <%
        String n1=request.getParameter("num1");
        String n2=request.getParameter("num2");
        
        Triangulo s=new Triangulo(n1,n2);
        s.hacerSuma();
        int resultado=s.getResultado();
    %>
    <%=resultado%>
    </body>
</html>
