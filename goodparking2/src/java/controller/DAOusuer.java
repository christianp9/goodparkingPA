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
import model.usuarioLogin;

/**
 *
 * @author usuario
 */
public class DAOusuer {
    database con = new database();
    usuarioLogin user = new usuarioLogin();
    public List<usuarioLogin> accesar(String usuario, String pass){  
        List<usuarioLogin> datos = new ArrayList<>();
        Connection conn;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String query = "select * from usuarios where Usuario = ? and Pass = ?";
            try {
                conn = con.getConexion();
                pst = conn.prepareStatement(query);
                pst.setString(1, usuario);
                pst.setString(2, pass);
                rs = pst.executeQuery();
                while(rs.next()){
                datos.add(new usuarioLogin(
                        rs.getString("Usuario"),
                        rs.getString("Pass"),
                        rs.getString("Nombre"),
                        rs.getString("Apellido"),
                        rs.getString("Email"),
                        rs.getString("Documento"),
                        rs.getInt("Nivel"),
                        rs.getInt("Id_usuario")));
                }
            } catch (Exception e) {
                System.out.println("ERROR: "+e);
            }finally{
                try {
                    if(con.getConexion() != null) con.getConexion().close();
                    if(pst != null) pst.close();
                    if(rs != null) rs.close();
                } catch (SQLException e) {
                System.err.println("ERROR:"+e);
                }
            }
        return datos; 
    }
    public boolean registrarUsuario( String usuario, String pass, String nombre,
                              String apellido, String email, String documento, 
                              int nivel){
        Connection conn;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String query = "call insertdatos1(?,?,?,?,?,?,?);";
        try {
            pst = con.getConexion().prepareStatement(query);
            pst.setString(1, usuario);
            pst.setString(2, pass);
            pst.setString(3, nombre);
            pst.setString(4, apellido);
            pst.setString(5, email);
            pst.setString(6, documento);
            pst.setInt(7, nivel);
            if(pst.executeUpdate() == 1){
                return true;
            }
        } catch (Exception e) {
            System.out.println("ERROR: "+e);
        }finally{
                try {
                    if(con.getConexion() != null) con.getConexion().close();
                    if(pst != null) pst.close();
                    if(rs != null) rs.close();
                } catch (SQLException e) {
                System.err.println("ERROR:"+e);
                }
            }
        return false;
    }
    public void eliminar(int id) {
        Connection conn;
        PreparedStatement pst = null;
        String query = "delete from usuarios where Id_usuario = ?";
        try {
            pst = con.getConexion().prepareStatement(query);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (Exception e) {
            System.err.println("ERROR: "+e);
        }finally{
                try {
                    if(con.getConexion() != null) con.getConexion().close();
                    if(pst != null) pst.close();
                } catch (SQLException e) {
                System.err.println("ERROR:"+e);
                }
            }
        
    }
    public void actualizar(String usuario, String pass, String nombre,
                           String apellido, String email,
                           String documento, int id){
        String query = "update usuarios set Usuario = ?, Pass = ?, Nombre = ?, Apellido = ?, Email = ?, Documento = ? where Id_usuario = ?;";
        Connection conn;
        PreparedStatement pst = null;
        try {
            pst = con.getConexion().prepareStatement(query);
            pst.setString(1, usuario);
            pst.setString(2, pass);
            pst.setString(3, nombre);
            pst.setString(4, apellido);
            pst.setString(5, email);
            pst.setString(6, documento);
            pst.setInt(7, id);
            
            pst.executeUpdate();
        } catch (Exception e) {
            System.err.println("ERROR: "+e);
        }finally{
                try {
                    if(con.getConexion() != null) con.getConexion().close();
                    if(pst != null) pst.close();
                } catch (SQLException e) {
                System.err.println("ERROR:"+e);
                }
            }
    }
 
   public boolean verificar(String email, String usuario){
       Connection conn;
       PreparedStatement pst = null;
       ResultSet rs = null;
       String query = "SELECT * FROM usuarios WHERE Email= ? AND Usuario= ?";
        try {
            conn = con.getConexion();
            pst = conn.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, usuario);
            rs = pst.executeQuery();
            while(rs.next()){
                return true;
            }
        } catch (Exception e) {
            System.out.println("ERROR: "+e);
        }finally{
                try {
                    if(con.getConexion() != null)con.getConexion().close();
                    if(pst != null) pst.close();
                } catch (SQLException e) {
                System.err.println("ERROR:"+e);
                }
            }
       return false;
   }
    public static void main(String[] args) {
        DAOusuer user = new DAOusuer();
        System.out.println(user.registrarUsuario("1", "2", "3", "4", "5", "6", 1));
    }
}
