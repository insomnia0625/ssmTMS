<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/15
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆成功页</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <script src="../../layui/layui.js"></script>

    <style>
        .logsuccess{
            position: absolute;
            top: 25%;
            left: 50%;
            -webkit-transform: translate(-50%,-50%);
            -moz-transform: translate(-50%,-50%);
            -ms-transform: translate(-50%,-50%);
            -o-transform: translate(-50%,-50%);
            transform: translate(-50%,-50%);
            font-size: 30px;
            font-weight: 400;
            font-stretch: normal;
        }
        .welcome{
            position: absolute;
            top: 40%;
            left: 50%;
            -webkit-transform: translate(-50%,-50%);
            -moz-transform: translate(-50%,-50%);
            -ms-transform: translate(-50%,-50%);
            -o-transform: translate(-50%,-50%);
            transform: translate(-50%,-50%);
            font-size: 20px;
            font-weight: 400;
            font-stretch: normal;
        }
        .enterbutton{
            position: absolute;
            top: 60%;
            left: 40%;
            -webkit-transform: translate(-50%,-50%);
            -moz-transform: translate(-50%,-50%);
            -ms-transform: translate(-50%,-50%);
            -o-transform: translate(-50%,-50%);
            transform: translate(-50%,-50%);
        }
        .outbutton{
            position: absolute;
            top: 60%;
            left: 60%;
            -webkit-transform: translate(-50%,-50%);
            -moz-transform: translate(-50%,-50%);
            -ms-transform: translate(-50%,-50%);
            -o-transform: translate(-50%,-50%);
            transform: translate(-50%,-50%);
        }
    </style>
</head>
<body background="../../images/bg4.jpg"
        style="background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: 100% 100%;">

<script language="JavaScript">
    var username = "${username}";

    function difLogin(){
        if(username == "admin"){
            window.location.assign("adminIndex?username=" + username);
            // location.href = "adminIndex?username" + username;
        }else {
            window.location.assign("storeIndex?username=" + username);
            // location.href = "storeIndex?username" + username;
        }
    }
</script>

<div class="logsuccess"><h1 style="font-family: 华文宋体">登录成功</h1></div>
<div class="welcome"><h2>欢迎您，${username}!</h2></div>
<div class="enterbutton"><a href="javascript:difLogin()" class="layui-btn">进入首页</a></div>
<div class="outbutton"><div><a href="logout" class="layui-btn layui-btn-primary">退出登录</a> </div></div>
</body>
</html>
