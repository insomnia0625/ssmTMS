<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/21
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>TMS管理员首页</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">
</head>
<body background="../../images/bg2.jpg"
      style="background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: 100% 100%;">

<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo layui-hide-xs layui-bg-black" style="font-size: large">
            <i class="layui-icon layui-icon-find-fill" style="font-size: 20px; color: #fbfbfb"></i>
            ssmTMS
        </div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <!-- 移动端显示 -->
<%--            <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-header-event="menuLeft">--%>
<%--                <i class="layui-icon layui-icon-spread-left"></i>--%>
<%--            </li>--%>
                        <li class="layui-nav-item layui-hide-xs">
                            <i class="layui-icon layui-icon-face-smile" style="font-size: 30px; color: #1E9FFF;"></i>
                        </li>
                        <li class="layui-nav-item layui-hide-xs">
                            <p style="font-size: large">欢迎您！ ${username}</p>
                        </li>
            <%--            <li class="layui-nav-item layui-hide-xs"><a href="">nav 3</a></li>--%>
            <%--            <li class="layui-nav-item">--%>
            <%--                <a href="javascript:;">nav groups</a>--%>
            <%--                <dl class="layui-nav-child">--%>
            <%--                    <dd><a href="">menu 11</a></dd>--%>
            <%--                    <dd><a href="">menu 22</a></dd>--%>
            <%--                    <dd><a href="">menu 33</a></dd>--%>
            <%--                </dl>--%>
            <%--            </li>--%>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item layui-hide layui-show-md-inline-block">
                <a href="javascript:;">
                    <i class="layui-icon layui-icon-user" style="font-size: 20px; color: #fbfbfb"></i>
<%--                    <img src="//tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg" class="layui-nav-img">--%>
                    ${username}
                </a>
                <dl class="layui-nav-child">
<%--                    <dd><a href="">Your Profile</a></dd>--%>
                    <dd><a href="">修改密码</a></dd>
                    <dd><a href="logout">退出登录</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item" lay-header-event="menuRight" lay-unselect>
                <a href="javascript:;">
                    <i class="layui-icon layui-icon-more-vertical"></i>
                </a>
            </li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">

                <li class="layui-nav-item"><a href="javascript:;">首页</a></li>

                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">门店管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" lay-href="storeList">门店信息</a></dd>
                        <dd><a href="javascript:;" lay-href="storeAdd">新增门店</a></dd>
                        <%--                        <dd><a href="javascript:;">menu 3</a></dd>--%>
                        <%--                        <dd><a href="">the links</a></dd>--%>
                    </dl>
                </li>

                <li class="layui-nav-item layui-nav-itemed" lay-shrink=" ">
                    <a href="javascript:;">供应商管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" lay-href="supplierList">供应商信息</a></dd>
                        <dd><a href="javascript:;" lay-href="supplierAdd">新增供应商</a></dd>
                        <%--                        <dd><a href="">超链接</a></dd>--%>
                    </dl>
                </li>

                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">运输资源管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" lay-href="vehicleList">运输车辆信息</a></dd>
                        <dd><a href="javascript:;" lay-href="vehicleAdd">新增运输车辆</a></dd>
                        <%--                        <dd><a href="">超链接</a></dd>--%>
                    </dl>
                </li>

                <li class="layui-nav-item"><a href="javascript:" lay-href="repairlistList">补货申请信息</a></li>

                <li class="layui-nav-item"><a href="javascript:" lay-href="makeTransportPlan">制定运输计划</a></li>

            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <div class="layui-tab" lay-filter="demo" lay-allowClose="true">
                <ul class="layui-tab-title">
                    <li class="layui-this">首页</li>
                </ul>
                <div class="layui-tab-content">
                    <div class="layui-tab-item layui-show" align="center">
                        <h1>首页</h1>
                        <h2>欢迎您! ${username}</h2>
<%--                        <div><a href="logout">退出登录</a> </div>--%>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        <p align="center">Copyright@CQUPT-2022</p>
    </div>
</div>
<script src="../../layui/layui.js"></script>
<script>
    //JS
    layui.use(['element', 'layer', 'util'], function(){
        var element = layui.element
            ,layer = layui.layer
            ,util = layui.util
            ,$ = layui.$;

        //头部事件
        util.event('lay-header-event', {
            //左侧菜单事件
            menuLeft: function(othis){
                layer.msg('展开左侧菜单的操作', {icon: 0});
            }
            ,menuRight: function(){
                layer.open({
                    type: 1
                    ,content: '<div style="padding: 15px;">暂无消息</div>'
                    ,area: ['260px', '100%']
                    ,offset: 'rt' //右上角
                    ,anim: 5
                    ,shadeClose: true
                });
            }
        });

        $("#link1").on("click", function (){
            element.tabAdd('demo',  {
                title: '标题'
                ,content: '内容'
                ,id: 'id'
            });
        });

        //通过标签实现页面跳转
        $(".layui-nav .layui-nav-item a[lay-href]").on('click',function (){
            //alert($(this).text());
            //alert($(this).attr("lay-href"));
            var title = $(this).text();
            var layHref = $(this).attr("lay-href");

            var size = $(".layui-tab .layui-tab-title li[lay-id='" + layHref + "']").size();
            if (size==0) {
                $.ajax({
                    url:layHref,
                    type:"get",
                    success:function(data) {
                        element.tabAdd('demo', {
                            title: title
                            ,content: data //支持传入html
                            ,id: layHref
                        });
                        //$(".layui-tab .layui-tab-title li:first i").remove();
                        element.tabChange('demo', layHref);
                    }
                });
            } else {
                element.tabChange('demo', layHref);
            }
        });

    });

    // var func1 = function(){
    //     alert(123);
    // }
</script>
</body>
</html>
