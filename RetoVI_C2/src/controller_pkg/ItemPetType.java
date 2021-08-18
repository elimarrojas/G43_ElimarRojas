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
public class ItemPetType {
    private int idPetType;
    private String petType;

    public ItemPetType(int idPetType, String petType) {
        this.idPetType = idPetType;
        this.petType = petType;
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

    @Override
    public String toString() {
        return getPetType();
    }
    
    
    
}
