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
public class Item {
    private int idHospital;
    private String hospital;
    private String address;

    public Item(int idHospital, String hospital,  String address) {
        this.idHospital = idHospital;
        this.hospital = hospital;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString(){
        return getHospital();
    }
    
}
