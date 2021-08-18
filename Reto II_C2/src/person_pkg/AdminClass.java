/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person_pkg;
import java.util.ArrayList;

/**
 *
 * @author Daniel Fajardo
 */
public class AdminClass extends EmployeeClass {
    private String category;    
    ArrayList<EmployeeClass> subordinates = new ArrayList<>();
    

    public AdminClass(int id, String name, String email, String category) {
        super(id, name, email);
        this.category = category;
        
    }
        
    public AdminClass(int id, String name, String email, EmployeeClass employee, String category) {
        super(id, name, email);
        this.category = category;        
    }    
       
    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    } 
        
}     
        
        
        
        
        





