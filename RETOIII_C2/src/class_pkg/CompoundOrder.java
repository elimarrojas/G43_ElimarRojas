/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Daniel Fajardo
 */
public class CompoundOrder extends Order{
    private int id;
    private static int count;
    private ArrayList<Order> ordersC;
    

    public CompoundOrder() {
    }

    public CompoundOrder(Date date, Client client, Account account, boolean paid, boolean accepted) {
        super(date, client, account, paid, accepted);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CompoundOrder.count = count;
    }

    public ArrayList<Order> getOrdersC() {
        return ordersC;
    }

    public void setOrdersC(ArrayList<Order> ordersC) {
        this.ordersC = ordersC;
    }    
        
}
