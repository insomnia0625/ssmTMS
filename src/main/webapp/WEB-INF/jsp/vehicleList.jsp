<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/22
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<script type="text/html" id="toolbarDemo">--%>
<%--    <div class="layui-btn-container">--%>
<%--        <button class="layui-btn layui-btn-sm" lay-event="storeAdd">添加门店</button>--%>
<%--    </div>--%>
<%--</script>--%>

<script type="text/html" id="VehicleListBar">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<table class="layui-hide" id="vehicleTable" lay-filter="vehicleTable"></table>
<script>
    layui.use('table', function(){
        var table = layui.table;
        var $ = layui.$;

        table.render({
            elem: '#vehicleTable'
            ,url:'vehicleListData'
            ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
            ,cols: [[
                {type: 'checkbox', fixed: 'left'}
                ,{field:'vId', width:150, title: '车辆编号', sort: true}
                ,{field:'vNumber', width:150, title: '车牌号'}
                ,{field:'vPerson', width:150, title: '负责人', sort: true}
                ,{field:'vPhone', width:200, title: '联系电话', sort: true}
                ,{field:'vAvailable', width:150, title: '是否可用', sort: true}
                ,{field:'vCapacity', width:100, title: '载重', sort: true}
                ,{fixed: 'right', title:'操作', toolbar: '#VehicleListBar'}
            ]]
            ,page: true
        });

        //头工具栏事件
        table.on('toolbar(vehicleTable)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'vehicleAdd':
                    $.ajax({
                        url:'vehicleEdit',
                        type:"get",
                        success:function(data) {
                            layer.open({
                                type: 1,
                                title: "添加车辆",
                                content: data,
                                area: ['500px', '320px']
                            });
                        }
                    });

                    break;

                //自定义头工具栏右侧图标 - 提示
                case 'LAYTABLE_TIPS':
                    layer.alert('这是工具栏右侧自定义的一个图标按钮');
                    break;
            };
        });

        //监听行工具事件
        table.on('tool(vehicleTable)', function(obj){
            var data = obj.data;
            //console.log(obj)
            if(obj.event === 'del'){
                layer.confirm('确定要删除该车辆信息吗？', function(adminIndex){
                    $.ajax({
                        url: "vehicleDel",
                        type: "post",
                        data: "vId=" + data.vId,
                        dataType: "json",
                        success: function (data) {
                            if (data.code==0) {
                                alert(data.msg);
                                table.reload("vehicleTable");
                            } else {
                                layer.msg(data.msg);
                            }
                            layer.close(adminIndex);
                        }
                    });
                });
            }
            else if(obj.event === 'edit'){
                $.ajax({
                    url:'vehicleEdit',
                    type:"get",
                    data:"vId=" + data.vId,
                    success:function(data) {
                        layer.open({
                            type: 1,
                            title: "编辑车辆信息",
                            content: data,
                            area: ['500px', '500px']
                        });
                    }
                });
            }
        });
    });
</script>



<%--老版页面--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>车辆信息列表</title>--%>

<%--    <link rel="stylesheet" href="../../layui/css/layui.css">--%>
<%--    <script src="../../layui/layui.js"></script>--%>
<%--</head>--%>
<%--<body>--%>

<%--<script>--%>
<%--    function vehicleDel(vId){--%>
<%--        if(window.confirm("您确定要删除该运载车辆吗？")){--%>
<%--            location.href = "vehicleDel?vId=" + vId;--%>
<%--        }--%>
<%--    }--%>
<%--</script>--%>

<%--<h3>运输车辆信息：</h3>--%>
<%--&lt;%&ndash;<a href="vehicleAdd">添加新运输车辆</a>&ndash;%&gt;--%>
<%--<table class="layui-table" lay-even lay-skin="row">--%>
<%--    <tr><th>车辆编号</th><th>车牌号</th><th>负责人</th><th>联系电话</th><th>状态</th><th>载重</th><th>操作：</th></tr>--%>
<%--    <c:forEach items="${vehicleList}" var="vehicle">--%>
<%--        <tr>--%>
<%--            <td>${vehicle.vId}</td>--%>
<%--            <td>${vehicle.vNumber}</td>--%>
<%--            <td>${vehicle.vPerson}</td>--%>
<%--            <td>${vehicle.vPhone}</td>--%>
<%--            <td>${vehicle.vAvailable}</td>--%>
<%--            <td>${vehicle.vCapacity}</td>--%>
<%--            <td>--%>
<%--                <a href="vehicleEdit?vId=${vehicle.vId}" class="layui-btn">编辑</a>--%>
<%--                <a href="javascript:vehicleDel(${vehicle.vId})" class="layui-btn layui-btn-danger">删除</a></td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>
