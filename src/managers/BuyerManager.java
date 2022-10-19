/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Buyer;
import entity.Product;
import entity.Purchase;
import entity.Salesman;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;


/**
 *
 * @author spetu
 */
public class BuyerManager {
    private final Scanner scanner;
    private SalesmanManager sm;
    private ProductManager pm;

    public BuyerManager() {
        scanner = new Scanner(System.in);
        sm = new SalesmanManager();
        pm = new ProductManager();
    }
    
    public Purchase createPurchase(Salesman[] salesmans, Buyer[] buyers, Product[] products) {
        
        boolean buy = true;
        Purchase purchase = new Purchase();
        
        System.out.println("Список продавцов");
        sm.printListSalesmans(salesmans);
        System.out.println("Выберете номер продавца из списка");
        int numberSalesman = scanner.nextInt(); scanner.nextLine();
        
        printListBuyers(buyers);
        System.out.println("Выберете номер покупателя из списка");   
        int numberBuyer = scanner.nextInt(); scanner.nextLine();
        int numberProduct;
        Product[] newProducts = new Product[0];
        while(buy){
            System.out.println("Выберете номер товара из списка");
            pm.printListProducts(products);
            numberProduct = scanner.nextInt(); scanner.nextLine();
            Product[] newProducts1 = Arrays.copyOf(newProducts, newProducts.length+1);
            newProducts1[newProducts1.length-1] = products[numberProduct-1];
            newProducts = newProducts1;
            
            System.out.println("Хотите закончить?");
            String task = scanner.nextLine();
            if("y".equals(task)){
                buy = false;
            }   
        }
        
        purchase.setSalesman(salesmans[numberSalesman-1]);
        purchase.setBuyer(buyers[numberBuyer-1]);
        purchase.setProducts(newProducts);
        purchase.setPurchaseDate(new GregorianCalendar().getTime());
        
        return purchase;
    }
    
    public void printListPurchases(Purchase[] purchases) {
        for(int i  = 0; i < purchases.length; i++) {
            System.out.printf("%d. Имя: %s  Должность: %s%n"
                    ,i+1
                    ,purchases[i].getSalesman()
                    ,purchases[i].getBuyer()
                    
            );
            for (int j = 0; j < purchases[i].getProducts().length; j++) {
                System.out.printf("%d Продукты: %s %s %s%n"
                        ,j+1
                        ,purchases[i].getProducts()[j].getProductName()
                        ,purchases[i].getProducts()[j].getPrice()
                        ,purchases[i].getProducts()[j].getCountItem()
                        );
            }
        }
    }
    
    
    
    public Buyer createBuyer() {
        Buyer buyer = new Buyer();
        System.out.println("Введите имя покупателя: ");
        buyer.setName(scanner.nextLine());
        System.out.println("Введите адрес: ");
        buyer.setAddress(scanner.nextLine());
        System.out.println("Введите номер телефона: ");
        buyer.setPhone(scanner.nextLine());
        
        return buyer;
    }
    
    public void printListBuyers(Buyer[] buyers) {
        for(int i  = 0; i < buyers.length; i++) {
            System.out.printf("%d. Имя: %s Адрес: %s Телефон: %s%n"
                    ,i+1
                    ,buyers[i].getName()
                    ,buyers[i].getAddress()
                    ,buyers[i].getPhone()
                    
            );
        }
    }
    
}
