/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

import java.util.ArrayList;

/**
 *
 * @author Daniel Fajardo
 */
public class Client {
    
    private int idClient;
    private String name;
    private String address;
    private String phone;
    private String email;
    private static int count;
    
    private ArrayList<Account> accounts;

    public Client() {
        count++;
        this.idClient = count;
        this.accounts = new ArrayList<>();
    }

    public Client(String name, String address, String phone, String email) {
        count++;
        this.idClient = count;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public int getIdClient() {
        return idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "[" + this.idClient + "] - " + this.name;
    }
    
    
    
    
}
