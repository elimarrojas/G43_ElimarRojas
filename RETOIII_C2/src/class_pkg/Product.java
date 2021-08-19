/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

/**
 *
 * @author Daniel Fajardo
 */
public class Product {
    private int code;
    private String nameP;
    private double price;
    private int stock;

    public Product() {
    }

    public Product(int code, String nameP, double price, int stock) {
        this.code = code;
        this.nameP = nameP;
        this.price = price;
        this.stock = stock;
    }  

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
    public String toString(){
        return "[" + this.code + "] - " + this.nameP;
    }   
    
}
