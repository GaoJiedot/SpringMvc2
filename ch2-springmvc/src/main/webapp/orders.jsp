<%--
  Created by IntelliJ IDEA.
  User: MR
  Date: 2024/5/22
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/showOrders" method="post">
  <table width="220px" border="1">
    <tr>
      <td>订单号</td>
      <td>订单名称</td>
      <td>配送地址</td>
    </tr>
    <tr>
      <td><input type="text" name="orders[0].orderId" value="1"></td>
      <td><input type="text" name="orders[0].orderName" value="java基础"></td>
      <td><input type="text" name="address" value="宁波海曙"></td>
    </tr>
    <tr>
      <td><input type="text" name="orders[1].orderId" value="2"></td>
      <td><input type="text" name="orders[1].orderName" value="java进阶"></td>
      <td><input type="text" name="address" value="宁波鄞州"></td>
    </tr>
    <tr>
      <td><input type="text" name="orders[2].orderId" value="3"></td>
      <td><input type="text" name="orders[2].orderName" value="java终极"></td>
      <td><input type="text" name="address" value="宁波江北"></td>
    </tr>
  </table>
  <input type="submit" value="订单信息">
</form>
</body>
</html>
