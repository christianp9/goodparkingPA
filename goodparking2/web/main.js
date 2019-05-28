let button = document.getElementById('Eperfil');
let modal = document.getElementById('page-modal');
let close = document.getElementsByClassName('delete')[0];
let ver = document.getElementById('Vperfil');
let modal2 = document.getElementById('modal-perfil');
let menu = document.getElementById('menu-modals');
let muestra = document.getElementById('mostrar');

button.onclick = function () {
    modal.style.display = 'block';
};

close.onclick = function () {
    modal.style.display = 'none';
};

ver.onclick = function () {
    modal2.style.display = 'block';
};
muestra.onclick = function () {
    menu.style.display = 'block';
};
function validar() {
    let usuario = document.getElementById('Usuario').value;
    let pass = document.getElementById('Pass').value;
    let apellido = document.getElementById('Apellido').value;
    let correo = document.getElementById('Email').value;
    let documento = document.getElementById('Documento').value;
    let nombre = document.getElementById('Nombre').value;
    let expresion = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    let regex = /(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$/;
    let regular = /^[1-9]-?\d{4}-?\d{4}$/;
    if (usuario === '' | pass === '' | apellido === '' | correo === '' |  documento === '' | nombre === '') {
        alert('verifique sus datos');
        return false;
    } else if (regex.test(pass)) {
        alert('verifique su contraseña');
        return false;
    } else if (isNaN(documento) | regular.test(documento)) {
        alert('verifique su documento');
        return false;
    } else if (usuario.length > 23 | apellido.length > 23) {
        alert('el usuario y/o contraseña es muy largo');
        return false;
    } else if (nombre.length > 23) {
        alert('el nombre es muy largo');
        return false;
    } else if (!expresion.test(correo)) {
        alert('verifique su correo');
        return false;
    } else if (documento.length > 14) {
        alert('revise su documento');
        return false;
    } else {
        return true;
    }
};
(function () {
    let burger = document.querySelector('.burger');
    let nav = document.querySelector('#' + burger.dataset.target);

    burger.addEventListener('click', function () {
        burger.classList.toggle('is-active');
        nav.classList.toggle('is-active');
    });
})();