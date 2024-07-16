<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1>회원 목록</h1>
<form:form method="get" autocomplete="off" modelAttribute="memberSearch">
    가입일
    <form:input path="sDate" />
    <form:errors path="sDate" />
     ~
    <form:input path="eDate" />
    <form:errors path="eDate" />
    <button type="submit">검색하기</button>
</form:form>