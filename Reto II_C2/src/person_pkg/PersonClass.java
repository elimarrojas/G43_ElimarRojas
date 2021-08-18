/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person_pkg;

/**
 *
 * @author Daniel Fajardo
 */
public class PersonClass {
    //Declaración de variables con visibilidad private
    private int id;
    private String name;
    private String email;
    
    //Añadir constructor de la clase vacío

    public PersonClass() {
    }
    
    //Añadir constructor de la clase con todos los parámetros

    public PersonClass(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
       
    //Añadir Getter y Setter

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    
        
}
