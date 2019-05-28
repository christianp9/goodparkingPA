package servlets;

import controller.DAOusuer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.usuarioLogin;

public class loginS extends HttpServlet {

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
          usuarioLogin user = new usuarioLogin();
        DAOusuer dao = new DAOusuer();
        List<usuarioLogin> datos = new ArrayList<>();
        user.setUsuario(request.getParameter("Usuario"));
        user.setPass(request.getParameter("Pass"));
        
        if(request.getParameter("enviar") != null){ 
            String usuario = user.getUsuario();
            String pass = user.getPass();
            datos = dao.accesar(usuario, pass);
            if(datos.size() > 0){
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }else{
                request.setAttribute("fail", "no hay acceso");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
