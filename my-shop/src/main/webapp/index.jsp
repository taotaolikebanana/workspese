<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/4 0004
  Time: 下午 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <%--  Head Begin --%>
    <head>
        <meta charset="utf-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <title>沃德商城 | 登录</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport"/>
        <!-- Bootstrap 3.3.7 -->
        <link rel="stylesheet" href="assets/bower_components/bootstrap/dist/css/bootstrap.min.css"/>
        <!-- Font Awesome -->
        <link rel="stylesheet" href="assets/bower_components/font-awesome/css/font-awesome.min.css"/>
        <!-- Ionicons -->
        <link rel="stylesheet" href="assets/bower_components/Ionicons/css/ionicons.min.css"/>
        <!-- Theme style -->
        <link rel="stylesheet" href="assets/css/AdminLTE.min.css"/>
        <!-- iCheck -->
        <link rel="stylesheet" href="assets/plugins/iCheck/square/blue.css"/>
    </head>
    <%--  Head End  --%>
    <body class="hold-transition login-page">

        <div  class="login-box">
            <div class="login-logo">
                <a href="#">沃德商城</a>
            </div>

            <!-- /.login-logo -->
            <div class="login-box-body">
                <p class="login-box-msg">欢迎光临 管理员</p>

                <form action="/login" method="post">



                    <div class="alert alert-danger alert-dismissible" ${message == null ?"style='display:none'":""}>
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        ${message}
                    </div>


                    <div class="form-group has-feedback">
                        <input type="email" class="form-control" id="email" name="email" placeholder="邮箱">
                        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" id="password" name="password" placeholder="密码">
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <div class="row">
                        <div class="col-xs-8">
                            <div class="checkbox icheck">
                                <label>
                                    <input id="remember-me" name="remember-me" type="checkbox" checked> 记住我
                                </label>
                            </div>
                        </div>
                        <!-- /.col -->
                        <div class="col-xs-4">
                            <button type="submit" class="btn btn-primary btn-block btn-flat" id="btn-signin">登录</button>
                        </div>
                        <!-- /.col -->
                    </div>
                </form>
                <%--其他的登录方式--%>
                <div class="social-auth-links text-center">
                    <p>- OR -</p>
                    <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-twitch"></i> 登录使用
                        Twitch</a>
                    <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-google-plus"></i> 登录使用
                        Google+</a>
                </div>
                <!-- /.social-auth-links -->
                <%-- -=-=-=-=-=-=-=-=-=-= --%>
                <a href="#">忘记密码？</a><br>
                <%-- 创建新的账户 --%>
                <%--<a href="register.html" class="text-center">Register a new membership</a>--%>
            </div>
        </div>


        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- jQuery 3 -->
        <script src="assets/bower_components/jquery/dist/jquery.min.js"></script>
        <script src="assets/js/jquery-3.3.1.min.js"/>
        <!-- Bootstrap 3.3.7 -->
        <script src="assets/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        <!-- iCheck -->
        <script src="assets/plugins/iCheck/icheck.min.js"></script>
        <script>
            $(function () {
                $('input').iCheck({
                    checkboxClass: 'icheckbox_square-blue',
                    radioClass: 'iradio_square-blue',
                    increaseArea: '20%' /* optional */
                });
            });
        </script>
        <!-- 一加载就执行  用于记住我功能 -->
        <script>
            $(document).ready(function(){
                if($.cookie("password") != ''){
                    $("#password").val($.cookie("password"));
                }
                if($.cookie("email") != ''){
                    $("#email").val($.cookie("email"));
                }
            })
        </script>

        <script>
            function check(){
                //记住我功能使用
                //写入cookie
                if ($("#remember-me").prop("checked") == true) {
                    var email = $("#email").val();
                    var password = $("#password").val();
                    //alert(passWord);
                    $.cookie("email", email);
                    $.cookie("password", password,{ expires: 7 }); // 存储一个带7天期限的 cookie 如果{ expires: 7 } 不写则cookie只相当回话效果
                } else {
                    $.cookie("email", "");
                    $.cookie("password", "");
                }
            }
        </script>


    </body>
</html>
