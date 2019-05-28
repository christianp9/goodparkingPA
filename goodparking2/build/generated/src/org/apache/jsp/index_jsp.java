package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.usuarioLogin;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\">\n");
      out.write("        <title>Logi</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.4/css/bulma.css\"> \n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Pacifico\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"icon\" href=\"logo.png\" type=\"image/x-icon\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilo.css\">\n");
      out.write("    </head>\n");
      out.write("      <body class=\"body\">\n");
      out.write("          <div class=\"modal\" id=\"Eregistro\">\n");
      out.write("  <div class=\"modal-background\"></div>\n");
      out.write("  <div class=\"modal-card\">\n");
      out.write("    <header class=\"modal-card-head\">\n");
      out.write("      <p class=\"modal-card-title\">Registrate</p>\n");
      out.write("      <button class=\"delete\" aria-label=\"close\"></button>\n");
      out.write("    </header>\n");
      out.write("    <section class=\"modal-card-body\">\n");
      out.write("       <form action=\"registro\" method=\"post\" onSubmit=\"return validar()\">\n");
      out.write("            <p>\n");
      out.write("                <label>Usuario</label>\n");
      out.write("                <input type=\"text\" name=\"Usuario\" id=\"Usuario\" class=\"input is-rounded\" >\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <label>Contraseña (mayúsculas, minúsculas, números / caracteres especiales y 8 caracteres como mínimo)</label>\n");
      out.write("                <input type=\"password\" name=\"Pass\" id=\"password\"class=\"input is-rounded\"required>\n");
      out.write("            </p>\n");
      out.write("             <p>\n");
      out.write("                <label>Confirmar contraseñe</label>\n");
      out.write("                <input type=\"cpassword\" name=\"cpassword\" id=\"cpassword\"class=\"input is-rounded\" required>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <label>Nombre</label>\n");
      out.write("                <input type=\"text\" name=\"Nombre\" id=\"Nombre\" class=\"input is-rounded\" >\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <label>Apellido</label>\n");
      out.write("                <input type=\"text\" name=\"Apellido\" id=\"Apellido\" class=\"input is-rounded\" required>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <label>Email</label>\n");
      out.write("                <input type=\"email\" name=\"Email\" id=\"Email\" class=\"input is-rounded\" required>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <label>Documento</label>\n");
      out.write("                <input type=\"text\" name=\"Documento\" id=\"Documento\" class=\"input is-rounded\" required>\n");
      out.write("            </p>\n");
      out.write("            <input type=\"text\">\n");
      out.write("            <br>\n");
      out.write("            <p class=\"block\"> \n");
      out.write("                <input type=\"submit\" class=\"button is-link\">\n");
      out.write("            </p>\n");
      out.write("            <input type=\"hidden\" name=\"Nivel\" value=\"1\"/>\n");
      out.write("        </form>\n");
      out.write("    </section>\n");
      out.write("    <footer class=\"modal-card-foot\">\n");
      out.write("        \n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("              <section class=\"\">\n");
      out.write("            <div class=\"hero-body\">\n");
      out.write("              <div class=\"container has-text-centered\">\n");
      out.write("                <div class=\"column is-4 is-offset-4\">\n");
      out.write("                  <h3 class=\"title has-text-white\">GOODPARKING</h3>\n");
      out.write("                  <p class=\"subtitle has-text-white\">log for init </p>\n");
      out.write("                  <div class=\"box\">\n");
      out.write("                    <figure class=\"avatar\">\n");
      out.write("                      <img src=\"logo.png\">\n");
      out.write("                    </figure>\n");
      out.write("                    <form class=\"box\" action=\"login\" method=\"post\"> \n");
      out.write("                      <div class=\"field\">\n");
      out.write("                        <div class=\"control\">\n");
      out.write("                            <label class=\"label\">usuario:</label>\n");
      out.write("                          <input  name=\"Usuario\" required type=\"text\" placeholder=\"Your Email\" >\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"field\">\n");
      out.write("                        <div class=\"control\">\n");
      out.write("                            <label class=\"label\">contraseña:</label>\n");
      out.write("                          <input  name=\"Pass\" required type=\"password\" placeholder=\"Your Password\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"field\">\n");
      out.write("                      </div>\n");
      out.write("                      <input type=\"submit\" name=\"enviar\">\n");
      out.write("                    </form>\n");
      out.write("                  </div>\n");
      out.write("                  <p class=\"has-text-white\">\n");
      out.write("                      <a id=\"Vregistro\">Sign Up</a> &nbsp;·&nbsp;\n");
      out.write("                    <a href=\"#\">Need Help?</a>\n");
      out.write("                  </p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                  \n");
      out.write("            ");

                HttpSession sesion = request.getSession();
                List<usuarioLogin> datos = new ArrayList<>();
                  if(request.getAttribute("fail") != null){
                    out.print("<script>alert('usuario o contra erronea');</script>");
                  }
                if (request.getAttribute("datos") != null){
                    datos = (List<usuarioLogin>)request.getAttribute("datos");
                    String usuario = "",pass = "",nombre = "", apellido = "", email = "",documento = "",matricula = "", tipo = "", vehiculo = "";
                    int nivel = 0;
                    int id = 0;
                    for(usuarioLogin u : datos){
                        nombre = u.getNombre();
                        usuario = u.getUsuario();
                        pass = u.getPass();
                        apellido = u.getApellido();
                        email = u.getEmail();
                        matricula = u.getMatricula();
                        tipo = u.getTipo();
                        vehiculo = u.getVehiculo();
                        documento = u.getDocumento();
                        nivel = u.getNivel();
                        id = u.getId();
                    }
                    sesion.setAttribute("Usuario",nombre);
                    sesion.setAttribute("Pass",pass);
                    sesion.setAttribute("Nombre",usuario);
                    sesion.setAttribute("Apellido",apellido);
                    sesion.setAttribute("Email",email);
                    sesion.setAttribute("Matricula", matricula);
                    sesion.setAttribute("Tipo", tipo);
                    sesion.setAttribute("Vehiculo", vehiculo);
                    sesion.setAttribute("Documento",documento);
                    sesion.setAttribute("Nivel", nivel);
                    sesion.setAttribute("Id_usuario", id);
                    
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/menu.jsp");
                    dispatcher.forward(request, response);
                }
                if(request.getParameter("cerrar") != null){
                    sesion.invalidate();
                    response.sendRedirect("index.jsp");
                }
            
      out.write("\n");
      out.write("          </section>\n");
      out.write("          <script type=\"text/javascript\" src=\"registrojs.js\"></script>\n");
      out.write("          <script type=\"text/javascript\" src=\"contraseñas.js\"></script>\n");
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
