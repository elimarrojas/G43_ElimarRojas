/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Fajardo
 */
public class DataModelDB {
    
    public ArrayList<DataDB>getOwners(int idOwner){
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DataDB datosDB;
        ArrayList list = new ArrayList();
        try{
            String sql = "SELECT id, owner FROM tb_owner";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if(cn != null){
                System.out.println("Conexión exitosa");
                while(rs.next()){
                    datosDB = new DataDB();
                    datosDB.setIdOwner(rs.getInt("id"));
                    datosDB.setOwner(rs.getString("owner"));
                    list.add(datosDB);
                }                
            }else{
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
    
    public ArrayList<DataDB>getHospital(int idHospital){
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DataDB datosDB;
        ArrayList list = new ArrayList();
        try{
            String sql = "SELECT id, name FROM tb_hospital";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if(cn != null){
                System.out.println("Conexión exitosa DataModelDB");
                while (rs.next()){
                    datosDB = new DataDB();
                    datosDB.setIdHospital(rs.getInt("id"));
                    datosDB.setHospital(rs.getString("name"));
                    list.add(datosDB);                    
                }
            }else{
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
    
    public ArrayList<DataDB>getPetType(){
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DataDB datosDB;
        ArrayList list = new ArrayList();
        try{
            String sql = "SELECT DISTINCT(pet_type) FROM `tb_breed`";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if(cn != null){
                System.out.println("Conexión exitosa DataModelDB");
                while (rs.next()){
                    datosDB = new DataDB();                    
                    datosDB.setPetType(rs.getString("pet_type"));
                    list.add(datosDB);                    
                }
            }else{
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
    
    
    public ArrayList<DataDB> getBreed(String petType){
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DataDB datosDB;
        ArrayList list = new ArrayList();
        try {
            String sql = "SELECT id, breed FROM tb_breed WHERE pet_type = '" + petType +"'";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if(cn != null){
                System.out.println("Conexión exitosa DataModelDB");
                while (rs.next()){
                    datosDB = new DataDB();
                    datosDB.setIdBreed(rs.getInt("id"));
                    datosDB.setBreed(rs.getString("breed"));
                    list.add(datosDB); 
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en la consulta", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e, "Error en la conexión", JOptionPane.ERROR_MESSAGE);
//        }finally{
//            try{
//                connect.close();
//            }cacth(SQLException ex){
//                System.out.println("Error" + ex);
//            }
        }
        return list;
       }
}


