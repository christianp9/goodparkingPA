create database goodparking;
use goodparking;

create
	table if not exists usuarios(
    Id_usuario int auto_increment primary key,
    Usuario varchar(50),
    Pass varchar(50),
    Nombre varchar(50),
    Apellido varchar(50),
    Email varchar(50),
    Documento varchar(50),
    Nivel int
    );
create table if not exists vehiculos(
	Id_Usuario int,
    Matricula varchar(10),
    Tipo varchar(20),
    Vehiculo varchar(50)
);
    
select * from vehiculos;
select * from usuarios;
create procedure insertdatos1(Usuario varchar(50),
    Pass varchar(50),
    Nombre varchar(50),
    Apellido varchar(50),
    Email varchar(50),
    Documento varchar(50),
    Nivel int) insert into usuarios(Usuario,Pass, Nombre, Apellido, Email, Documento, Nivel) values(Usuario, Pass, Nombre, Apellido, Email, Documento, Nivel);
    
create procedure insertvehiculo(Id_Usuario int,
    Matricula varchar(10),
    Tipo varchar(20),
    Vehiculo varchar(50)) insert into vehiculos(Id_Usuario,Matricula,Tipo, Vehiculo) values(Id_Usuario,Matricula, Tipo, Vehiculo);

call insertvehiculo(2,'2','3','4');
