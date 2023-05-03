<%--
  Created by IntelliJ IDEA.
  User: mozzi
  Date: 2023/05/03
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>대출 실행</h2>
<form action="/todo/loanconfig" method="post">
주민번호: <input type="text" id="jumin" name="jumin"><br>
주소: <input type="text" id="address" name="address"><br>
<input type="submit" value="제출">

</form>
</body>
</html>
