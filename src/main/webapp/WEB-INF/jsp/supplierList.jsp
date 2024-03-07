<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/22
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<script type="text/html" id="toolbarDemo">--%>
<%--    <div class="layui-btn-container">--%>
<%--        <button class="layui-btn layui-btn-sm" lay-event="storeAdd">添加门店</button>--%>
<%--    </div>--%>
<%--</script>--%>

<script type="text/html" id="supplierListBar">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<table class="layui-hide" id="supplierTable" lay-filter="supplierTable"></table>
<script>
    layui.use('table', function(){
        var table = layui.table;
        var $ = layui.$;

        table.render({
            elem: '#supplierTable'
            ,url:'supplierListData'
            ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
            ,cols: [[
                {type: 'checkbox', fixed: 'left'}
                ,{field:'supplierId', width:150, title: '供应商编号', sort: true}
                ,{field:'supplierName', width:200, title: '供应商名'}
                ,{field:'supplierAddress', width:200, title: '地址', sort: true}
                ,{field:'supplierPhone', width:200, title: '联系电话', sort: true}
                ,{fixed: 'right', title:'操作', toolbar: '#supplierListBar'}
            ]]
            ,page: true
        });

        //头工具栏事件
        table.on('toolbar(supplierTable)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'storeAdd':
                    $.ajax({
                        url:'supplierAdd',
                        type:"get",
                        success:function(data) {
                            layer.open({
                                type: 1,
                                title: "添加供应商",
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
        table.on('tool(supplierTable)', function(obj){
            var data = obj.data;
            //console.log(obj)
            if(obj.event === 'del'){
                layer.confirm('确定要删除该供应商信息吗？', function(adminIndex){
                    $.ajax({
                        url: "supplierDel",
                        type: "post",
                        data: "supplierId=" + data.supplierId,
                        dataType: "json",
                        success: function (data) {
                            if (data.code==0) {
                                alert(data.msg);
                                table.reload("supplierTable");
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
                    url:'supplierEdit',
                    type:"get",
                    data:"supplierId=" + data.supplierId,
                    success:function(data) {
                        layer.open({
                            type: 1,
                            title: "编辑供应商信息",
                            content: data,
                            area: ['500px', '400px']
                        });
                    }
                });
            }
        });
    });
</script>



<%--老板页面--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>车辆信息列表</title>--%>

<%--    <link rel="stylesheet" href="../../layui/css/layui.css">--%>
<%--    <script src="../../layui/layui.js"></script>--%>
<%--</head>--%>
<%--<body>--%>

<%--<script>--%>
<%--    function supplierDel(supplierId){--%>
<%--        if(window.confirm("您确定要移除该供应商吗？")){--%>
<%--            location.href = "supplierDel?supplierId=" + supplierId;--%>
<%--        }--%>
<%--    }--%>
<%--</script>--%>

<%--<h3>供应商信息：</h3>--%>
<%--&lt;%&ndash;<a href="supplierAdd">新增供应商</a>&ndash;%&gt;--%>
<%--<table class="layui-table" lay-even lay-skin="row">--%>
<%--    <tr><th>供应商编号</th><th>供应商名</th><th>地址</th><th>联系电话</th><th>操作：</th></tr>--%>
<%--    <c:forEach items="${supplierList}" var="supplier">--%>
<%--        <tr>--%>
<%--            <td>${supplier.supplierId}</td>--%>
<%--            <td>${supplier.supplierName}</td>--%>
<%--            <td>${supplier.supplierAddress}</td>--%>
<%--            <td>${supplier.supplierPhone}</td>--%>
<%--            <td>--%>
<%--                <a href="" class="layui-btn">编辑信息</a>--%>
<%--                <a href="javascript:supplierDel(${supplier.supplierId})" class="layui-btn layui-btn-danger">移除</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>
