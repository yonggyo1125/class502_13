<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<c:set var="str" value="Apple,Melon,Orange,Grape" />
<c:set var="fruits" value="${fn:split(str, ',')}" />
str : ${str}<br>
fruits : ${fruits}<br>

<c:forEach var="fruit" items="${fruits}">
${fruit}<br>
</c:forEach>

str2 : ${fn:join(fruits, '#')}<br>