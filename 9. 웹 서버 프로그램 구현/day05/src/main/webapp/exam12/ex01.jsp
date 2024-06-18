<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Cookie cookie = new Cookie("key3", "value3");
    cookie.setPath(request.getContextPath());
    cookie.setHttpOnly(true);
    response.addCookie(cookie);
%>