<%@ page contentType="text/html; charset=UTF-8" %>
<%
    application.setAttribute("num", 100);
    request.setAttribute("num", 200);
    pageContext.setAttribute("num", 300);

    pageContext.setAttribute("max-num", 1000);
%>

pageContext.num : ${pageScope.num}<br>
request.num : ${requestScope.num}<br>
application.num : ${applicationScope['num']}<br>

max-num : ${pageScope['max-num']}<br>