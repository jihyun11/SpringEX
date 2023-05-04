

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
    <tr>

        <td>${loanDTO.jumin}</td> 님의 주소는
        <td>${loanDTO.address}</td> 이며, 대출 신청 금액은
        <td>${loanDTO.loanMoney}</td> 원이고, 환급 예정일은
        <td>${loanDTO.exDate}</td> 입니다.
    </tr>
</form>


</form>

</body>
</html>