<%@ page contentType="text/html; charset=UTF-8" %>
<%
    //pageContext.setAttribute("key1", "value1");
    request.setAttribute("key1", "value1");
%>
<jsp:include page="ex02.jsp" />

<%
    //String key1 = (String)pageContext.getAttribute("key1");
    String key1 = (String)request.getAttribute("key1");
%>
<div>
ex01-key1: <%=key1%>
</div>