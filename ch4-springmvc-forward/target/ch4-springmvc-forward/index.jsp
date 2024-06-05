<%--
  Created by IntelliJ IDEA.
  User: yanli
  Date: 2024/5/29
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/showdc">测试out回写</a><br>
<a href="${pageContext.request.contextPath}/showjsona">测试json-out回写</a><br>
<a href="${pageContext.request.contextPath}/product_add.jsp">测试页面回写</a><br>
<hr>
<a href="${pageContext.request.contextPath}/register">测试1</a><br>
<a href="${pageContext.request.contextPath}/showNoData">测试2</a><br>
<a href="${pageContext.request.contextPath}/showNoDatan">测试3</a><br>
<hr>
<a href="${pageContext.request.contextPath}/login.jsp">测试1</a><br>
<a href="${pageContext.request.contextPath}/showModelAndview">测试2</a><br>
</body>
</html>
