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
public class Account {
    private int numberA;
    private double balance;
    private int tdc;

    public Account() {
    }

    public Account(int numberA, double balance, int tdc) {
        this.numberA = numberA;
        this.balance = balance;
        this.tdc = tdc;
    }

    public int getNumberA() {
        return numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTdc() {
        return tdc;
    }

    public void setTdc(int tdc) {
        this.tdc = tdc;
    }
    
    @Override
    public String toString(){
        return this.numberA+"";
    }
    
}
