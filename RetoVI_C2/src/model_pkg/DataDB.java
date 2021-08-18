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
    private int idOwner;
    private String owner;
    private int idHospital;
    private String hospital;
    private int idPetType;
    private String petType;
    private int idBreed;
    private String breed;
    
    public DataDB() {
        this.idOwner = 0;
        this.owner = "";
        this.idHospital = 0;
        this.hospital = "";
        this.idPetType = 0;
        this.petType = "";
        this.idBreed = 0;
        this.breed = "";
    }
    
    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public int getIdPetType() {
        return idPetType;
    }

    public void setIdPetType(int idPetType) {
        this.idPetType = idPetType;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getIdBreed() {
        return idBreed;
    }

    public void setIdBreed(int idBreed) {
        this.idBreed = idBreed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }   
       
}
