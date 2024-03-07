<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/22
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加新的供应商信息</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">

    <style>
        .box{
            position: absolute;
            top: 20%;
            left: 25%;
        }
    </style>
</head>
<body>
<div class="box">
<h1 align="center">添加新的供应商信息</h1>
<form name="form1" class="layui-form" method="post" action="supplierAdd">
    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">供应商名：</label>
        <div class="layui-input-block">
            <input type="text" name="supplierName" required  lay-verify="required" placeholder="请输入供应商名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">地址：</label>
        <div class="layui-input-block">
            <input type="text" name="supplierAddress" required  lay-verify="required" placeholder="请输入供应商地址" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">联系电话：</label>
        <div class="layui-input-block">
            <input type="text" name="supplierPhone" required  lay-verify="required" placeholder="请输入供应商的联系电话" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" align="center">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="supplierAdd">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-normal">重置</button>
        </div>
    </div>
</form>
</div>

<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form;
        var $ = layui.$;

        //监听提交
        form.on('submit(supplierAdd)', function (data) {
            $.ajax({
                url: "supplierAdd",
                type: "post",
                data: data.field,
                dataType: "json",
                success: function (data) {
                    alert(data.msg)
                    layer.closeAll();
                }
            });
            return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });
    });
</script>
</body>
</html>
