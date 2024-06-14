<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:forTokens var="item" items="Apple#Orange+Melon" delims="#+">
<div>${item}</div>
</c:forTokens>