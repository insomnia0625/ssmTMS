<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/16
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>门店信息编辑页</title>

    <link rel="stylesheet" href="../../layui/css/layui.css">
    <script src="../../layui/layui.js"></script>

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
<h1 align="center">编辑门店信息</h1>
<form name="form1" class="layui-form" method="post" action="storeEdit">
    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">门店名：</label>
        <div class="layui-input-block">
            <input type="text" name="storeName" required  lay-verify="required" value="${store.storeName}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">地址：</label>
        <div class="layui-input-block">
            <input type="text" name="storeAddress" required  lay-verify="required" value="${store.storeAddress}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">联系电话：</label>
        <div class="layui-input-block">
            <input type="text" name="storePhone" required  lay-verify="required" value="${store.storePhone}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">登陆密码：</label>
        <div class="layui-input-block">
            <input type="password" name="storePassword" required  lay-verify="required" value="${store.storePassword}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" align="center">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="storeEdit">确认修改</button>
            <button type="reset" class="layui-btn layui-btn-normal">重置</button>
        </div>
    </div>

</form>
</div>
<script>
    layui.use('form', function() {
        var form = layui.form;
        var $ = layui.$;
        //监听提交
        form.on('submit(storeEdit)', function (data) {
            $.ajax({
                url: "storeEdit",
                type: "post",
                data: data.field,
                dataType: "json",
                success: function (data) {
                    alert(data.msg);
                    layer.closeAll();
                }
            });
            return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });
    });
</script>
</body>
</html>
