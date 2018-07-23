package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/view/../WEB-INF/template/head.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/headerNav.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/footerBody.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/footer.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"img/icons/logoTitle.ico\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/perfect-scrollbar.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/chartist.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/chartist-plugin-tooltip.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/default-dark.css\" id=\"theme\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script src=\"js/vue.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/axios.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Perfil</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!-- Preloader - buscar en spinners.css -->\n");
      out.write("    <div class=\"preloader\">\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <div class=\"loader__figure\"></div>\n");
      out.write("            <p class=\"loader__label\">Cargando</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"main-wrapper\" >\n");
      out.write("<header class=\"topbar\">\n");
      out.write("            <nav class=\"navbar top-navbar navbar-expand-md navbar-light\">\n");
      out.write("                <!-- Logo -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"main.jsp\">\n");
      out.write("                        <b>\n");
      out.write("                            <!--Logo oscuro -->\n");
      out.write("                            <img src=\"img/logo-icon.png\" alt=\"homepage\" class=\"dark-logo\" />\n");
      out.write("                            <!-- Logo claro  -->\n");
      out.write("                            <img src=\"img/logo-light-icon.png\" alt=\"homepage\" class=\"light-logo\" />\n");
      out.write("                        </b>\n");
      out.write("                        <span>\n");
      out.write("                         <!--Logo oscuro -->\n");
      out.write("                         <img src=\"img/logo-text.png\" alt=\"homepage\" class=\"dark-logo\" />\n");
      out.write("                         <!-- Logo claro  -->    \n");
      out.write("                         <img src=\"img/logo-light-text.png\" class=\"light-logo\" alt=\"homepage\" /></span> </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"navbar-collapse\">\n");
      out.write("                    <!-- Perfil User -->\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write(" \n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link nav-toggler hidden-md-up waves-effect waves-dark\" href=\"javascript:void(0)\"><i class=\"ti-menu\"></i></a> </li>         \n");
      out.write("                    </ul>\n");
      out.write("                    <!-- Sede -->\n");
      out.write("                    <ul class=\"navbar-nav my-lg-0\">\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <span class=\"label dropdown-toggle dropdown-toggle-split\"data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Sede1</span>\n");
      out.write("                            <div class=\"dropdown-menu animated flipInY\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Sede 1</a>\n");
      out.write("                                <div class=\"dropdown-divider\"></div>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Sede 2</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <!-- Perfil Card -->\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle waves-effect waves-dark\" href=\"\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><img src=\"img/users/1.jpg\" alt=\"user\" class=\"profile-pic\" /></a>\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right animated flipInY\">\n");
      out.write("                                <ul class=\"dropdown-user\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"dw-user-box\">\n");
      out.write("                                            <div class=\"u-img\"><img src=\"img/users/1.jpg\" alt=\"user\"></div>\n");
      out.write("                                            <div class=\"u-text\">\n");
      out.write("                                                <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nombreCom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                                                <p class=\"text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.nomRol}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p><a href=\"pages-profile.html\" class=\"btn btn-rounded btn-danger btn-sm\">Ver Perfil</a></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"ti-user\"></i> Perfil</a></li>\n");
      out.write("                                    <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"ti-settings\"></i> Configuracion</a></li>\n");
      out.write("                                    <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"lgt\"><i class=\"fa fa-power-off\"></i> Salir</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- Nav Main-->\n");
      out.write("        <div class=\"side-mini-panel\">\n");
      out.write("            <ul class=\"mini-nav\">\n");
      out.write("                <div class=\"togglediv hidden-sm-down\">\n");
      out.write("                    <a href=\"javascript:void(0)\" id=\"togglebtn\"><i class=\"ti-menu\"></i></a>\n");
      out.write("                </div>\n");
      out.write("                <li class=\"selected\">\n");
      out.write("                    <a href=\"javascript:void(0)\"><i class=\"mdi mdi-gauge\"></i></a>\n");
      out.write("                    <div class=\"sidebarmenu\">\n");
      out.write("                        <!-- Menu Venta -->\n");
      out.write("                        <h3 class=\"menu-title\">Menu Principal</h3>\n");
      out.write("                        <ul class=\"sidebar-menu\">\n");
      out.write("                            <li><a href=\"main.jsp\">Dashboard</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\"><a href=\"javascript:void(0)\"><i class=\"mdi mdi-cart\"></i></a>\n");
      out.write("                    <div class=\"sidebarmenu\">\n");
      out.write("                        <h3 class=\"menu-title\">Ventas</h3>\n");
      out.write("                        <ul class=\"sidebar-menu\">\n");
      out.write("                            <li><a href=\"#\">Venta</a></li>\n");
      out.write("                            <li><a href=\"#\">Solicitar pedido</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\"><a href=\"javascript:void(0)\"><i class=\"mdi mdi-dns\"></i></a>\n");
      out.write("                    <div class=\"sidebarmenu\">\n");
      out.write("                        <h3 class=\"menu-title\">Productos</h3>\n");
      out.write("                        <ul class=\"sidebar-menu\">\n");
      out.write("                            <li><a href=\"app-calendar.html\">Gestion Productos</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\"><a href=\"javascript:void(0)\"><i class=\"mdi mdi-account-settings-variant\"></i></a>\n");
      out.write("                    <div class=\"sidebarmenu\">\n");
      out.write("                        <h3 class=\"menu-title\">Usuarios</h3>\n");
      out.write("                        <ul class=\"sidebar-menu\">\n");
      out.write("                            <li><a href=\"app-email.html\">Gestionar usuarios</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"javascript:void(0)\"><i class=\"mdi mdi-truck\"></i></a>\n");
      out.write("                    <div class=\"sidebarmenu\">\n");
      out.write("                        <h3 class=\"menu-title\">Pedidos</h3>\n");
      out.write("                        <ul class=\"sidebar-menu\">\n");
      out.write("                            <li><a href=\"ui-cards.html\">Pedidos Pendientes</a></li>                      \n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\"><a href=\"javascript:void(0)\"><i class=\"mdi mdi-chart-bar\"></i></a>\n");
      out.write("                    <div class=\"sidebarmenu\">\n");
      out.write("                        <h3 class=\"menu-title\">Reportes</h3>\n");
      out.write("                        <ul class=\"sidebar-menu\">\n");
      out.write("                            <li><a href=\"form-basic.html\">Resportes de ventas</a></li>\n");
      out.write("                            <li><a href=\"form-layout.html\">Resportes de clientes</a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("<!-- Menu Colores-->\n");
      out.write("                <div class=\"right-sidebar\">\n");
      out.write("                    <div class=\"slimscrollright\">\n");
      out.write("                        <div class=\"rpanel-title\"> Panel de colores <span><i class=\"ti-close right-side-toggle\"></i></span> </div>\n");
      out.write("                        <div class=\"r-panel-body\">\n");
      out.write("                            <ul id=\"themecolors\" class=\"m-t-20\">\n");
      out.write("                                <li><b>Sidebar claro</b></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"default\" class=\"default-theme\">1</a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"green\" class=\"green-theme\">2</a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"red\" class=\"red-theme\">3</a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"blue\" class=\"blue-theme\">4</a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"purple\" class=\"purple-theme\">5</a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"megna\" class=\"megna-theme\">6</a></li>\n");
      out.write("                                <li class=\"d-block m-t-30\"><b>Sidebar oscuro</b></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"default-dark\" class=\"default-dark-theme working\">7</a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"green-dark\" class=\"green-dark-theme\">8</a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"red-dark\" class=\"red-dark-theme\">9</a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"blue-dark\" class=\"blue-dark-theme\">10</a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"purple-dark\" class=\"purple-dark-theme\">11</a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\" data-theme=\"megna-dark\" class=\"megna-dark-theme \">12</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <footer class=\"footer\"> © 2018 Plateria Guadalupe </footer>\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/waves.js\"></script>\n");
      out.write("    <script src=\"js/sidebarmenu.js\"></script>\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\n");
      out.write("    <script src=\"js/sidebar.min.js\"></script>\n");
      out.write("    <script src=\"js/jQuery.style.switcher.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
