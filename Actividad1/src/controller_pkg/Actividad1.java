/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_pkg;

import model_pkg.ModelDatosDB;
import model_pkg.Pool;
import view_pkg.Principal;

/**
 *
 * @author Daniel Fajardo
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDatosDB newPool = new ModelDatosDB();
        Principal newFrame = new Principal();
        newPool.getProducts(0);
        newFrame.setVisible(true);
        
    }
    
}
