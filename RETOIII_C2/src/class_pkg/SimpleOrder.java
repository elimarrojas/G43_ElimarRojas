/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

import java.util.Date;

/**
 *
 * @author Daniel Fajardo
 */
public class SimpleOrder extends Order{
    private int id;
    private static int count;

    public SimpleOrder() {
        count++;
        this.id = count;
    }    

    public SimpleOrder(Date date, Client client, Account account, boolean paid, boolean accepted) {
        super(date, client, account, paid, accepted);
        count++;
        this.id = count;
    }

    public int getId() {
        return id;
    }
    
    public double getTotal(){
        double result = 0;
        for (ProductLine productLine : this.getL) {
            result += productLine.getSubtotal();
        }
        return result;
    } 
    
    public int getTotalProductos(){
        int result = 0;
        for (ProductLine productLine : this.getProductLine()) {
            result += productLine.getQuantity();
        }
        return result;
    }    
}
