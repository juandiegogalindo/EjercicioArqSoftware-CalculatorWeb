<%-- 
    Document   : calcjsp
    Created on : 16/03/2026, 12:07:59
    Author     : jdgal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<%= request.getContextPath() %>/css/styles.css">
        <title>JSP Page - Calculadora</title>
    </head>
    <center>
    <H1> PROYECTO CALCULADORA JSP </H1>
    <body>
        <form action="calcservlet" method="POST">
            <input type="text" name="t1">
            <input type="text" name="t2">
            <input type="submit" value="ADD">
        </form>
        <form action="calcservlet" method="POST">
            <input type="text" name="t3">
            <input type="text" name="t4">
            <input type="submit" value="REST">
        </form>
        <form action="calcservlet" method="POST">
            <input type="text" name="t5">
            <input type="text" name="t6">
            <input type="submit" value="MULT">
        </form>
        <form action="calcservlet" method="POST">
            <input type="text" name="t7">
            <input type="text" name="t8">
            <input type="submit" value="DIV">
        </form>
        <form action="calcservlet" method="POST">
            <input type="text" name="t9">
            <input type="text" name="t10">
            <input type="submit" value="MOD">
        </form>
        <form action="calcservlet" method="POST">
            <input type="text" name="t11">
            <input type="submit" value="ELEV">
        </form>
    </center>
    </body>
</html>
