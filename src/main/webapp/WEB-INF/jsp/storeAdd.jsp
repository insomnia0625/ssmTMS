<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/15
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加门店页</title>

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
<h1 align="center">添加新门店</h1>
    <form class="layui-form" action="" lay-filter="store-form">

    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">门店名：</label>
        <div class="layui-input-block">
            <input type="text" name="storeName" required  lay-verify="required" placeholder="请输入门店名" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">地址：</label>
        <div class="layui-input-block">
            <input type="text" name="storeAddress" required  lay-verify="required" placeholder="请输入门店地址" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">联系电话：</label>
        <div class="layui-input-block">
            <input type="text" name="storePhone" required  lay-verify="required" placeholder="请输入门店的联系电话" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item" align="center">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit lay-filter="storeAdd">提交</button>
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
        form.on('submit(storeAdd)', function (data) {
            $.ajax({
                url: "storeAdd",
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
