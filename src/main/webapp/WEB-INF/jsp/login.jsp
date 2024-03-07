<%--
  Created by IntelliJ IDEA.
  User: insomnia
  Date: 2022/4/12
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TMS登录页</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">
<%--    <script src="../../layui/layui.js"></script>--%>

    <style>
        .login-body {
            position: absolute;
            top: 50%;
            left: 50%;
            -webkit-transform: translate(-50%,-50%);
            -moz-transform: translate(-50%,-50%);
            -ms-transform: translate(-50%,-50%);
            -o-transform: translate(-50%,-50%);
            transform: translate(-50%,-50%);
        }

        .login-body .login-main {
            width: 428px;
        }

        .login-body .login-main .login-top {
            height: 100px;
            background-color: #148be4;
            border-radius: 20px 20px 0 0;
            /*font-family: SourceHanSansCN-Regular;*/
            font-size: 30px;
            font-weight: 400;
            font-stretch: normal;
            letter-spacing: 0;
            color: #fff;
            line-height: 117px;
            text-align: center;
            overflow: hidden;
        }

        .layui-form {
            width: 428px;
            height: 250px;
            background: #fff;
            border-radius: 0 0 20px 20px;
            padding-bottom: 15px;
        }

        .layui-form .center {
            width: 288px;
            margin: 0 auto;
            padding-top: 45px;
            padding-bottom: 15px;
        }

        .layui-form .center #msg {
            width: 288px;
            height: 35px;
            color:  red;
        }

        .layui-form .center .item {
            width: 288px;
            height: 35px;
            border-bottom: 1px solid #dae1e6;
            margin-bottom: 35px;
        }

        .layui-form .center .item input {
            display: inline-block;
            width: 227px;
            height: 22px;
            font-size: 14px;
            border: 0;
        }

        .layui-form .center .item .icon {
            display: inline-block;
            width: 33px;
            height: 22px;
        }

        /*.layui-form .center .item .icon-2 {*/
        /*    background: url(images/icon-login.png) no-repeat -54px 0;*/
        /*}*/

        /*.layui-form .center .item .icon-3 {*/
        /*    background: url(images/icon-login.png) no-repeat -106px 0;*/
        /*}*/

        .layui-form .center .login-btn {
            width: 288px;
            height: 40px;
            background-color: #1E9FFF;
            border-radius: 16px;
            margin: 5px auto 0;
            text-align: center;
            line-height: 40px;
            color: #fff;
            font-size: 14px;
            letter-spacing: 0;
            cursor: pointer;
            border: none;
        }
    </style>

</head>
<body background="../../images/loginBackground.jpg"
      style="background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: 100% 100%;">

<div class="login-body">
    <div class="login-main">
        <div class="login-top">
            登录到TMS
        </div>
        <form class="layui-form" method="post" action="login">
            <div class="center">
<%--                <div id="msg"></div>--%>
                <div class="item">
                    <span><i class="layui-icon layui-icon-username" style="font-size: 25px; color: #8D8D8D;"></i></span>
                    <input type="text" name="userName" lay-verify="required" placeholder="请输入登录账号" maxlength="24">
                </div>
                <div class="item">
                    <span><i class="layui-icon layui-icon-password" style="font-size: 25px; color: #8D8D8D;"></i></span>
                    <input type="password" name="userPwd" lay-verify="required" placeholder="请输入密码" maxlength="20">
                </div>
                <div class="layui-form-item">
                    <button class="login-btn" lay-submit="" lay-filter="login">立即登录</button>
                </div>
            </div>
        </form>
    </div>
</div>

<%--<h1>登录到TMS</h1>--%>
<%--<form name = "form1" method="post" action="login">--%>
<%--    <table width="500" border="1" cellspacing="1" cellpadding="1">--%>
<%--        <tr>--%>
<%--            <td>用户名：</td>--%>
<%--            <td><input type="text" name="userName" id="userName"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>密码：</td>--%>
<%--            <td><input type="password" name="userPwd" id="userPwd"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td colspan="2" align="center"><input type="submit" name="button" id="button"  value="登录"></td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form>--%>

<script>
    layui.use(['layer', 'form'], function() {
        var layer = layui.layer
            , form = layui.form,
            $ = layui.$;
    });
</script>
</body>
</html>
