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
public class Order {
    private int idOrder;
    private Date date;
    private Client client;
    private ArrayList<ProductLine> lines;
    private Account account;
    private boolean paid;
    private boolean accepted;
    private static int count;
    private int type;

    public Order() {
        count++;
        this.idOrder = count;
        this.lines = new ArrayList<>();
        this.paid = false;
        this.accepted = false;              
    }

    public Order(Date date, Client client, Account account, boolean paid, boolean accepted) {
        count++;
        this.idOrder = count;
        this.date = date;
        this.client = client;
        this.lines = new ArrayList<>();
        this.account = account;
        this.paid = paid;
        this.accepted = accepted;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<ProductLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<ProductLine> lines) {
        this.lines = lines;
    }       

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }       

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }       
    
}
