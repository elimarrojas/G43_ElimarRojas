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
public class Tienda {
    private ArrayList<Client> clients;
    private ArrayList<Product> products;
    private ArrayList<Order> orders;

    public Tienda() {
        this.clients = new ArrayList<>();
        this.products = new ArrayList<>();
        this.orders = new ArrayList<>();
        
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
    
    
}
