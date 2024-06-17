<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:if test="${!empty param.lang}">
    <fmt:setLocale value="${param.lang}" />
</c:if>

<fmt:setBundle basename="messages.commons" />

<a href="?lang=ko">한국어</a>
<a href="?lang=en">English</a>

    <form>
        <fmt:message key="이메일" />
        <input type="text" name="email"><br>

        <fmt:message key="비밀번호" />
        <input type="password" name="PASSWORD"><br>
        <button type='submit'>
            <fmt:message key="로그인" />
        </button>
    </form>

<h1>
    <fmt:message key="로그인_메세지">
        <fmt:param>이이름</fmt:param>
        <fmt:param>test@test.org</fmt:param>
    </fmt:message>
</h1>