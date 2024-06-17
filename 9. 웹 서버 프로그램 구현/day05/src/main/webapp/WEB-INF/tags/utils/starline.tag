<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ tag import="java.util.*" %>
<%@ tag dynamic-attributes="attrs" %>
<%
    Map<String, String> attrs = (Map<String, String>)jspContext.getAttribute("attrs");
    String _size = attrs.getOrDefault("size", "0");
    int size = Integer.parseInt(_size);
%>

<div style="color: ${attrs.color};">
<%
    for (int i = 0; i < size; i++) {
        out.write("*");
    }
%>
</div>


<%--
color : ${attrs.color}<br>
size : ${attrs.size}<br>
--%>