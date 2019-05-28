package servlets;

import controller.DAOusuer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.usuarioLogin;

public class editarServlet extends HttpServlet {
    usuarioLogin user = new usuarioLogin();
    DAOusuer dao = new DAOusuer();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        user.setUsuario(request.getParameter("Usuario"));
        user.setPass(request.getParameter("Pass"));
        user.setNombre(request.getParameter("Nombre"));
        user.setApellido(request.getParameter("Apellido"));
        user.setEmail(request.getParameter("Email"));
        user.setDocumento(request.getParameter("Documento"));
        user.setId(Integer.parseInt(request.getParameter("id")));
        
        String usuario = user.getUsuario();
        String pass = user.getPass();
        String nombre = user.getNombre();
        String apeliido = user.getApellido();
        String email = user.getEmail();
        String documento = user.getDocumento();
        int id = user.getId();
        
        if(request.getParameter("editar") != null){
            dao.actualizar(usuario, pass, nombre, apeliido, email, documento, id);
            response.sendRedirect("menu.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
