<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<c:url var="actionUrl" value="/member/join" />
<layout:main title="회원가입">
    <h1>회원가입</h1>
    <form method="post" action="${actionUrl}" autocomplete="off">
        <dl>
            <dt>이메일</dt>
            <dd>
                <input type="text" name="email">
            </dd>
        </dl>
        <dl>
            <dt>비밀번호</dt>
            <dd>
                <input type="password" name="password">
            </dd>
        </dl>
        <dl>
            <dt>비밀번호 확인</dt>
            <dd>
                <input type="password" name="confirmPassword">
            </dd>
        </dl>
    </form>

</layout:main>