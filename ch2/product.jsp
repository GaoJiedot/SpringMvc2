<%--
  Created by IntelliJ IDEA.
  User: MR
  Date: 2024/5/22
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
</head>
<body>
<form id="products">
    <table>
        <tr>
            <td>商品Id</td>
            <td>商品名称</td>
            <td>操作</td>
        </tr>
        <tr>
            <td><input type="text" name="proId" value="1" id="proId"></td>
            <td><input type="text" name="proNmae" value="带鱼" id="proName"></td>
            <td><input type="button"value="提交单个物品" onclick="submitProduct()"></td>
        </tr>  <tr>
        <td><input type="text" name="proId" value="2" id="proId2"></td>
        <td><input type="text" name="proNmae" value="红牛" id="proName2"></td>
        <td><input type="button"value="提交多个物品" onclick="submitProducts()"></td>
    </tr>

    </table>
</form>
<script type="text/javascript">
    function submitProduct(){
               var proId=$("#proId").val();
               var proName=$("#proName").val()
        $.ajax({
            url:"${pageContext.request.contextPath}/getProduct",
            type:"post",
            data:JSON.stringify({
                proId:proId,
                proName:proName
            })
            contentType:"application/json;charset=UTF-8",
            dataType:"json",
            success:function (response){
                alert(response)
            }
        });
    }
    function submitProducts(){
        var pro1={proId:$("#proId,#proName").val(),proName:$("#proId,#proName").val()}
        var pro2={proId2:$("#proId2,#proName2").val(),proName2:$("#proId2,#proName2").val()}
        $.ajax({
            url:"${pageContext.request.contextPath}/getProductList",
            type:"post",
            data:JSON.stringify(
                [pro1,pro2]
            );
            contentType:"application/json;charset=UTF-8",
            dataType:"json",
            success:function (response){
                alert(response)
            }
        });
    }
</script>
</body>
</html>
