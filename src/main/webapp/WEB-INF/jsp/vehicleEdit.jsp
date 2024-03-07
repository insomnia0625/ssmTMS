<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/18
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    .form-panel {
        padding: 40px 40px 10px 10px;
    }
</style>
<div class="form-panel">
    <form class="layui-form" action="vehicleEdit" method="post" lay-filter="vehicle-form">
        <div class="layui-form-item">
            <label class="layui-form-label">车辆编号：</label>
            <div class="layui-input-block">
                <input type="text" name="vId" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">车牌号：</label>
            <div class="layui-input-block">
                <input type="text" name="vNumber" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">负责人：</label>
            <div class="layui-input-block">
                <input type="text" name="vPerson" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">联系电话：</label>
            <div class="layui-input-block">
                <input type="text" name="vPhone" required  lay-verify="required"  autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">是否可用：</label>
            <div class="layui-input-block">
                <input type="text" name="vAvailable" required  lay-verify="required"  autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">载重：</label>
            <div class="layui-input-block">
                <input type="text" name="vCapacity" required  lay-verify="required" placeholder="请输入手机号" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="vehicleEdit">确定</button>
                <button type="reset" class="layui-btn layui-btn-primary" id="btn-cancel">取消</button>
            </div>
        </div>
        <input type="hidden" id="vId" name="vId" value="${param.vId}" />
    </form>
</div>
<script>
    layui.use(['form','table'], function() {
        var form = layui.form;
        var table = layui.table;
        var $ = layui.$;

        var vId = $("#vId").val();
        if (vId!="") {   //编辑用户请求
            $.ajax({
                url:"vehicleData",
                data:"vId=" + vId,
                dataType:"json",
                success:function(data) {
                    form.val('vehicle-form', data);
                }
            });
        }

        //监听提交
        form.on('submit(vehicleEdit)', function (data) {
            $.ajax({
                url: "vehicleEdit",
                type: "post",
                data: data.field,
                dataType: "json",
                success: function (data) {
                    alert(data.msg)
                    table.reload("vehicleTable");
                    layer.closeAll();
                }
            });
            return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });

        $("#btn-cancel").on("click",function() {
            layer.closeAll();
        });

    });
</script>

<%--老版页面--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>编辑车辆信息</h1>--%>
<%--<form name="form1" method="post" action="vehicleEdit">--%>
<%--    <table width="500" border="1" cellspacing="1" cellpadding="1">--%>
<%--        <tr>--%>
<%--            <td>车牌号：</td>--%>
<%--            <td><input type="text" name="vNumber" id="vNumber" value="${vehicle.vNumber}"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>负责人：</td>--%>
<%--            <td><input type="text" name="vPerson" id="vPerson" value="${vehicle.vPerson}"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>联系电话：</td>--%>
<%--            <td><input type="text" name="vPhone" id="vPhone" value="${vehicle.vPhone}"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>是否可用：</td>--%>
<%--            <td><input type="text" name="vAvailable" id="vAvailable" value="${vehicle.vAvailable}"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>车辆载重：</td>--%>
<%--            <td><input type="text" name="vCapacity" id="vCapacity" value="${vehicle.vCapacity}"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td colspan="2" align="center">--%>
<%--                <input type="hidden" name="vId" value="${vehicle.vId}">--%>
<%--                <input type="submit" name="button" id="button" value="提交"></td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>
