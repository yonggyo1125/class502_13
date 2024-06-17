<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="date" value="<%=new Date()%>" />

서울 : <fmt:formatDate value="${date}" type="both" /><br>

<fmt:timeZone value="Europe/London">
런던 : <fmt:formatDate value="${date}" type="both" /><br>
</fmt:timeZone>

<fmt:timeZone value="America/New_York">
뉴욕 : <fmt:formatDate value="${date}" type="both" /><br>
</fmt:timeZone>