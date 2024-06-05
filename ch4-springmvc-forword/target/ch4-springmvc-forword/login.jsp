<%--
  Created by IntelliJ IDEA.
  User: MR
  Date: 2024/5/29
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}login">
  姓名<input name="name"><br>
  密码<input name="pasdword"><br>
  <input type="submit" value="login">
</form>

</body>
</html>
