let button = document.getElementById('Vregistro');
let modal = document.getElementById('Eregistro');
let close = document.getElementsByClassName('delete')[0];

button.onclick = function() {
    modal.style.display = 'block';
};

close.onclick = function() {
    modal.style.display = 'none';
};

function validar(){
    let usuario = document.getElementById('Usuario').value;
    let pass = document.getElementById('password').value;
    let apellido = document.getElementById('Apellido').value;
    let clave = document.getElementById('password').value;
    let correo = document.getElementById('Email').value;
    let cpass = document.getElementById('cpassword').value;
    let documento = document.getElementById('Documento').value;
    let nombre = document.getElementById('Nombre').value;
    let expresion = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    let regex = /(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$/;
    let regular =/^[1-9]-?\d{4}-?\d{4}$/;
    if(usuario === '' |  pass ==='' | apellido === ''| clave === ''| correo === ''| cpass=== ''| documento === '' | nombre === ''){
        alert('verifique sus datos');
        return false;
    }else if(regex.test(clave)){
        alert('verifique su contraseña');
        return false;
    }else if(cpass !== clave){
        alert('las claves no coinciden');
        return false;
    }else if(isNaN(documento) | regular.test(documento)){
        alert('verifique su documento');
        return false;
    }else if(usuario.length > 23 | apellido.length > 23){
        alert('el usuario y/o contraseña es muy largo');
        return false;
    }else if(nombre.length > 23){
        alert('el nombre es muy largo');
        return false;
    }else if(!expresion.test(correo)){
        alert('verifique su correo');
        return false;
    }else if(documento.length > 14){
        alert('revise su documento');
        return false;
    }else{
    return true;
    }
};