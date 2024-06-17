<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="num" value="123000000.12" />

#,###.##### : <fmt:formatNumber value="${num}" pattern="#,###.#####" /><br>
0,000.00000 : <fmt:formatNumber value="${num}" pattern="0,000.00000" /><br>