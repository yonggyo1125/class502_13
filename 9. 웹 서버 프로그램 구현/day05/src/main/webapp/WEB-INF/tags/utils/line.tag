<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ attribute name="color" %>
<%@ attribute name="size" type="java.lang.Integer" %>
<%--
<%=color%>
${color}--%>
<div style="color: ${color};">
<%
    for (int i = 0; i < size; i++) {
        out.write("-");
    }
%>
</div>

