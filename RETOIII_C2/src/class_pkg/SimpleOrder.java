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
public class SimpleOrder extends Order {

    private int idOrder;
    private static int count;

    public SimpleOrder() {
        count++;
        this.idOrder = count;

    }

    public SimpleOrder(Date date, Client client, Account account, boolean paid, boolean accepted) {
        super(date, client, account, paid, accepted);
        count++;
        this.idOrder = count;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }
    
    

    public double getTotal() {
        double result = 0;
        for (ProductLine lines : this.getLines()) {
            result += lines.getSubtotal();
        }
        return result;
    }

    public int getTotalProductos() {
        int result = 0;
        for (ProductLine lines : this.getLines()) {
            result += lines.getQuantity();
        }
        return result;
    }
}
