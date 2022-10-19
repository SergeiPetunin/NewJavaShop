/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author spetu
 */
public class Purchase {
    
    private Salesman salesman;
    private Buyer buyer;
    private Product[] products;
    private Date purchaseDate;

    public Purchase() {
        products = new Product[0];
    }

    public Purchase(Salesman salesman, Buyer buyer, Product[] products, Date purchaseDate) {
        this.salesman = salesman;
        this.buyer = buyer;
        this.products = products;
        this.purchaseDate = purchaseDate;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Purchase{" 
                + "salesman=" + salesman 
                + ", buyer=" + buyer 
                + ", products=" + products 
                + ", purchaseDate=" + purchaseDate 
                + '}';
    }
    
    
    
}
