<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/23
  Time: 20:24
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
    <a class="layui-btn layui-btn-normal" lay-event="edit">出/入库</a>
<%--    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>--%>
</script>

<table class="layui-hide" id="storeGoodsTable" lay-filter="storeGoodsTable"></table>
<script>
    layui.use('table', function(){
        var table = layui.table;
        var $ = layui.$;

        table.render({
            elem: '#storeGoodsTable'
            ,url:'storeGoodsListData'
            ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
            ,cols: [[
                {type: 'checkbox', fixed: 'left'}
                ,{field:'gId', width:150, title: '货物编号', sort: true}
                ,{field:'gName', width:200, title: '货物名称'}
                ,{field:'gNumber', width:200, title: '数量', sort: true}
                ,{field:'gPrice', width:200, title: '单价', sort: true}
                ,{fixed: 'right', title:'操作', toolbar: '#storeListBar'}
            ]]
            ,page: true
        });


        //监听行工具事件
        table.on('tool(storeGoodsTable)', function(obj){
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
                    url:'storeGoodsEdit',
                    type:"get",
                    data:"gId=" + data.gId,
                    success:function(data) {
                        layer.open({
                            type: 1,
                            title: "门店货物出入库",
                            content: data,
                            area: ['500px', '220px']
                        });
                    }
                });
            }
        });
    });
</script>
