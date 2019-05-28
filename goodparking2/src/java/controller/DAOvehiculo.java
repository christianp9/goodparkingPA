/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.vehiculo;


public class DAOvehiculo {

    database con = new database();
    vehiculo veh = new vehiculo();
    public List<vehiculo> listar() {
        List<vehiculo> Lista = new ArrayList<>();
        Connection conn;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String query = "select * from vehiculos";
        try {
            conn = con.getConexion();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                veh.setId(rs.getInt(1));
                veh.setMatricula(rs.getString(2));
                veh.setTipo(rs.getString(3));
                veh.setVehiculo(rs.getString(4));
                Lista.add(veh);
            }
        } catch (Exception e) {
        }
        return Lista;
    }

    public boolean registrarVehiculo(int Id, String matricula, String tipo, String vehiculo) {
        Connection conn;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String query = "call insertvehiculo(?,?,?,?);";
        try {
            pst = con.getConexion().prepareStatement(query);
            pst.setInt(1, Id);
            pst.setString(2, vehiculo);
            pst.setString(3, tipo);
            pst.setString(4, matricula);
            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return false;
    }

    public void eliminar(int id) {
        Connection conn;
        PreparedStatement pst = null;
        String query = "delete from usuarios where Id_usuario = ? and ";
        try {
            pst = con.getConexion().prepareStatement(query);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        } finally {
            try {
                if (con.getConexion() != null) {
                    con.getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                System.err.println("ERROR:" + e);
            }
        }
    }
}
