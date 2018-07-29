<%-- 
    Document   : perfill
    Created on : 28-lug-2018, 0.19.20
    Author     : CRIRI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@include  file="WEB-INF/template/head.jspf"%>
         <link href="css/dropify.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/vue.js" type="text/javascript"></script>
        <script src="js/axios.js" type="text/javascript"></script>
        <title>Perfil</title>
    </head>
    <body class="fix-header fix-sidebar card-no-border">
        <%@include  file="WEB-INF/template/headerNav.jspf"%>
            <div class="page-wrapper">

            <div class="container-fluid">
                <!-- ============================================================== -->
                <!-- Bread crumb and right sidebar toggle -->
                <!-- ============================================================== -->
                <div class="row page-titles">
                    <div class="col-md-5 align-self-center">
                        <h3 class="text-themecolor">Perfil</h3>
                    </div>
                    <div class="col-md-7 align-self-center">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="p?page=dashboard">Menu</a></li>
                            <li class="breadcrumb-item active">Perfil</li>
                        </ol>
                    </div>
                    <div>
                        <button class="right-side-toggle waves-effect waves-light btn-inverse btn btn-circle btn-sm pull-right m-l-10"><i class="ti-settings text-white"></i></button>
                    </div>
                </div>
  
                <div class="row">
                    <!-- Column -->
                    <div class="col-lg-4 col-xlg-3 col-md-5">
                        <div class="card">
                            <div class="card-body">
                                <center class="m-t-30"> <img id="imgP" class="img" style="border-radius: 10px" width="200" />
                                    <h4 class="card-title m-t-10">${sessionScope.nombreCom}</h4>
                                    <h6 class="card-subtitle">${sessionScope.nomRol}</h6>
                                    <div class="row text-center justify-content-md-center">
                                        <div class="col-16 marg"><a href="javascript:void(0)" data-toggle="modal" data-target="#Modal" class="link"><i class="icon-picture"></i> <font class="font-medium">Cambiar imagen perfil</font></a></div>
                                    </div>
                                </center>
                            </div>
                                <!-- modal image -->
                                <div id="Modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <form method="POST" action="us" enctype="multipart/form-data">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h4 class="modal-title" id="myModalLabel">Imagen perfil</h4>
                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                            </div>
                                            <div class="modal-body">
                                                <div class="col-lg-12 col-md-12">
                                                    <div class="card">
                                                        <div class="card-body">
                                                            <label for="input-file-now-custom-1">Selecciona una imagen</label>
                                                            <input type="file" id="imgPerfil" name="img" class="dropify-fr" data-default-file="" />
                                                            <input type="hidden" value="1" name="opc">
                                                            <input type="text" value="${sessionScope.iduser}" name="idus" hidden/>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="submit" class="btn btn-success waves-effect">Subir</button>
                                            </div>
                                        </div>
                                        </form>
                                    </div>
                                </div>
                            <div><hr></div>
                            <div class="card-body"> <small class="text-muted">Usuario</small>
                                <h6 id="us"></h6> <small class="text-muted p-t-30 db">Email</small>
                                <h6 id="email"></h6> <small class="text-muted p-t-30 db">Celular</small>
                                <h6 id="cel"></h6> <small class="text-muted p-t-30 db">Direccion</small>
                                <h6 id="dir"></h6>
                            </div>
                        </div>
                    </div>
                    <!-- Column -->
                    <!-- Column -->
                    <div class="col-lg-8 col-xlg-9 col-md-7">
                        <div class="card">
                            <!-- Nav tabs -->
                            <ul class="nav nav-tabs profile-tab" role="tablist">
                                <li class="nav-item"> <a class="nav-link active" data-toggle="tab" href="#home" role="tab">Timeline</a> </li>
                                <li class="nav-item"> <a class="nav-link" data-toggle="tab" href="#settings" role="tab">Actualizar</a> </li>
                            </ul>
                            <!-- Tab panes -->
                            <div class="tab-content">
                                <div class="tab-pane active" id="home" role="tabpanel">
                                    <div class="card-body">
                                        <div class="profiletimeline">
                                            <div class="sl-item">
                                                <div class="sl-left"> <img src="../assets/images/users/1.jpg" alt="user" class="img-circle" /> </div>
                                                <div class="sl-right">
                                                    <div><a href="#" class="link">John Doe</a> <span class="sl-date">5 minutes ago</span>
                                                        <p>assign a new task <a href="#"> Design weblayout</a></p>
                                                        <div class="row">
                                                            <div class="col-lg-3 col-md-6 m-b-20"><img src="" class="img-responsive radius" /></div>
                                                            <div class="col-lg-3 col-md-6 m-b-20"><img src="" class="img-responsive radius" /></div>
                                                            <div class="col-lg-3 col-md-6 m-b-20"><img src="" class="img-responsive radius" /></div>
                                                            <div class="col-lg-3 col-md-6 m-b-20"><img src="" class="img-responsive radius" /></div>
                                                        </div>
                                                        <div class="like-comm"> <a href="javascript:void(0)" class="link m-r-10">2 comment</a> <a href="javascript:void(0)" class="link m-r-10"><i class="fa fa-heart text-danger"></i> 5 Love</a> </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="sl-item">
                                                <div class="sl-left"> <img src="" alt="user" class="img-circle" /> </div>
                                                <div class="sl-right">
                                                    <div> <a href="#" class="link">John Doe</a> <span class="sl-date">5 minutes ago</span>
                                                        <div class="m-t-20 row">
                                                            <div class="col-md-3 col-xs-12"><img src="" alt="user" class="img-responsive radius" /></div>
                                                            <div class="col-md-9 col-xs-12">
                                                                <p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. </p> <a href="#" class="btn btn-success"> Design weblayout</a></div>
                                                        </div>
                                                        <div class="like-comm m-t-20"> <a href="javascript:void(0)" class="link m-r-10">2 comment</a> <a href="javascript:void(0)" class="link m-r-10"><i class="fa fa-heart text-danger"></i> 5 Love</a> </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="sl-item">
                                                <div class="sl-left"> <img src="" alt="user" class="img-circle" /> </div>
                                                <div class="sl-right">
                                                    <div><a href="#" class="link">John Doe</a> <span class="sl-date">5 minutes ago</span>
                                                        <p class="m-t-10"> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi. Nulla quis sem at nibh elementum imperdiet. Duis sagittis ipsum. Praesent mauris. Fusce nec tellus sed augue semper </p>
                                                    </div>
                                                    <div class="like-comm m-t-20"> <a href="javascript:void(0)" class="link m-r-10">2 comment</a> <a href="javascript:void(0)" class="link m-r-10"><i class="fa fa-heart text-danger"></i> 5 Love</a> </div>
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="sl-item">
                                                <div class="sl-left"> <img src="" alt="user" class="img-circle" /> </div>
                                                <div class="sl-right">
                                                    <div><a href="#" class="link">John Doe</a> <span class="sl-date">5 minutes ago</span>
                                                        <blockquote class="m-t-10">
                                                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt
                                                        </blockquote>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="tab-pane" id="settings" role="tabpanel">
                                    <div class="card-body">
                                        <form class="form-horizontal form-material">
                                            <div class="form-group m-t-40 row">
                                                <div class="form-group col-md-6 m-t-20">
                                                    <label class="col-md-6">Nombres</label>
                                                    <div class="col-md-12">
                                                        <input type="text" id="nom" class="form-control form-control-line">
                                                    </div>
                                                    </div>
                                                <div class="form-group col-md-6 m-t-20">
                                                    <label class="col-md-6">Apellidos</label>
                                                    <div class="col-md-12">
                                                        <input type="text" id="ape"  class="form-control form-control-line">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-12">DNI</label>
                                                <div class="col-md-12">
                                                    <input type="text" id="dni" class="form-control form-control-line" id="example-email">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="example-email" class="col-md-12">Email</label>
                                                <div class="col-md-12">
                                                    <input type="email" id="ema" class="form-control form-control-line" name="example-email" id="example-email">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-12">Celular</label>
                                                <div class="col-md-12">
                                                    <input type="text" id="celu" class="form-control form-control-line">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-12">Direccion</label>
                                                <div class="col-md-12">
                                                    <input type="text" id="dire" class="form-control form-control-line">
                                                </div>
                                            </div>
                                            <div id="inU" class="form-group">
                                                <label class="col-md-12">Usuario</label>
                                                <div class="col-md-12">
                                                    <input type="text" class="form-control form-control-line" id="user">
                                                    <div id="message" style="display: none" class="form-control-feedback" >disponible.</div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-12">Password</label>
                                                <div class="col-md-12">
                                                    <input type="password" id="passw" class="form-control form-control-line">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-sm-12">
                                                    <button id="btn-go" class="btn btn-success">Actualizar perfil</button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Column -->
                </div>
        <%@include  file="WEB-INF/template/footerBody.jspf"%>
        <%@include  file="WEB-INF/template/footer.jspf"%>
        <script src="js/dropify.min.js" type="text/javascript"></script>
        <script src="js/scriptPerfil.js" type="text/javascript"></script>
        <script>
    $(document).ready(function() {
        // Basic
        $('.dropify').dropify();

        // Personalizado upload
        $('.dropify-fr').dropify({
            messages: {
                default: '<center>has click para subir una imagen de perfil</center>',
                replace: 'has click para cambiar imagen',
                remove: 'Suprimir',
                error: 'ocurrio un error!'
            }
        });

        var drEvent = $('#input-file-events').dropify();

        drEvent.on('dropify.beforeClear', function(event, element) {
            return confirm("Do you really want to delete \"" + element.file.name + "\" ?");
        });

        drEvent.on('dropify.afterClear', function(event, element) {
            alert('File deleted');
        });

        drEvent.on('dropify.errors', function(event, element) {
            console.log('Has Errors');
        });

        var drDestroy = $('#input-file-to-destroy').dropify();
        drDestroy = drDestroy.data('dropify');
        $('#toggleDropify').on('click', function(e) {
            e.preventDefault();
            if (drDestroy.isDropified()) {
                drDestroy.destroy();
            } else {
                drDestroy.init();
            }
        });
    });
    </script>
    </body>
</html>
