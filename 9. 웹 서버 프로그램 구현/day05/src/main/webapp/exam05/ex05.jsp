<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:forEach var="cnt" begin="1" end="10" step="2">
    <div>${cnt} 반복</div>
</c:forEach>