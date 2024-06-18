<%@ tag body-content="scriptless" %>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<layout:common>
    <jsp:attribute name="header">
        <h1>메인 레이아웃 상단 영역!</h1>
    </jsp:attribute>
    <jsp:attribute name="footer">
        <h1>메인 레이아웃 하단 영역!</h1>
    </jsp:attribute>
    <jsp:body>
        <jsp:doBody />
    </jsp:body>
</layout:common>