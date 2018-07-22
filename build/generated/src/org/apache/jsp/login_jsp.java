package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/login-register-lock.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"img/icons/logoTitle.ico\">\n");
      out.write("\n");
      out.write("    <title>Login</title>\n");
      out.write("</head>\n");
      out.write("<body class=\"card-no-border\">\n");
      out.write("    <!-- Preloader - buscar en spinners.css -->\n");
      out.write("    <div class=\"preloader\">\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <div class=\"loader__figure\"></div>\n");
      out.write("            <p class=\"loader__label\">Cargando</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Main wrapper - style you can find in pages.scss -->\n");
      out.write("    <section id=\"wrapper\">\n");
      out.write("        <div class=\"login-register\" style=\"background-image:url(img/login-register.jpg);\">\n");
      out.write("            <div class=\"login-box card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form class=\"form-horizontal form-material\" id=\"loginform\" action=\"lg\" method=\"POST\">\n");
      out.write("                        <div class=\"form-group \">\n");
      out.write("                            <img class=\"form-control\" src=\"img/logoLogin.png\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group \">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" required=\"\"  name=\"user\" placeholder=\"Usuario\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <input class=\"form-control\" type=\"password\" required=\"\" name=\"pass\" placeholder=\"Contraseña\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <select class=\"form-control\" style=\"text-align: center\">\n");
      out.write("                                    <option>Sede 1</option>\n");
      out.write("                                    <option>Sede 2</option>\n");
      out.write("                                </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                 <a href=\"javascript:void(0)\" id=\"to-recover\" class=\"text-dark pull-right\"><i class=\"fa fa-lock m-r-5\"></i> Olvidaste tu contraseña?</a> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group text-center\">\n");
      out.write("                            <div class=\"col-xs-12 p-b-20\">\n");
      out.write("                                <button class=\"btn btn-block btn-lg btn-info btn-rounded\" name=\"btn-login\" type=\"submit\">Ingresar</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group m-b-0\">\n");
      out.write("                            <div class=\"col-sm-12 text-center\">\n");
      out.write("                                No tienes una cuenta? <a href=\"#\" class=\"text-info m-l-5\"><b>Contacta el administrador</b></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <form class=\"form-horizontal\" id=\"recoverform\" action=\"index.html\">\n");
      out.write("                        <div class=\"form-group \">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <h3>Recuperar Contraseña</h3>\n");
      out.write("                                <p class=\"text-muted\">Para recuperar tu contraseña tienes que ingresar tu correo y te invieremos un email con tu contraseña! </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group \">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" required=\"\" placeholder=\"Email\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group text-center m-t-20\">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <button class=\"btn btn-primary btn-lg btn-block text-uppercase waves-effect waves-light\" type=\"submit\">Recuperar</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    ");

    
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
             response.sendRedirect("main.jsp");
         }
     }
        
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function() {\n");
      out.write("            $(\".preloader\").fadeOut();\n");
      out.write("        });\n");
      out.write("        $(function() {\n");
      out.write("            $('[data-toggle=\"tooltip\"]').tooltip()\n");
      out.write("        });\n");
      out.write("        // Login and Recover Password \n");
      out.write("        $('#to-recover').on(\"click\", function() {\n");
      out.write("            $(\"#loginform\").slideUp();\n");
      out.write("            $(\"#recoverform\").fadeIn();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</body>\n");
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
