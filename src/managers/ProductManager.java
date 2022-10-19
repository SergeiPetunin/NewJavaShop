/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Product;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author spetu
 */
public class ProductManager {
    private final Scanner scanner;

    public ProductManager() {
        scanner = new Scanner(System.in);
    }
    
    
    public Product createProduct() {
        Product product = new Product();
        System.out.println("Введите название продукта: ");
        product.setProductName(scanner.nextLine());
        System.out.println("Введите цену: ");
        product.setPrice(scanner.nextLine());
        System.out.println("Введите количество: ");
        product.setCountItem(scanner.nextInt());scanner.nextLine();
        
        return product;
    }
    
    
    
    public void printListProducts(Product[] products) {
        for(int i  = 0; i < products.length; i++) {
            System.out.printf("%d. Товар: %s Цена: %s Количество: %s%n"
                    ,i+1
                    ,products[i].getProductName()
                    ,products[i].getPrice()
                    ,products[i].getCountItem()
                    
            );
        }
    }
    
}
