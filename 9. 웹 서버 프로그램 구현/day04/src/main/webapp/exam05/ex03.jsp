<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.net.*" %>
<h1>ex03.jsp</h1>
<%
    String key1 = URLEncoder.encode("이름1", "UTF-8");
%>
<jsp:forward page="ex04.jsp">
    <jsp:param name="key1" value="<%=key1%>" />
    <jsp:param name="key2" value="value2" />
</jsp:forward>