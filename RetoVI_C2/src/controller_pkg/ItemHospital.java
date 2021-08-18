/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_pkg;

/**
 *
 * @author Daniel Fajardo
 */
public class ItemHospital {
    private int idHospital;
    private String hospital;

    public ItemHospital(int idHospital, String hospital) {
        this.idHospital = idHospital;
        this.hospital = hospital;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    @Override
    public String toString(){
        return getHospital();
    }
    
}
