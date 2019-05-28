<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.usuarioLogin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport">
        <title>Login</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.4/css/bulma.css"> 
        <link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <link rel="icon" href="logo.png" type="image/x-icon" />
        <link rel="stylesheet" href="estilo.css">
    </head>
      <body class="body">
          <div class="modal" id="Eregistro">
  <div class="modal-background"></div>
  <div class="modal-card">
    <header class="modal-card-head">
      <p class="modal-card-title">Registrate</p>
      <button class="delete" aria-label="close"></button>
    </header>
    <section class="modal-card-body">
       <form action="registro" method="post" onsubmit="return validar();">
            <p>
                <label>Usuarios</label>
                <input type="text" name="Usuario" id="Usuario" class="input is-rounded" required >
            </p>
            <p>
                <label>Contraseña (mayúsculas, minúsculas, números / caracteres especiales y 8 caracteres como mínimo)</label>
                <input type="password" name="Pass" id="password"class="input is-rounded"required>
            </p>
             <p>
                <label>Confirmar contraseña</label>
                <input type="password" name="cpassword" id="cpassword"class="input is-rounded" required>
            </p>
            <p>
                <label>Nombre</label>
                <input type="text" name="Nombre" id="Nombre" class="input is-rounded" required="" >
            </p>
            <p>
                <label>Apellido</label>
                <input type="text" name="Apellido" id="Apellido" class="input is-rounded" required>
            </p>
            <p>
                <label>Email</label>
                <input type="email" name="Email" id="Email" class="input is-rounded" required>
            </p>
            <p>
                <label>Documento</label>
                <input type="text" name="Documento" id="Documento" class="input is-rounded" required>
            </p>
            <br>
            <p class="block"> 
                <input type="submit" name="registrar1" class="button is-info is-rounded">
            </p>
           
        </form>
    </section>
    <footer class="modal-card-foot">
        
    </footer>
  </div>
</div>
              <section class="">
            <div class="hero-body">
              <div class="container has-text-centered">
                <div class="column is-4 is-offset-4">
                  <h3 class="title has-text-white">GOODPARKING</h3>
                  <p class="subtitle has-text-white">log for init </p>
                  <div class="box">
                    <figure class="avatar">
                      <img src="logo.png">
                    </figure>
                    <form class="box" action="login" method="post"> 
                      <div class="field">
                        <div class="control">
                            <label class="label">usuarios:</label>
                          <input  name="Usuario" required type="text" placeholder="Your Email" >
                        </div>
                      </div>
                      <div class="field">
                        <div class="control">
                            <label class="label">contraseña:</label>
                          <input  name="Pass" required type="password" placeholder="Your Password">
                        </div>
                      </div>
                      
                      <div class="field">
                      </div>
                      <input type="submit" name="enviar">
                      <a id="Vregistro">Sign Up</a>
                    </form>
                  </div>
                </div>
              </div>
            </div>
                  
            <%
                HttpSession sesion = request.getSession();
                List<usuarioLogin> datos = new ArrayList<>();
                  if(request.getAttribute("fail") != null){
                    out.print("<script>alert('usuario o contra erronea');</script>");
                  }
                  if(request.getAttribute("carlos") != null){
                    out.print("<script>alert('el usuario y/o email ya existen');</script>");
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
                        documento = u.getDocumento();
                        nivel = u.getNivel();
                        id = u.getId();
                    }
                    sesion.setAttribute("Usuario",nombre);
                    sesion.setAttribute("Pass",pass);
                    sesion.setAttribute("Nombre",usuario);
                    sesion.setAttribute("Apellido",apellido);
                    sesion.setAttribute("Email",email);
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
            %>
          </section>
          <script type="text/javascript" src="registrojs.js"></script>

    </body>
</html>
