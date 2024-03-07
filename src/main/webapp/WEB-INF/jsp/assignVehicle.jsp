<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/5/24
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/html" id="VehicleListBar">
        <a class="layui-btn layui-btn-xs" lay-event="assign">派车</a>
</script>
<style>
    .form-panel {
        padding: 40px 40px 10px 10px;
    }
</style>

<div class="form-panel">
    <table class="layui-hide" id="assignVehicleTable" lay-filter="assignVehicleTable"></table>
            <div class="layui-input-block" align="center">
                <button type="reset" class="layui-btn layui-btn-primary" id="btn-cancel">取消</button>
            </div>
</div>

<script>
    layui.use(['form','table'], function() {
        var form = layui.form;
        var table = layui.table;
        var $ = layui.$;

        table.render({
            elem: '#assignVehicleTable'
            ,url:'assignVehicleData'
            // ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
            ,cols: [[
                ,{field:'vId', width:100, title: '车辆编号', sort: true}
                ,{field:'vPerson', width:120, title: '负责人', sort: true}
                ,{field:'vCapacity', width:80, title: '载重', sort: true}
                ,{fixed: 'right', width:100, title:'操作', toolbar: '#VehicleListBar'}
            ]]
            ,page: true
        });

        // var vId = $("#vId").val();
        // if (vId!="") {   //编辑用户请求
        //     $.ajax({
        //         url:"assignVehicleData",
        //         data:"vId=" + vId,
        //         dataType:"json",
        //         success:function(data) {
        //             form.val('vehicle-form', data);
        //         }
        //     });
        // }

        //监听行工具事件
        table.on('tool(assignVehicleTable)', function(obj){
            var data = obj.data;
            if(obj.event === 'assign'){
                layer.confirm('确定要派遣该车辆吗？', function(){
                    $.ajax({
                        url: "assignVehicle",
                        type: "post",
                        data: "vId=" + data.vId,
                        dataType: "json",
                        success: function (data) {
                                alert(data.msg);
                                table.reload("assignVehicleTable");
                        }
                    });
                });
            }
        });

        $("#btn-cancel").on("click",function() {
            layer.closeAll();
        });

    });
</script>
</html>
