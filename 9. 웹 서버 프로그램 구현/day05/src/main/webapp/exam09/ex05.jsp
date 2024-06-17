<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<util:min var="min" num1="100" num2="200" />
${min}
<br>
<util:forEach var="a" begin="10" end="20">
    ${a}번째<br>
</util:forEach>