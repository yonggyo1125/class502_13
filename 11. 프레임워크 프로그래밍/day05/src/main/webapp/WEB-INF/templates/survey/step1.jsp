<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url var="actionUrl" value="/survey/step2" />

<h1>step1</h1>

<form:form method="post" action="${actionUrl}" autocomplete="off" modelAttribute="requestSurvey">
    질문1 : <form:input path="q1" /><br>
    질문2 : <form:input path="q2" /><br>
    <button type="submit">다음 설문</button>
</form:form>
