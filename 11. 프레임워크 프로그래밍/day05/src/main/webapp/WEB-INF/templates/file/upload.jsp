<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form method="post" autocomplete="off" enctype="multipart/form-data">
    제목 : <input type="text" name="subject"><br>
    파일 : <input type="file" name="file"><br>
    <button type="submit">전송하기</button>
</form:form>