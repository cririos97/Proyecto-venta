<%-- 
    Document   : lockscreen
    Created on : 31-lug-2018, 1.05.36
    Author     : CRIRI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/login-register-lock.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="js/sweetalert2.all.min.js" type="text/javascript"></script>
    <link href="css/sweetalert2.min.css" rel="stylesheet" type="text/css"/>
    <link rel="icon" type="image/png" sizes="16x16" href="img/icons/logoTitle.ico">
        <title>LockScreen</title>
    </head>
    <body class="card-no-border" onload="retro()" id="body">
        <%
            HttpSession sesion = request.getSession();
            sesion.setAttribute("estado", 2);
            %>
        <!-- Preloader - buscar en spinners.css -->
    <div class="preloader">
        <div class="loader">
            <div class="loader__figure"></div>
            <p class="loader__label">Cargando</p>
        </div>
    </div>
    <section id="wrapper">
        <input type="hidden" value="${sessionScope.iduser}" id="idu"/>
        <div class="login-register" style="background-image:url(img/login-register.jpg);">
            <div class="login-box card">
                <div class="card-body">
                    <div class="form-horizontal form-material" id="loginform">
                        <div class="form-group">
                            <div class="col-xs-12 text-center">
                                <div class="user-thumb text-center"> <img alt="user" id="imgU" class="img-circle" width="140">
                                    <h3 style="margin-top: 20px">${sessionScope.user}</h3>
                                </div>
                            </div>
                        </div>
                        <div class="form-group ">
                            <div class="col-xs-12">
                                <input class="form-control" type="password" required="" placeholder="password" id="pass">
                            </div>
                        </div>
                        <div class="form-group text-center">
                            <div class="col-xs-12">
                                <button class="btn btn-info btn-lg btn-block text-uppercase waves-effect waves-light" id="btn" type="button">Ingresar</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scriptLockscreen.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function() {
            $(".preloader").fadeOut();
        });
        $(function() {
            $('[data-toggle="tooltip"]').tooltip();
        });
        function retro() {
        window.location.hash = "no-back-button";
        window.location.hash = "Again-No-back-button"; //chrome
        window.onhashchange = function () {
            window.location.hash = "no-back-button";
        };
    }
    </script>
    </body>
</html>
