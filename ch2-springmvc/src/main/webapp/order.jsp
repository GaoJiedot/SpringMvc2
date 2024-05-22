<%--
  Created by IntelliJ IDEA.
  User: MR
  Date: 2024/5/22
  Time: 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
 <form action="${pageContext.request.contextPath}/showOrderWithUser " method="post">
   所属订单：<input type="text" name="username"><br>
   订单编号：<input type="text" name="order.orderId"><br>
   <input type="submit" value="查询">
 </form>
</body>
</html>
