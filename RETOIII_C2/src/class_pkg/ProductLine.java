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
public class ProductLine {
    private int id;
    private Product product;
    private int quantity;
    private static int count;

    public ProductLine() {
        count++;
        this.id = count;
    }

    public ProductLine(Product product, int quantity) {
        count++;
        this.id = count;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getSubtotal(){
        return (this.quantity * this.product.getPrice());
    }    
    
    
}
