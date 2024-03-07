<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/22
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<script type="text/html" id="toolbarDemo">--%>
<%--    <div class="layui-btn-container">--%>
<%--        <button class="layui-btn layui-btn-sm" lay-event="storeAdd">添加门店</button>--%>
<%--    </div>--%>
<%--</script>--%>

<script type="text/html" id="repairListBar">
<%--    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>--%>
<%--    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>--%>
    <a class="layui-btn layui-btn-xs" lay-event="adopt">受理</a>
</script>

<table class="layui-hide" id="repairListTable" lay-filter="repairListTable"></table>
<script>
    layui.use('table', function(){
        var table = layui.table;
        var $ = layui.$;

        table.render({
            elem: '#repairListTable'
            ,url:'repairListData'
            ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
            ,cols: [[
                {type: 'checkbox', fixed: 'left'}
                ,{field:'rId', width:100, title: '补货单号', sort: true}
                ,{field:'storeId', width:100, title: '门店号', sort: true}
                ,{field:'rGId', width:100, title: '货号', sort: true}
                ,{field:'rGName', width:150, title: '货物名称', sort: true}
                ,{field:'rGNumber', width:100, title: '补货数量', sort: true}
                ,{field:'rDate', width:200, title: '填写日期', sort: true}
                ,{field:'rState', width:100, title: '状态', sort: true}
                ,{fixed: 'right', title:'操作', toolbar: '#repairListBar'}
            ]]
            ,page: true
        });



        //监听行工具事件
        table.on('tool(repairListTable)', function(obj){
            var data = obj.data;
            //console.log(obj)
            if(obj.event === 'adopt'){
                alert("受理成功！");
            }
        });
    });
</script>

