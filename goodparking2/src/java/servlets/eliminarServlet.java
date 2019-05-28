package servlets;

import controller.DAOusuer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.usuarioLogin;

@WebServlet(name = "eliminarServlet", urlPatterns = {"/eliminar"})
public class eliminarServlet extends HttpServlet {
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
        user.setId(Integer.parseInt(request.getParameter("id_usuario")));
        int id = user.getId();
        if(request.getParameter("eliminar") != null){
            dao.eliminar(id);
            response.sendRedirect("index.jsp");
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
