package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class topo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro Vem Monstro</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .espaco{\n");
      out.write("                margin: 0 0 10px 0 ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .erro{\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Bloco principal -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Cria uma linha na tela -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- Limitar o espaço para os textos-->\n");
      out.write("                <div class=\"col-md-8 mb-3\" style=\"margin: auto;\">\n");
      out.write("                    <!-- Cria abarra de navegação personalizada -->\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"./\">Vem Monstro</a>\n");
      out.write("                        <!-- Personalizar a barra de links -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\n");
      out.write("                            <div class=\"navbar-nav\">\n");
      out.write("                                <a class=\"nav-item nav-link\" href=\"view_novo.jsp\">Novo</a>\n");
      out.write("                                <a class=\"nav-item nav-link\" href=\"\">Pesquisar</a>\n");
      out.write("                                <a class=\"nav-item nav-link\" href=\"\">Listar Todos</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>");
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
