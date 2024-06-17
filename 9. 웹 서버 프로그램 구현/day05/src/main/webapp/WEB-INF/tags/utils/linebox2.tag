<%@ tag body-content="tagdependent" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ attribute name="color" %>
<div style="border: 1px double ${color}; padding: 30px;">
    <jsp:doBody />
</div>