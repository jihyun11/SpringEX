<%--
  Created by IntelliJ IDEA.
  User: mozzi
  Date: 2023/04/20
  Time: 9:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<form action="/todo/loan" method="post">
주민번호: <input type="text" id="jumin" name="jumin"><br>
상환예정일: <input type="date" id="exDate" name="exDate"><br>
대출금: <input type="number" id="loanMoney" name="loanMoney"><br>
주소: <input type="text" id="address" name="address"><br>
    <input type="submit" value="제출">

</form>
</body>
</html>
