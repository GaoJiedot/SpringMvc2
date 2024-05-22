<%--
  Created by IntelliJ IDEA.
  User: MR
  Date: 2024/5/22
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/getProduct" method="post">
    <table width="220px" bgcolor="1">
        <tr>
            <td>选择</td>
            <td>商品名称</td>
        </tr>
        <tr>
            <td><input type="checkbox" value="1" name="proIds"></td>
            <td>java基础</td>
        </tr>
        <tr>
            <td><input type="checkbox" value="2" name="proIds"></td>
            <td>java进阶</td>
        <tr>
            <td><input type="checkbox" value="3" name="proIds"></td>
            <td>java终极</td>
        </tr>
        </tr>
    </table>
    <input type="submit" value="提交">
</form>
</body>
</html>
