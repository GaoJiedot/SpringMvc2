<%--
  Created by IntelliJ IDEA.
  User: MR
  Date: 2024/5/15
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello world</h2>
<form action="/registerUserser" method="post" >
    姓名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    <input type="submit" value="注册">
    <a href="p.jsp">商品</a>
    <a href="order.jsp">商品Id</a>
    <a href="orders.jsp">商品所🈶️订单</a>
    <a href="order_Info.jsp">map查找订单</a>
</form>
</body>
</html>
