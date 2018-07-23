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
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="icon" type="image/png" sizes="16x16" href="img/icons/logoTitle.ico">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/perfect-scrollbar.min.css" rel="stylesheet">
    <link href="css/chartist.min.css" rel="stylesheet">
    <link href="css/chartist-plugin-tooltip.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/default-dark.css" id="theme" rel="stylesheet">
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
    <!-- Preloader - buscar en spinners.css -->
    <div class="preloader">
        <div class="loader">
            <div class="loader__figure"></div>
            <p class="loader__label">Cargando</p>
        </div>
    </div>

    <div id="main-wrapper" >
        <header class="topbar">
            <nav class="navbar top-navbar navbar-expand-md navbar-light">
                <!-- Logo -->
                <div class="navbar-header">
                    <a class="navbar-brand" href="index.html">
                        <b>
                            <!--Logo oscuro -->
                            <img src="img/logo-icon.png" alt="homepage" class="dark-logo" />
                            <!-- Logo claro  -->
                            <img src="img/logo-light-icon.png" alt="homepage" class="light-logo" />
                        </b>
                        <span>
                         <!--Logo oscuro -->
                         <img src="img/logo-text.png" alt="homepage" class="dark-logo" />
                         <!-- Logo claro  -->    
                         <img src="img/logo-light-text.png" class="light-logo" alt="homepage" /></span> </a>
                </div>

                <div class="navbar-collapse">
                    <!-- Perfil User -->
                    <ul class="navbar-nav mr-auto">
 
                        <li class="nav-item"> <a class="nav-link nav-toggler hidden-md-up waves-effect waves-dark" href="javascript:void(0)"><i class="ti-menu"></i></a> </li>         
                    </ul>
                    <!-- Sede -->
                    <ul class="navbar-nav my-lg-0">
                        <li class="nav-item dropdown">
                            <span class="label dropdown-toggle dropdown-toggle-split"data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Sede1</span>
                            <div class="dropdown-menu animated flipInY">
                                <a class="dropdown-item" href="#">Sede 1</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Sede 2</a>
                            </div>
                        </li>

                        <!-- Perfil Card -->

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle waves-effect waves-dark" href="" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img src="img/users/1.jpg" alt="user" class="profile-pic" /></a>
                            <div class="dropdown-menu dropdown-menu-right animated flipInY">
                                <ul class="dropdown-user">
                                    <li>
                                        <div class="dw-user-box">
                                            <div class="u-img"><img src="img/users/1.jpg" alt="user"></div>
                                            <div class="u-text">
                                                <h4>${sessionScope.nombreCom}</h4>
                                                <p class="text-muted">${sessionScope.nomRol}</p><a href="pages-profile.html" class="btn btn-rounded btn-danger btn-sm">Ver Perfil</a></div>
                                        </div>
                                    </li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#"><i class="ti-user"></i> Perfil</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#"><i class="ti-settings"></i> Configuracion</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="lgt"><i class="fa fa-power-off"></i> Salir</a></li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        <!-- Nav Main-->
        <div class="side-mini-panel">
            <ul class="mini-nav">
                <div class="togglediv hidden-sm-down">
                    <a href="javascript:void(0)" id="togglebtn"><i class="ti-menu"></i></a>
                </div>
                <li class="selected">
                    <a href="javascript:void(0)"><i class="mdi mdi-gauge"></i></a>
                    <div class="sidebarmenu">
                        <!-- Menu Venta -->
                        <h3 class="menu-title">Menu Principal</h3>
                        <ul class="sidebar-menu">
                            <li><a href="#">Dashboard</a></li>
                        </ul>
                    </div>
                </li>
                <li class=""><a href="javascript:void(0)"><i class="mdi mdi-cart"></i></a>
                    <div class="sidebarmenu">
                        <h3 class="menu-title">Ventas</h3>
                        <ul class="sidebar-menu">
                            <li><a href="#">Venta</a></li>
                            <li><a href="#">Solicitar pedido</a></li>
                        </ul>
                    </div>
                </li>
                <li class=""><a href="javascript:void(0)"><i class="mdi mdi-dns"></i></a>
                    <div class="sidebarmenu">
                        <h3 class="menu-title">Productos</h3>
                        <ul class="sidebar-menu">
                            <li><a href="app-calendar.html">Gestion Productos</a></li>
                        </ul>
                    </div>
                </li>
                <li class=""><a href="javascript:void(0)"><i class="mdi mdi-account-settings-variant"></i></a>
                    <div class="sidebarmenu">
                        <h3 class="menu-title">Usuarios</h3>
                        <ul class="sidebar-menu">
                            <li><a href="app-email.html">Gestionar usuarios</a></li>
                        </ul>
                    </div>
                </li>
                <li><a href="javascript:void(0)"><i class="mdi mdi-truck"></i></a>
                    <div class="sidebarmenu">
                        <h3 class="menu-title">Pedidos</h3>
                        <ul class="sidebar-menu">
                            <li><a href="ui-cards.html">Pedidos Pendientes</a></li>                      
                        </ul>

                    </div>
                </li>
                <li class=""><a href="javascript:void(0)"><i class="mdi mdi-chart-bar"></i></a>
                    <div class="sidebarmenu">
                        <h3 class="menu-title">Reportes</h3>
                        <ul class="sidebar-menu">
                            <li><a href="form-basic.html">Resportes de ventas</a></li>
                            <li><a href="form-layout.html">Resportes de clientes</a></li>
                        </ul>

                    </div>
                </li>
            </ul>
        </div>

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

                <!-- Menu Colores-->
                <div class="right-sidebar">
                    <div class="slimscrollright">
                        <div class="rpanel-title"> Panel de colores <span><i class="ti-close right-side-toggle"></i></span> </div>
                        <div class="r-panel-body">
                            <ul id="themecolors" class="m-t-20">
                                <li><b>Sidebar claro</b></li>
                                <li><a href="javascript:void(0)" data-theme="default" class="default-theme">1</a></li>
                                <li><a href="javascript:void(0)" data-theme="green" class="green-theme">2</a></li>
                                <li><a href="javascript:void(0)" data-theme="red" class="red-theme">3</a></li>
                                <li><a href="javascript:void(0)" data-theme="blue" class="blue-theme">4</a></li>
                                <li><a href="javascript:void(0)" data-theme="purple" class="purple-theme">5</a></li>
                                <li><a href="javascript:void(0)" data-theme="megna" class="megna-theme">6</a></li>
                                <li class="d-block m-t-30"><b>Sidebar oscuro</b></li>
                                <li><a href="javascript:void(0)" data-theme="default-dark" class="default-dark-theme working">7</a></li>
                                <li><a href="javascript:void(0)" data-theme="green-dark" class="green-dark-theme">8</a></li>
                                <li><a href="javascript:void(0)" data-theme="red-dark" class="red-dark-theme">9</a></li>
                                <li><a href="javascript:void(0)" data-theme="blue-dark" class="blue-dark-theme">10</a></li>
                                <li><a href="javascript:void(0)" data-theme="purple-dark" class="purple-dark-theme">11</a></li>
                                <li><a href="javascript:void(0)" data-theme="megna-dark" class="megna-dark-theme ">12</a></li>
                            </ul>
                        </div>
                    </div>
                </div>

            </div>
            <!-- ============================================================== -->
            <footer class="footer"> © 2018 Plateria Guadalupe </footer>
            <!-- ============================================================== -->
        </div>

    </div>

    <script src="js/jquery.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scriptMain.js" type="text/javascript"></script>
    <script src="js/perfect-scrollbar.jquery.min.js"></script>
    <script src="js/waves.js"></script>
    <script src="js/GraficosMain.js"></script>
    <script src="js/Chart.min.js"></script>
    <script src="js/sidebarmenu.js"></script>
    <script src="js/custom.min.js"></script>
    <script src="js/sidebar.min.js"></script>
    <script src="js/chartist.min.js"></script>
    <script src="js/chartist-plugin-tooltip.min.js"></script>
    <script src="js/jQuery.style.switcher.js"></script>
</body>
</html>