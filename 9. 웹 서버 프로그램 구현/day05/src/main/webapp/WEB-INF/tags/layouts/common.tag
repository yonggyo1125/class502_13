<%@ tag body-content="scriptless" %>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ attribute name="header" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>
<%@ attribute name="commonCss" fragment="true" %>
<%@ attribute name="commonJs" fragment="true" %>
<%@ attribute name="title" %>
<c:url var="cssUrl" value="/static/css/" />
<c:url var="jsUrl" value="/static/js/" />
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>${title}</title>
        <link rel="stylesheet" type="text/css" href="${cssUrl}style.css">
        <jsp:invoke fragment="commonCss" />
        <c:if test="${addCss != null}">
            <c:forEach var="cssFile" items="${addCss}">
                <link rel="stylesheet" type="text/css" href="${cssUrl}${cssFile}.css">
            </c:forEach>
        </c:if>

        <script src="${jsUrl}common.js"></script>
        <jsp:invoke fragment="commonJs" />
        <c:if test="${addScript != null}">
            <c:forEach var="jsFile" items="${addScript}">
                <script src="${jsUrl}${jsFile}.js"></script>
            </c:forEach>
        </c:if>
    </head>
    <body>
        <header>
            <jsp:invoke fragment="header" />
        </header>
        <main>
            <jsp:doBody />
        </main>
        <footer>
            <jsp:invoke fragment="footer" />
        </footer>
    </body>
</html>