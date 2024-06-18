<%@ tag body-content="scriptless" %>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ attribute name="header" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>레이아웃 연습!</title>
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