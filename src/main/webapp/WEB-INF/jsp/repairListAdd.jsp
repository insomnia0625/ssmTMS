<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/20
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>填写新补货单</title>

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
    <h1 align="center">添加补货申请</h1>
    <form class="layui-form" action="" lay-filter="repairListAdd">

        <div class="layui-form-item" style="width: 500px">
            <label class="layui-form-label">货物名：</label>
            <div class="layui-input-block">
                <input type="text" name="rGName" required  lay-verify="required" placeholder="请输入货物名" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item" style="width: 500px">
            <label class="layui-form-label">补货数量：</label>
            <div class="layui-input-block">
                <input type="number" name="rGNumber" required  lay-verify="required" placeholder="请输入补货的数量" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item" style="width: 500px">
            <label class="layui-form-label">填写日期：</label>
            <div class="layui-input-block">
                <input type="date" name="rDate" required  lay-verify="required" placeholder="年/月/日" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item" align="center">
            <div class="layui-input-block">
                <button type="submit" class="layui-btn" lay-submit lay-filter="repairListAdd">提交</button>
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
        form.on('submit(repairListAdd)', function (data) {
            $.ajax({
                url: "repairListAdd",
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
