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
public class vehiculo {
    private int Id;
    private String vehiculo;
    private String tipo;
    private String matricula;

    public vehiculo() {
    }

    public vehiculo(int Id, String matricula, String tipo, String vehiculo) {
        this.Id = Id;
        this.vehiculo = vehiculo;
        this.tipo = tipo;
        this.matricula = matricula;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
