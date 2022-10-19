/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;

/**
 *
 * @author spetu
 */
public class Product {
    
    private String productName;
    private String price;
    private int countItem;

    public Product() {
    }

    public Product(String productName, String price, int countItem) {
        this.productName = productName;
        this.price = price;
        this.countItem = countItem;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCountItem() {
        return countItem;
    }

    public void setCountItem(int countItem) {
        this.countItem = countItem;
    }

    @Override
    public String toString() {
        return "Product{" 
                + "productName=" + productName 
                + ", price=" + price + 
                ", countItem=" + countItem 
                + '}';
    }

    
    
 
}
