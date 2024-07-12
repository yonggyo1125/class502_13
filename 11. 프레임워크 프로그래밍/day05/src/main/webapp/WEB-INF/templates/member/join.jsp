<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url var="actionUrl" value="/member/join" />
${commonValue}
<h1>회원가입</h1>
<form:form method="POST" action="${actionUrl}" autocomplete="off" modelAttribute="requestJoin">
    <dl>
        <dt>이메일</dt>
        <dd>
            <form:input path="email" cssClass="input-txt" cssStyle="border: 1px solid red; outline: none;"/>
        </dd>
    </dl>
    <dl>
        <dt>비밀번호</dt>
        <dd>
            <form:password path="password" />
        </dd>
    </dl>
    <dl>
        <dt>비밀번호 확인</dt>
        <dd>
           <form:password path="confirmPassword" />
        </dd>
    </dl>
    <dl>
        <dt>회원명</dt>
        <dd>
            <form:input path="userName" />
        </dd>
    </dl>
    <dl>
        <dt>취미</dt>
        <dd>
            <form:radiobuttons path="hobby" items="${hobbies2}" itemLabel="code" itemValue="value" />
             <%--
            <form:select path="hobby">
                <option value=''>- 선택하세요 -</option>
                <form:option value="hobby0" label="취미0" />
                <form:options items="${hobbies2}" itemLabel="code" itemValue="value" />
            </form:select>


            <form:select path="hobby">
                <option value=''>- 선택하세요 -</option>
                <form:options items="${hobbies}" />
            </form:select>

            <form:select path="hobby" items="${hobbies}" />
            <form:checkboxes path="hobby" items="${hobbies}" />
            --%>
        </dd>
    </dl>
    <dl>
        <dt>주소</dt>
        <dd>
            <form:input path="addr.zipCode" placeholder="우편번호" />
            <form:input path="addr.address" placeholder="주소" />
            <form:input path="addr.addressSub" placeholder="나머지 주소" />
        </dd>
    </dl>
    <dl>
        <dt>약관동의</dt>
        <dd>
            <form:checkbox path="agree" value="true" label="회원가입 약관에 동의합니다." />
        </dd>
    </dl>
    <button type="submit">가입하기</button>
</form:form>