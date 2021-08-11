/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Fajardo
 */
public class DataModelDB {
    
    public ArrayList<DataDB> getPets(int idHospital){
        Pool conexion = new Pool();
        Connection conectar = null;
        PreparedStatement pst;
        ResultSet rs;
        DataDB datosDB;
        ArrayList list = new ArrayList();
        try{
            conectar = conexion.initializeDataSource().getConnection();
            if (conectar != null){
                System.out.println("Conexión exitosa");
                String sql = "SELECT tb_pet.id,tb_pet.name, tb_pet.code, tb_pet.breed FROM tb_pet_hospital INNER JOIN  tb_pet ON (tb_pet_hospital.id_pet = tb_pet.id) INNER JOIN tb_hospital ON (tb_pet_hospital.id_hospital = tb_hospital.id) WHERE tb_hospital.id =?";
                pst = conectar.prepareStatement(sql);
                pst.setInt(1, idHospital);
                rs = pst.executeQuery();
                while (rs.next()){
                    datosDB = new DataDB();
                    datosDB.setIdPet(rs.getInt("id"));
                    datosDB.setName(rs.getString("name"));
                    datosDB.setCode(rs.getInt("code"));
                    datosDB.setBreed(rs.getString("breed"));
                    list.add(datosDB);
                }                
            }else{
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                conectar.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
        return list;
    }
    
    public ArrayList<DataDB> getHospital(){
        Pool conexion = new Pool();
        Connection conectar = null;
        PreparedStatement pst;
        ResultSet rs;
        DataDB datosDB;
        ArrayList list = new ArrayList();
        try{
            conectar = conexion.initializeDataSource().getConnection();
            if (conectar != null){
                System.out.println("Conexión exitosa");
                String sql = "SELECT id, hospital, address FROM tb_hospital";
                pst = conectar.prepareStatement(sql);                
                rs = pst.executeQuery();
                while (rs.next()){
                    datosDB = new DataDB();
                    datosDB.setIdHospital(rs.getInt("id"));
                    datosDB.setHospital(rs.getString("hospital"));
                    datosDB.setAddress(rs.getString("address"));                    
                    list.add(datosDB);
                }                
            }else{
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                conectar.close();
            }catch(SQLException e){
                System.out.println("Error" + e);
            }
        }
        return list;
    }
}
