<%--
  Created by IntelliJ IDEA.
  User: MR
  Date: 2024/5/22
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/orderInfo" method="post">
  <table border="1">
    <tr>
      <td>订单Id：<input name="orderId" value="1"></td>
    </tr>
    <tr>
      <td>商品ID</td>
      <td>商品名称</td>
    </tr>
    <tr>
      <td><input name="productInfo['生鲜'].proId" value="1"></td>
      <td><input name="productInfo['生鲜'].proName" value="对虾"></td>
    </tr>
    <tr>
      <td><input name="productInfo['饮料'].proId" value="2"></td>
      <td><input name="productInfo['饮料'].proName" value="2"></td>
    </tr>
  </table>
  <input type="submit" value="提交">
</form>
</body>
</html>
