<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/24
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    .form-panel {
        padding: 40px 40px 10px 10px;
    }
</style>
<div class="form-panel">
    <form class="layui-form" action="supplierEdit" method="post" lay-filter="supplier-form">
        <div class="layui-form-item">
            <label class="layui-form-label">供应商ID：</label>
            <div class="layui-input-block">
                <input type="text" name="supplierId" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">供应商名：</label>
            <div class="layui-input-block">
                <input type="text" name="supplierName" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">地址：</label>
            <div class="layui-input-block">
                <input type="text" name="supplierAddress" required  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">联系电话：</label>
            <div class="layui-input-block">
                <input type="text" name="supplierPhone" required  lay-verify="required" placeholder="请输入手机号" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="supplierEdit">确定</button>
                <button type="reset" class="layui-btn layui-btn-primary" id="btn-cancel">取消</button>
            </div>
        </div>
        <input type="hidden" id="supplierId" name="supplierId" value="${param.supplierId}" />
    </form>
</div>
<script>
    layui.use(['form','table'], function() {
        var form = layui.form;
        var table = layui.table;
        var $ = layui.$;

        var supplierId = $("#supplierId").val();
        if (supplierId!="") {   //编辑用户请求
            $.ajax({
                url:"supplierData",
                data:"supplierId=" + supplierId,
                dataType:"json",
                success:function(data) {
                    form.val('supplier-form', data);
                }
            });
        }

        //监听提交
        form.on('submit(supplierEdit)', function (data) {
            $.ajax({
                url: "supplierEdit",
                type: "post",
                data: data.field,
                dataType: "json",
                success: function (data) {
                    alert(data.msg)
                    table.reload("supplierTable");
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
