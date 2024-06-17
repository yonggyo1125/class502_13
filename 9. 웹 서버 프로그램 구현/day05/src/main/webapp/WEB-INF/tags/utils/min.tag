<%@ tag body-content="empty" %>
<%@ tag pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ attribute name="num1" type="java.lang.Integer" required="true" %>
<%@ attribute name="num2" type="java.lang.Integer" required="true" %>
<%@ attribute name="var" required="true" rtexprvalue="false" %>
<%@ variable name-from-attribute="var" alias="minimum" variable-class="java.lang.Integer" scope="AT_END" %>
<%
    int min = num1 > num2 ? num2 : num1;
%>

<c:set var="minimum" value="<%=min%>" />
