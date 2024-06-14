<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="board.entities.BoardData" %>
<jsp:useBean id="item" class="board.entities.BoardData" />
<jsp:setProperty name="item" property="subject" value="제목" />
<jsp:setProperty name="item" property="content" value="내용" />
<jsp:setProperty name="item" property="poster" value="작성자" />

<%--
제목: ${item.getSubject()}<br>
--%>
제목: ${item.subject}<br>
내용: ${item.content}<br>
작성자: ${item.poster}<br>

<%--
제목: <jsp:getProperty name="item" property="subject" /><br>
내용: <jsp:getProperty name="item" property="content" /><br>
작성자: <jsp:getProperty name="item" property="poster" /><br>
--%>