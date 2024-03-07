<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/18
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>补货单详情</title>

    <link rel="stylesheet" href="../../layui/css/layui.css">
    <script src="../../layui/layui.js"></script>

    <style>
        .box{
            position: absolute;
            top: 20%;
            left: 30%;
            background-color: #fbfbfb;
            border-radius: 15px;
            font-size: large;
        }
    </style>
</head>
<body background="../../images/bg8.jpg"
      style="background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: 100% 100%;">

<script language="JavaScript">

    var username = "${username}";
    rId = ${repairList.rId};
    var state = "${repairList.rState}"
    function backtoStoreIndex(){
        window.location.assign("storeIndex?username=" + username);
    }

    function repairComplete(){
        if(state == "false") {
            if (window.confirm("确认无误后收货")) {
                alert("收货成功！");
                window.location.assign("repairComplete?rId=" + rId);
            }
            }else {
            alert("不能重复收货！")
        }
    }

</script>
<div class="box">
<h1 align="center">${repairList.rId}号补货单：</h1>
    <table width="500" border="1" cellspacing="1" cellpadding="1">
        <tr>
            <td>补货单号：</td>
            <td>${repairList.rId}</td>
        </tr>
        <tr>
            <td>补货门店号：</td>
            <td>${repairList.storeId}</td>
        </tr>
        <tr>
            <td>货号：</td>
            <td>${repairList.rGId}</td>
        </tr>
        <tr>
            <td>货名：</td>
            <td>${repairList.rGName}</td>
        </tr>
        <tr>
            <td>数量：</td>
            <td>${repairList.rGNumber}</td>
        </tr>
        <tr>
            <td>提交日期：</td>
            <td>${repairList.rDate}</td>
        </tr>
        <tr>
            <td colspan="2" align="center">
<%--                <input type="hidden" name="storeId" value="${store.storeId}">--%>
                <button class="layui-btn"><a href="javascript:repairComplete()">确认到货</a></button>
                <button class="layui-btn layui-btn-primary layui-border-blue"><a href="javascript:backtoStoreIndex()">返回主页</a></button>
            </td>
        </tr>
    </table>
    <br/>

</div>
</body>
</html>
