<%-- 
    Document   : all
    Created on : May 3, 2015, 5:59:13 AM
    Author     : zeus
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach items="${goods}" var="good">
            <div>${good.name} - ${good.price}</div>
        </c:forEach>
    </body>
</html>
