/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person_pkg;

import company_pkg.JobPositionClass;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Daniel Fajardo
 */
public class EmployeeClass extends PersonClass {
    private long salary = 1000000;
    
    public EmployeeClass() {
    }
          
    public EmployeeClass(int id, String name, String email) {
        super(id, name, email);              
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
        }       
    
                  
        
               
   
   


