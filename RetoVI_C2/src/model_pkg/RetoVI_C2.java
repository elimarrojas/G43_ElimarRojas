/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import view_pkg.FrameHospital;


/**
 *
 * @author Daniel Fajardo
 */
public class RetoVI_C2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion inst_connect = new Conexion();
        DataModelDB model = new DataModelDB();
        FrameHospital inst_frame = new FrameHospital();
        inst_connect.getConnection();
        model.getOwners(1);
        model.getHospital(1);
        inst_frame.setVisible(true);        

//        DataModelDB model = new DataModelDB();
//        Principal frame = new Principal();
//        model.getPets(0);
//        frame.setVisible(true);
    }
    
}
