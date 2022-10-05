<%-- 
    Document   : sayhello
    Created on : 08/02/2021, 23:08:15
    Author     : viter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SayHello.jsp</title>

        <%@ include file="bootstrap.html" %>
    </head>
    <body style="padding-top: 100px;">
        <!--Cabeçalho-->
        <nav class="navbar navbar-expand-md fixed-top" style="background-color: #44832d; height: 56px;">
            <div class="container-fluid container-menu" style="position: relative; width: 100% !important;">
                <span style="margin: 0; position: absolute; top: 50%; left: 50%; margin-right: -50%; transform: translate(-50%, -50%); color: #fff;">Tarefa DAC - Cabeçalho</span>
            </div>
        </nav>

        <!--Conteúdo-->
        <div class="container mb-4" style="float: center; background-color: #1F519B; border-radius: 10px; width: 500px; margin: 50px auto; color: #fff;">
            <jsp:useBean id="myBean" class="hello.MessageBean"/>
            <h1>Aplicativo HelloWorld</h1>
            <% String lang = request.getParameter("lang"); %>
            <% String time = request.getParameter("time"); %>
            <h2><jsp:setProperty name="myBean" property="lang" value="<%=lang%>"/>
            <jsp:getProperty name="myBean" property="msg"/>, <%=request.getParameter("nome")%>!
            <jsp:setProperty name="myBean" property="time" value="<%=time%>"/><jsp:getProperty name="myBean" property="msg3"/></h2>
            <jsp:getProperty name="myBean" property="msg2"/> <jsp:getProperty name="myBean" property="aut"/>
            <br>
        </div>

        <!--Rodapé-->
        <footer class="page-footer font-small fixed-bottom" style="background-color: #44832d;">
            <div class="text-center py-3" style="color: #fff;">
                Tarefa DAC - Rodapé
            </div>
        </footer>
    </body>
</html>
