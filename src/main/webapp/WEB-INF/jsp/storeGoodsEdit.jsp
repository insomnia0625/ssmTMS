<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/19
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    .form-panel {
        padding: 40px 40px 10px 10px;
    }
</style>
<div class="form-panel">
    <form class="layui-form" action="storeGoodsEdit" method="post" lay-filter="storeGoods-form">

        <div class="layui-form-item">
            <label class="layui-form-label">库存数量：</label>
            <div class="layui-input-block">
                <input type="text" name="gNumber" required  lay-verify="required" autocomplete="off" class="layui-input">
            </div>
        <div class="layui-form-item">
            <div class="layui-input-block" align="center">
                <button class="layui-btn" lay-submit lay-filter="vehicleEdit">确定</button>
                <button type="reset" class="layui-btn layui-btn-primary" id="btn-cancel">取消</button>
            </div>
        </div>
            <input type="hidden" id="gId" name="gId" value="${param.gId}">
        </div>
    </form>
</div>

<script>
    layui.use(['form','table'], function() {
        var form = layui.form;
        var table = layui.table;
        var $ = layui.$;

        var gId = $("#gId").val();
        if (gId!="") {   //编辑用户请求
            $.ajax({
                url:"storeGoodsData",
                data:"gId=" + gId,
                dataType:"json",
                success:function(data) {
                    form.val('storeGoods-form', data);
                }
            });
        }

        //监听提交
        form.on('submit(vehicleEdit)', function (data) {
            $.ajax({
                url: "storeGoodsEdit",
                type: "post",
                data: data.field,
                dataType: "json",
                success: function (data) {
                    alert(data.msg)
                    table.reload("storeGoodsTable");
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
