<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%
    List<String> names = new ArrayList<>();
    names.add("이름1");
    names.add("이름2");
    out.write(names);
%>