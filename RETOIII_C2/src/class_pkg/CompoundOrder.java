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
public class CompoundOrder extends Order{
    private int idOrder;    
    private static int count;    
    private ArrayList<SimpleOrder> ordersS;
    

    public CompoundOrder() {
        count++;
        this.idOrder = count;
        this.ordersS = new ArrayList<>();
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }   

    public ArrayList<SimpleOrder> getOrdersS() {
        return ordersS;
    }

    public void setOrdersS(ArrayList<SimpleOrder> ordersS) {
        this.ordersS = ordersS;
    }    
    
    public double getTotal(){
        double result = 0;
        for(SimpleOrder simple : ordersS){
            result += simple.getTotal();
        }
        return result;
    }    
        
}
