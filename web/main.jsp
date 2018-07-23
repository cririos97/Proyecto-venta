<%-- 
    Document   : main
    Created on : 8-lug-2018, 4.51.40
    Author     : CRIRI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include  file="WEB-INF/template/head.jspf"%>
    <script src="js/vue.js" type="text/javascript"></script>
    <script src="js/axios.js" type="text/javascript"></script>
    <title>Menu Admin</title>
</head>
<body class="fix-header fix-sidebar card-no-border">
    <%
         HttpSession sesion = request.getSession();
         if(sesion.getAttribute("rol")==null){
             response.sendRedirect("login.jsp");
         }
         else{
             String rol = sesion.getAttribute("rol").toString();
             if(!rol.equals("1")){
                 response.sendRedirect("login.jsp");
             }
         }
            %>
        <%@include  file="WEB-INF/template/headerNav.jspf"%>
        <div class="page-wrapper">

            <div class="row hdr-nav-bar">
                <div class="col-md-12">
                    <nav class="navbar navbar-expand-lg navbar-light">
                        <a class="navbar-brand hidden-lg-up">Horizontal Menu</a>
                        <a class="navbar-toggler">
                            <span class="ti-menu" data-toggle="collapse" data-target="#navbarText"></span>
                        </a>
                    </nav>
                </div>
                <!-- Boton flotante-->
                <div>
                    <button class="right-side-toggle waves-effect waves-light btn-inverse btn btn-circle btn-sm pull-right m-l-10"><i class="ti-settings text-white"></i></button>
                </div>
            </div>

            <div class="container-fluid">
 
                <div class="row page-titles">
                    <div class="col-md-5 align-self-center">
                        <h3 class="text-themecolor">Dashboard</h3>
                    </div>
                    <div class="">
                        <button class="right-side-toggle waves-effect waves-light btn-inverse btn btn-circle btn-sm pull-right m-l-10"><i class="ti-settings text-white"></i></button>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-3">
                        <div class="card bg-info">
                            <div class="card-body">
                                <div class="d-flex no-block">
                                    <div class="m-r-20 align-self-center"><img src="img/icon/cart.png" alt="Income" /></div>
                                    <div class="align-self-center">
                                        <h6 class="text-white m-t-10 m-b-0">Ventas totales</h6>
                                        <h2 class="m-t-0 text-white"> {{ ven }}</h2></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="card bg-success">
                            <div class="card-body">
                                <div class="d-flex no-block">
                                    <div class="m-r-20 align-self-center"><img src="img/icon/layers.png" alt="Income" /></div>
                                    <div class="align-self-center">
                                        <h6 class="text-white m-t-10 m-b-0">Productos totales</h6>
                                        <h2 class="m-t-0 text-white">{{ prod }}</h2></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="card bg-primary">
                            <div class="card-body">
                                <div class="d-flex no-block">
                                    <div class="m-r-20 align-self-center"><img src="img/icon/rich.png" alt="Income" /></div>
                                    <div class="align-self-center">
                                        <h6 class="text-white m-t-10 m-b-0">Total ingresos</h6>
                                        <h2 class="m-t-0 text-white">870,00</h2></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="card bg-danger">
                            <div class="card-body">
                                <div class="d-flex no-block">
                                    <div class="m-r-20 align-self-center"><img src="img/icon/user.png" alt="Income" /></div>
                                    <div class="align-self-center">
                                        <h6 class="text-white m-t-10 m-b-0">Usuarios</h6>
                                        <h2 class="m-t-0 text-white">{{ usu }}</h2></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ============================================================== -->
                <!-- Sales overview chart -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-lg-6 col-md-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="d-flex">
                                    <div>
                                        <h3 class="card-title m-b-5"><span class="lstick"></span>Reporte productos</h3>
                                    </div>
                                </div>
                            </div>
                            <div class="bg-theme stats-bar">
                                <div class="row">
                                    <div class="col-lg-12 col-md-12">
                                        <div class="p-20">
                                            <h3 class="text-white m-b-0" align="center">Productos mas vendidos</h3>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- Grafico-->
                            <div class="card">
                                <div class="card-body">
                                    <div>
                                        <canvas id="chart" height="150"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="d-flex">
                                    <div>
                                        <h3 class="card-title m-b-5"><span class="lstick"></span>Reporte ventas</h3>
                                    </div>
                                </div>
                            </div>
                            <div class="bg-theme stats-bar">
                                <div class="row">
                                    <div class="col-lg-12 col-md-12">
                                        <div class="p-20">
                                            <h3 class="text-white m-b-0" align="center">Ventas de la semana</h3>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- Grafico-->
                            <div class="card">
                                <div class="card-body">
                                    <div>
                                        <canvas id="chart2" height="150"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

    <%@include  file="WEB-INF/template/footerBody.jspf"%>
    <%@include  file="WEB-INF/template/footer.jspf"%>
    <script src="js/scriptMain.js" type="text/javascript"></script>
    <script src="js/GraficosMain.js"></script>
    <script src="js/Chart.min.js"></script>
   <!--<script src="js/chartist.min.js"></script> -->
   <!--<script src="js/chartist-plugin-tooltip.min.js"></script> -->
</body>
</html>