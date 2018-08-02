package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lockscreen_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/login-register-lock.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"img/icons/logoTitle.ico\">\n");
      out.write("        <title>LockScreen</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"card-no-border\">\n");
      out.write("        <!-- Preloader - buscar en spinners.css -->\n");
      out.write("    <div class=\"preloader\">\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <div class=\"loader__figure\"></div>\n");
      out.write("            <p class=\"loader__label\">Cargando</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("     ");

            String idu = request.getParameter("idu");
        
      out.write("\n");
      out.write("    <section id=\"wrapper\">\n");
      out.write("        <input type=\"text\" value=\"");
      out.print(idu);
      out.write("\"/>\n");
      out.write("        <div class=\"login-register\" style=\"background-image:url(img/login-register.jpg);\">\n");
      out.write("            <div class=\"login-box card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form class=\"form-horizontal form-material\" id=\"loginform\" action=\"index.html\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-xs-12 text-center\">\n");
      out.write("                                <div class=\"user-thumb text-center\"> <img alt=\"user\" id=\"imgU\" class=\"img-circle\" width=\"100\">\n");
      out.write("                                    <h3 id=\"user\"></h3>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group \">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <input class=\"form-control\" type=\"password\" required=\"\" placeholder=\"password\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group text-center\">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <button class=\"btn btn-info btn-lg btn-block text-uppercase waves-effect waves-light\" type=\"submit\">Ingresar</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function() {\n");
      out.write("            $(\".preloader\").fadeOut();\n");
      out.write("        });\n");
      out.write("        $(function() {\n");
      out.write("            $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
