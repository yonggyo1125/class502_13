<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="jakarta.servlet.*" %>
<h1>ex01.jsp - 상단</h1>
<%
    RequestDispatcher rd = request.getRequestDispatcher("ex02.jsp");
    //rd.forward(request, response);
    rd.include(request, response);
%>
<h1>ex01.jsp - 하단</h1>