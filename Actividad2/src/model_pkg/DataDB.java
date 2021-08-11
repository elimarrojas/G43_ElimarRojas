/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

/**
 *
 * @author Daniel Fajardo
 */
public class DataDB {
    //Información clínica
    private int idHospital;
    private String hospital;
    private String address;
        
    //Información mascota
    private int idPet;
    private String name;
    private int code;
    private String breed;

    public DataDB() {
        //Inicializar las variables de la clase en 0 si es int y vacías si son String
        this.idHospital = 0;
        this.hospital = "";
        this.address = "";
        
        this.idPet = 0;
        this.name = "";
        this.code = 0;
        this.breed = "";
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

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }  
       
}
