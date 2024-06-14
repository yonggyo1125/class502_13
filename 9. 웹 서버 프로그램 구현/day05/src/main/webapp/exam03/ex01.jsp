<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<jsp:useBean id="items" class="java.util.ArrayList" scope="request" />
<%
    // scope='page'일때 조회
    /*
    ArrayList data = (ArrayList)pageContext.getAttribute("items");
    data.add("A");
    data.add("B");
    */
    ArrayList data = (ArrayList)request.getAttribute("items");
    data.add("A");
    data.add("B");
    System.out.println(data);
%>