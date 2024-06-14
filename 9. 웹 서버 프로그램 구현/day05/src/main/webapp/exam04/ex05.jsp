<%@ page contentType="text/html; charset=UTF-8" %>
User-Agent: ${header['User-Agent']}<br>

JSESSIONID : ${cookie.JSESSIONID.getValue()}<br>
JSESSIONID : ${cookie.JSESSIONID.value}<br>
key1 : ${initParam.key1}<br>

URI : ${pageContext.getRequest().getRequestURI()}<br>
URI : ${pageContext.request.requestURI}<br>