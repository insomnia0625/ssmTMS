<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/5/6
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
 <script type="text/javascript"  src="webjars/jquery/3.4.1/dist/jquery.min.js"  charset="UTF-8"></script>
<head>
    <title>制定运输计划</title>

    <link rel="stylesheet" href="../../layui/css/layui.css">
<script>
    function assignVehicle(supplierId){
        $.ajax({
            url:"assignVehicle",
            success:function (data) {
                layer.open({
                    type: 1,
                    title: "指派运输车辆",
                    content: data,
                    area: ['500px', '500px']
                });
            }
        });
    }
</script>
</head>
<body>
<h1>制定运输计划</h1>
<br/>
<h2>
    单位运价信息：
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑表数据</a>
</h2>
<table class="layui-table" lay-even lay-skin="row">
    <tr><th>单位运价：</th><th>门店1</th><th>门店2</th><th>门店3</th><th>门店4</th></tr>
<%--    <c:forEach items="${transportPriceList}" var="transportPrice">--%>
        <tr>
            <td>供应商1</td>
            <td>${transportPriceList[0].transportPrice}</td>
            <td>${transportPriceList[1].transportPrice}</td>
            <td>${transportPriceList[2].transportPrice}</td>
            <td>${transportPriceList[3].transportPrice}</td>
        </tr>

        <tr>
            <td>供应商2</td>
            <td>${transportPriceList[4].transportPrice}</td>
            <td>${transportPriceList[5].transportPrice}</td>
            <td>${transportPriceList[6].transportPrice}</td>
            <td>${transportPriceList[7].transportPrice}</td>
        </tr>

        <tr>
            <td>供应商3</td>
            <td>${transportPriceList[8].transportPrice}</td>
            <td>${transportPriceList[9].transportPrice}</td>
            <td>${transportPriceList[10].transportPrice}</td>
            <td>${transportPriceList[11].transportPrice}</td>
        </tr>
</table>

<br/>
<h2>供求关系：</h2>
<form name="form1" method="post" action="">
<table class="layui-table" lay-even lay-skin="row">
<%--    <colgroup>--%>
<%--        <col width="150">--%>
<%--        <col width="200">--%>
<%--    </colgroup>--%>
    <tr><th>货物名：<input type="text" name="gName" id="gName" required  lay-verify="required" placeholder="运输货物名称"></th><th>门店1</th><th>门店2</th><th>门店3</th><th>门店4</th><th >供应量：</th></tr>
    <%--    <c:forEach items="${transportPriceList}" var="transportPrice">--%>
    <tr>
        <td>供应商1　　　　　<a class="layui-btn layui-btn-xs" onclick="assignVehicle(1)">派车</a></td>
        <td><div id="div11"></div></td>
        <td><div id="div12"></div></td>
        <td><div id="div13"></div></td>
        <td><div id="div14"></div></td>
        <td><input type="text" name="supplier1" id="supplier1" required  lay-verify="required"></td>
    </tr>

    <tr>
        <td>供应商2　　　　　<a class="layui-btn layui-btn-xs" onclick="assignVehicle(2)">派车</a></td>
        <td><div id="div21"></div></td>
        <td><div id="div22"></div></td>
        <td><div id="div23"></div></td>
        <td><div id="div24"></div></td>
        <td><input type="text" name="supplier2" id="supplier2" required  lay-verify="required"></td>
    </tr>

    <tr>
        <td>供应商3　　　　　<a class="layui-btn layui-btn-xs" onclick="assignVehicle(3)">派车</a></td>
        <td><div id="div31"></div></td>
        <td><div id="div32"></div></td>
        <td><div id="div33"></div></td>
        <td><div id="div34"></div></td>
        <td><input type="text" name="supplier3" id="supplier3" required  lay-verify="required"></td>
    </tr>

    <tr>
        <td>需求量：</td>
        <td><input type="text" name="store1" id="store1" required  lay-verify="required"></td>
        <td><input type="text" name="store2" id="store2" required  lay-verify="required"></td>
        <td><input type="text" name="store3" id="store3" required  lay-verify="required"></td>
        <td><input type="text" name="store4" id="store4" required  lay-verify="required"></td>
        <td><button lay-submit lay-filter="makeTransportPlan"><a class="layui-btn layui-btn-xs">生成运输方案</a></button></td>
    </tr>
</table>
</form>



<script>
    layui.use('form', function() {
        var form = layui.form;
        var $ = layui.$;


        form.on('submit(makeTransportPlan)', function (data) {
            $.ajax({
                url: "makeTransportPlan",
                type:"post",
                dataType:"json",
                data: {
                    gName:$("#gName").val(),
                    store1:$("#store1").val(),
                    store2:$("#store2").val(),
                    store3:$("#store3").val(),
                    store4:$("#store4").val(),
                    supplier1:$("#supplier1").val(),
                    supplier2:$("#supplier2").val(),
                    supplier3:$("#supplier3").val(),
                },
                success: function (data) {
                    $("#div11").html(data[0][0])
                    $("#div12").html(data[0][1])
                    $("#div13").html(data[0][2])
                    $("#div14").html(data[0][3])

                    $("#div21").html(data[1][0])
                    $("#div22").html(data[1][1])
                    $("#div23").html(data[1][2])
                    $("#div24").html(data[1][3])

                    $("#div31").html(data[2][0])
                    $("#div32").html(data[2][1])
                    $("#div33").html(data[2][2])
                    $("#div34").html(data[2][3])

                    alert("生成成功！");
                }
            });
            return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });



    });
</script>
</body>
</html>
