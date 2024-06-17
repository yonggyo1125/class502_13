<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<c:set var="num" value="100" />
<util:linebox color="blue">
    <h1>안녕하세요!</h1>
    ${num}<br>
    <c:url value="/member/join" />
</util:linebox>

<util:linebox2 color="blue">
    <h1>안녕하세요!</h1>
    ${num}<br>
    <c:url value="/member/join" />
</util:linebox2>