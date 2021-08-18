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
public class ItemBreed {
    private int idBreed;
    private String breed;

    public ItemBreed(int idBreed, String breed) {
        this.idBreed = idBreed;
        this.breed = breed;
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
    
    @Override
    public String toString(){
        return getBreed();
    }
    
}
