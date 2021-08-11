/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import view_pkg.Principal;

/**
 *
 * @author Daniel Fajardo
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataModelDB model = new DataModelDB();
        Principal frame = new Principal();
        model.getPets(0);
        frame.setVisible(true);
    }
    
}
