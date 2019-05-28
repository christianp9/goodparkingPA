<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.4/css/bulma.css"> 
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <link rel="stylesheet" href="panel.css">
        <title>Menu</title>
    </head>
    <body>

        <%
            HttpSession ses = request.getSession();
            String usuario = "", pass = "", nombre = "", apellido = "", email = "", documento = "";
            int nivel = 0;
            int id = 0;
            if (ses.getAttribute("Usuario") != null && ses != null && ses.getAttribute("Nivel") != null && ses.getAttribute("Id_usuario") != null) {
                usuario = ses.getAttribute("Usuario").toString();
                pass = ses.getAttribute("Pass").toString();
                nombre = ses.getAttribute("Nombre").toString();
                apellido = ses.getAttribute("Apellido").toString();
                email = ses.getAttribute("Email").toString();
                documento = ses.getAttribute("Documento").toString();
                nivel = Integer.parseInt(ses.getAttribute("Nivel").toString());
                id = Integer.parseInt(ses.getAttribute("Id_usuario").toString());

                if (nivel != 1) {
                    response.sendRedirect("index.jsp");
                }
            } else {
                response.sendRedirect("index.jsp");
            }
        %>
        <div>
            <nav class="navbar is-info">
                <div class="container">
                    <div class="navbar-brand">
                        <a class="navbar-item" href="/">GOODPARKING</a>
                        <span class="navbar-burger burger" data-target="navMenu">
                            <span></span>
                            <span></span>
                            <span></span>
                        </span>
                    </div>
                    <div id="navMenu" class="navbar-menu">
                        <div class="navbar-end">
                            <a class="navbar-item is-active"  href="#">configuraciones</a>
                            <a class="navbar-item" href="/">GOODPARKING</a>
                            <a class="navbar-item" href="/">GOODPARKING</a>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
        <nav class="breadcrumb is-centered is-large" aria-label="breadcrumbs">
            <ul>
                <li><a href="mapa.jsp" target="myframe">mapa</a></li>
                <li><a href="menu.jsp" aria-current="page">menu</a></li>
            </ul>
        </nav>
        <div class="co">

            <iframe name="myframe">

            </iframe>

        </div>                       

        <div class="modal" id="page-modal">
            <div class="modal-background"></div>
            <div class="modal-card">
                <header class="modal-card-head">
                    <p class="modal-card-title">Edita Tus Datos</p>
                    <button class="delete" aria-label="close"></button>
                </header>
                <section class="modal-card-body">
                    <form action="editar" method="post" onsubmit="return validar();">
                        <p>
                            <label>Usuario</label>
                            <input type="text" name="Usuario" id="Usuario" value="<%=nombre%>" class="input is-rounded" >
                        </p>
                        <p>
                            <label>Contraseña</label>
                            <input type="password" name="Pass" id="Pass" value="<%=pass%>" class="input is-rounded">
                        </p>
                        <p>
                            <label>Nombre</label>
                            <input type="text"id="Nombre" value="<%=usuario%>" name="Nombre" class="input is-rounded">
                        </p>
                        <p>
                            <label>Apellido</label>
                            <input type="text" value="<%=apellido%>" id="Apellido" name="Apellido"class="input is-rounded">
                        </p>
                        <p>
                            <label>Email</label>
                            <input type="email" value="<%=email%>" id="Email" name="Email" class="input is-rounded">
                        </p>
                        <p>
                            <label>Documento</label>
                            <input type="text" value="<%=documento%>" id="" name="Documento" class="input is-rounded">
                        </p>
                        <br>
                        <button class="button is-success" type="submit" name="editar">Save changes</button>
                        <input type="hidden" name="id" value="<%=id%>"/>
                    </form>
                </section>
                <footer class="modal-card-foot">
                    df
                </footer>
            </div>
        </div>
        <div class="modal" id="menu-modals">
            <div class="modal-background"></div>
            <div class="modal-card">
                <header class="modal-card-head">
                    <p class="modal-card-title">Modal title</p>
                    <button class="delete" aria-label="close"></button>
                </header>
                <section class="modal-card-body">
                    <form action="carroS" method="post">
                        <p>
                            <label>Matricula</label>
                            <input type="text" name="Matricula" id="Matricula" class="input is-rounded" >
                        </p>
                        <p>
                            <label>Tipo</label>
                        <div class="field">
                            <div class="control">
                                <div class="select is-info">
                                    <select name="Tipo">
                                        <option value="carro">carro</option>
                                        <option value="moto">moto</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        </p>
                        <p>
                            <label>Vehiculo</label>
                            <input type="text" id="Vehiculo" name="Vehiculo" class="input is-rounded">
                        </p>
                        <br>
                        <button class="button is-success" type="submit" name="carro">agregar carro</button>
                        <input type="hidden" name="ID" value="<%=id%>"/>
                    </form>
                </section>
                <footer class="modal-card-foot">
                </footer>
            </div>
        </div>
        <br>
        <div class="modal" id="modal-perfil">
            <div class="modal-background"></div>
            <div class="modal-content">
                <section>
                    <table class="table">
                        <br>
                        <thead>
                            <tr>
                                <th><abbr title="ID">ID</abbr></th>
                                <th><abbr title="Matricula">Matricula</abbr></th>
                                <th><abbr title="Tipo">Tipo</abbr></th>
                                <th><abbr title="Vehiculo">Vehiculo</abbr></th>
                                <th>Opciones</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="dato" items="${datos}">
                            <tr>
                                <td>${dato.getId()}</td>
                                <td>${dato.getMatricula()}</td>
                                <td>${dato.getTipo()}</td>
                                <td>${dato.getVehiculo()}</td>
                                <td></td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </section>
            </div>
            <button class="modal-close is-large" aria-label="close"></button>
        </div>
        <button name></button>
        <div class="middle">
            <div class="menu">
                <li class="item" id="profile">
                    <a href="#profile" class="btn"><i class="fas fa-user"></i>Perfil</a>
                    <div class="smenu">
                        <button class="elbo"><a   href="#">Perfil</a></button>
                        <button class="elbo"><a href="#">foto</a></button>
                    </div>
                </li>
                <li class="item" id="ajustes">
                    <a href="#ajustes" class="btn"><i class="fas fa-user-cog"></i>Ajustes</a>
                    <div class="smenu">
                        <button class="elbo"><a id="Eperfil" href="#">Editar Perfil</a></button>
                        <form action="eliminar" method="post">
                            <input type="hidden" name="id_usuario" value="<%=id%>" >
                            <button class="elbo" type="submit" name="eliminar"><a>Eliminar Prfil</a></button>
                        </form>
                    </div>
                </li>
                <li class="item" id="informacion">
                    <a href="#informacion" class="btn"><i class="fas fa-car"></i>Carro</a>
                    <div class="smenu">
                        <form action="Mcarro" method="post">
                            <button class="elbo" name="mcar"><a id="Vperfil"  href="#">tu vehiculo</a></button>
                        </form>>
                        <button class="elbo"><a id="mostrar" href="#">agregar un vehiculo</a></button>
                        <button class="elbo"><a href="#">eliminar tu vehiculo</a></button>
                        <button class="elbo"><a href="#">editar tu vehiculo</a></button>
                    </div>
                </li>
                <li class="item">
                    <a class="btn" href="index.jsp?cerrar=true"><i class="fas fa-door-open"></i>Salir</a>
                </li>
            </div>
        </div> 



        <script type="text/javascript" src="main.js"></script>
    </body>
</html>
