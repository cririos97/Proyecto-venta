<%-- 
    Document   : login
    Created on : 6-lug-2018, 16.06.25
    Author     : CRIRI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/login-register-lock.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link rel="icon" type="image/png" sizes="16x16" href="img/icons/logoTitle.ico">

    <title>Login</title>
</head>
<body class="card-no-border">
    <!-- Preloader - buscar en spinners.css -->
    <div class="preloader">
        <div class="loader">
            <div class="loader__figure"></div>
            <p class="loader__label">Cargando</p>
        </div>
    </div>
    <!-- Main wrapper - style you can find in pages.scss -->
    <section id="wrapper">
        <div class="login-register" style="background-image:url(img/login-register.jpg);">
            <div class="login-box card">
                <div class="card-body">
                    <form class="form-horizontal form-material" id="loginform" action="lg" method="POST">
                        <div class="form-group ">
                            <img class="form-control" src="img/logoLogin.png" alt="">
                        </div>
                        <div class="form-group ">
                            <div class="col-xs-12">
                                <input class="form-control" type="text" required=""  name="user" placeholder="Usuario"> </div>
                        </div>
                        <div class="form-group">
                            <div class="col-xs-12">
                                <input class="form-control" type="password" required="" name="pass" placeholder="Contraseña"> </div>
                        </div>
                        <div class="form-group">
                            <div class="col-xs-12">
                                <select class="form-control" style="text-align: center">
                                    <option>Sede 1</option>
                                    <option>Sede 2</option>
                                </select>
                        </div>
                        <div class="form-group row">
                            <div class="col-md-12">
                                 <a href="javascript:void(0)" id="to-recover" class="text-dark pull-right"><i class="fa fa-lock m-r-5"></i> Olvidaste tu contraseña?</a> </div>
                        </div>
                        <div class="form-group text-center">
                            <div class="col-xs-12 p-b-20">
                                <button class="btn btn-block btn-lg btn-info btn-rounded" name="btn-login" type="submit">Ingresar</button>
                            </div>
                        </div>
                        <div class="row">
                        </div>
                        <div class="form-group m-b-0">
                            <div class="col-sm-12 text-center">
                                No tienes una cuenta? <a href="#" class="text-info m-l-5"><b>Contacta el administrador</b></a>
                            </div>
                        </div>
                    </form>
                    <form class="form-horizontal" id="recoverform" action="index.html">
                        <div class="form-group ">
                            <div class="col-xs-12">
                                <h3>Recuperar Contraseña</h3>
                                <p class="text-muted">Para recuperar tu contraseña tienes que ingresar tu correo y te invieremos un email con tu contraseña! </p>
                            </div>
                        </div>
                        <div class="form-group ">
                            <div class="col-xs-12">
                                <input class="form-control" type="text" required="" placeholder="Email"> </div>
                        </div>
                        <div class="form-group text-center m-t-20">
                            <div class="col-xs-12">
                                <button class="btn btn-primary btn-lg btn-block text-uppercase waves-effect waves-light" type="submit">Recuperar</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
    <%
    RequestDispatcher rd;
    HttpSession sesion = request.getSession();
        int rol=0;
     if(request.getAttribute("rol")!=null){
         rol = (Integer)request.getAttribute("rol");
         if(rol==1){
             sesion.setAttribute("rol", rol);
             String nombres= (String) request.getAttribute("nombre")+" "+request.getAttribute("apellido");
             sesion.setAttribute("nombreCom", nombres);
             sesion.setAttribute("nombre", request.getAttribute("nombre"));
             sesion.setAttribute("apellido", request.getAttribute("apellido"));
             sesion.setAttribute("iduser", request.getAttribute("iduser"));
             sesion.setAttribute("user", request.getAttribute("user"));
             sesion.setAttribute("nomRol", request.getAttribute("nomRol"));
             rd= request.getRequestDispatcher("main.jsp");
             rd.forward(request, response);
         }
     }
        %>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(function() {
            $(".preloader").fadeOut();
        });
        $(function() {
            $('[data-toggle="tooltip"]').tooltip()
        });
        // Login and Recover Password 
        $('#to-recover').on("click", function() {
            $("#loginform").slideUp();
            $("#recoverform").fadeIn();
        });
    </script>
    
</body>
</body>
</html>
