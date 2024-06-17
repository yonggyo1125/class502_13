<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:catch var="e">
<%
    String str = null;
    str.toUpperCase();
%>
</c:catch>
<c:if test="${e != null}">
    <%-- 에러 메세지 : ${e.getMessage()} --%>
    에러 메세지 : ${e.message}
</c:if>