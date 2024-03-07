<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/23
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>门店补货申请页</title>

    <link rel="stylesheet" href="../../layui/css/layui.css">
    <script src="../../layui/layui.js"></script>

    <script>
        function toRepairListInfor(rId){
            window.location.assign("repairListInfor?rId=" + rId);
        }
    </script>

</head>
<body>
<h3>补货单信息：</h3>
<table class="layui-table" lay-even lay-skin="row" id="RepairListTable" lay-filter="RepairListTable">
    <tr><th>补货单号</th><th>门店ID</th><th>货物名</th><th>日期</th><th>状态</th><th>操作：</th></tr>
    <c:forEach items="${repairlistList}" var="RepairList">
        <tr>
            <td>${RepairList.rId}</td>
            <td>${RepairList.storeId}</td>
            <td>${RepairList.rGName}</td>
            <td>${RepairList.rDate}</td>
            <td>${RepairList.rState}</td>
            <td><a href="javascript:toRepairListInfor(${RepairList.rId})" class="layui-btn layui-btn-normal">查看详情</a>
<%--            <td><a class="layui-btn layui-btn-xs" lay-event="infor">查看详情</a></td>--%>
        </tr>
    </c:forEach>
</table>

<script>
    layui.use('table', function(){
        var table = layui.table;
        var $ = layui.$;


        //监听行工具事件
        table.on('tool(RepairListTable)', function(obj){
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
            else if(obj.event === 'infor'){
                $.ajax({
                    url:'repairListInfor',
                    type:"get",
                    data:"rId=" + data.rId,
                    success:function(data) {
                        layer.open({
                            type: 1,
                            title: "补货单详情",
                            content: data,
                            area: ['500px', '500px']
                        });
                    }
                });
            }
        });
    });
</script>
</body>
</html>
