/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person_pkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Fajardo
 */
public class ClientClass extends PersonClass {
    private int telephone;
    private String address;
    private static Scanner insDatos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_BLUE = "\u001B[34m";

    public ClientClass() {
    }
       
    public ClientClass(int id, String name, String email, int telephone, String address) {
        super(id, name, email);
        this. telephone = telephone;
        this. address = address;
        
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
       
}
