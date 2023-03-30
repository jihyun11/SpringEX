<%--
  Created by IntelliJ IDEA.
  User: mozzi
  Date: 2023/03/29
  Time: 10:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${message}</h1>
<h1><c:out value="${message}"></c:out> </h1>

</body>
</html>
