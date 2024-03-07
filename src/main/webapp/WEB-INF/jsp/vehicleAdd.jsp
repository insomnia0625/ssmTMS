<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/18
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加新的运输车辆</title>

    <link rel="stylesheet" href="../../layui/css/layui.css">
<%--    <script src="../../layui/layui.js"></script>   不注释它的话页面会被渲染两次--%>

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
<h1 align="center">添加新的运输车辆</h1>
<form name="form1" class="layui-form" method="post" action="vehicleAdd">
    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">车牌号：</label>
        <div class="layui-input-block">
            <input type="text" name="vNumber" required  lay-verify="required" placeholder="请输入车牌号" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">负责人：</label>
        <div class="layui-input-block">
            <input type="text" name="vPerson" required  lay-verify="required" placeholder="请输入负责人" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">联系电话：</label>
        <div class="layui-input-block">
            <input type="text" name="vPhone" required  lay-verify="required" placeholder="请输入联系电话" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" style="width: 500px">
        <label class="layui-form-label">车辆载重：</label>
        <div class="layui-input-block">
            <input type="text" name="vCapacity" required  lay-verify="required" placeholder="请输入车辆载重" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item" align="center">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="vehicleAdd">立即提交</button>
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
        form.on('submit(vehicleAdd)', function (data) {
            $.ajax({
                url: "vehicleAdd",
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
