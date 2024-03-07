<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/22
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<script type="text/html" id="toolbarDemo">--%>
<%--    <div class="layui-btn-container">--%>
<%--        <button class="layui-btn layui-btn-sm" lay-event="storeAdd">添加门店</button>--%>
<%--    </div>--%>
<%--</script>--%>

<script type="text/html" id="storeListBar">
    <a class="layui-btn layui-btn-disabled" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<table class="layui-hide" id="storeTable" lay-filter="storeTable"></table>
<script>
    layui.use('table', function(){
        var table = layui.table;
        var $ = layui.$;

        table.render({
            elem: '#storeTable'
            ,url:'storeListData'
            ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
            ,cols: [[
                {type: 'checkbox', fixed: 'left'}
                ,{field:'storeId', width:150, title: '门店编号', sort: true}
                ,{field:'storeName', width:200, title: '门店名'}
                ,{field:'storeAddress', width:200, title: '地址', sort: true}
                ,{field:'storePhone', width:200, title: '联系电话', sort: true}
                ,{fixed: 'right', title:'操作', toolbar: '#storeListBar'}
            ]]
            ,page: true
        });

        //头工具栏事件
        // table.on('toolbar(storeTable)', function(obj){
        //     var checkStatus = table.checkStatus(obj.config.id);
        //     switch(obj.event){
        //         case 'storeAdd':
        //             $.ajax({
        //                 url:'storeEdit',
        //                 type:"get",
        //                 success:function(data) {
        //                     layer.open({
        //                         type: 1,
        //                         title: "添加门店",
        //                         content: data,
        //                         area: ['500px', '320px']
        //                     });
        //                 }
        //             });
        //
        //             break;
        //
        //         //自定义头工具栏右侧图标 - 提示
        //         case 'LAYTABLE_TIPS':
        //             layer.alert('这是工具栏右侧自定义的一个图标按钮');
        //             break;
        //     };
        // });

        //监听行工具事件
        table.on('tool(storeTable)', function(obj){
            var data = obj.data;
            //console.log(obj)
            if(obj.event === 'del'){
                layer.confirm('确定要删除该门店信息吗？', function(adminIndex){
                    $.ajax({
                        url: "storeDel",
                        type: "post",
                        data: "storeId=" + data.storeId,
                        dataType: "json",
                        success: function (data) {
                            if (data.code==0) {
                                alert(data.msg);
                                table.reload("storeTable");
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
                    // url:'storeEdit',
                    // type:"get",
                    // data:"storeId=" + data.storeId,
                    success:function(data) {
                        alert("此信息由门店自行编辑!");
                        // layer.open({
                        //     type: 1,
                        //     title: "编辑门店",
                        //     content: data,
                        //     area: ['500px', '320px']
                        // });
                    }
                });
            }
        });
    });
</script>





<%--老版页面--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>门店信息列表</title>--%>

<%--    <link rel="stylesheet" href="../../layui/css/layui.css">--%>
<%--    <script src="../../layui/layui.js"></script>--%>

<%--</head>--%>
<%--<body>--%>

<%--<script>--%>
<%--    function storeDel(storeId){--%>
<%--        if(window.confirm("您确定要删除该门店吗？")){--%>
<%--            location.href = "storeDel?storeId=" + storeId;--%>
<%--        }--%>
<%--    }--%>
<%--</script>--%>

<%--<h3>门店信息：</h3>--%>
<%--&lt;%&ndash;<a href="storeAdd">添加新门店</a>&ndash;%&gt;--%>
<%--<table class="layui-table" lay-even lay-skin="row">--%>
<%--    <tr><th>编号</th><th>门店名</th><th>地址</th><th>联系电话</th><th>操作：</th></tr>--%>
<%--    <c:forEach items="${storeList}" var="store">--%>
<%--        <tr>--%>
<%--            <td>${store.storeId}</td>--%>
<%--            <td>${store.storeName}</td>--%>
<%--            <td>${store.storeAddress}</td>--%>
<%--            <td>${store.storePhone}</td>--%>
<%--            <td><a href="javascript:storeDel(${store.storeId})" class="layui-btn layui-btn-danger">删除</a></td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>
