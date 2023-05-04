<jsp:useBean id="dto" scope="request" type="com.example.webstudy.service.LoanServicempl"/>
<%--
  Created by IntelliJ IDEA.
  User: mozzi
  Date: 2023/05/04
  Time: 10:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/todo/loanresult" method="get">
    <input type="text" name="jumin" value=<c:out value="${dto.getJumin(jumin)}">>
    <input type="text" name="address" value="${dto.address}">
    <input type="text" name="loanMoney" value="${dto.loanMoney}">
    <input type="text" name="exDate" value="${dto.exDate}">



</form>

</body>
</html>