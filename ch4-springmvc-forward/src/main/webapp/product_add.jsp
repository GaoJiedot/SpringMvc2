<%--
  Created by IntelliJ IDEA.
  User: yanli
  Date: 2024/6/5
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>商品添加</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
</head>
<body>
    <table id="products" width="60%" border="1">
        <tr align="center">
            <td>欢迎您:</td>
            <td id="username"></td>
        </tr>
        <tr align="center">
            <td colspan="2" align="center">
                <input type="button" value="添加多个按钮" onclick="addProduct()">
            </td>
        </tr>
        <tr align="center">
            <td>商品ID</td>
            <td>商品名称</td>
        </tr>
    </table>
    <script type="text/javascript">
        window.onload = function (){
            var url = "${pageContext.request.contextPath}/getUser";
            $.get(url,function (aa) {
                $("#username").text(aa.name);
            });
        }
        function addProduct(){
            var url = "${pageContext.request.contextPath}/addProduct";
            $.get(url,function (products) {
                for (var i = 0; i < products.length; i++) {
                    $("#products").append("<tr align='center'><td>"+products[i].proId+"</td><td>"
                        +products[i].proName+"</td></tr>");

                }
            });
        }
    </script>
</body>
</html>
