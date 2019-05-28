/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author usuario
 */
public class usuarioLogin {
   private int id;
   private String usuario;
   private String pass;
   private String nombre;
   private String apellido;
   private String email;
   private String matricula;
   private String tipo;
   private String vehiculo;
   private String documento;
   private int nivel;

    public usuarioLogin() {
    }

    public usuarioLogin(String usuario,String pass, String nombre, String apellido, String email,String documento, int nivel, int id) {
        this.id = id;
        this.usuario = usuario;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.documento = documento;
        this.nivel = nivel;
    }

    public usuarioLogin(int id, String usuario, String pass, String nombre, String apellido, String email, String documento, int nivel) {
        this.id = id;
        this.usuario = usuario;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.documento = documento;
        this.nivel = nivel;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

  
    
}
