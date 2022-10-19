/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjavashop;

import entity.Buyer;
import entity.Product;
import entity.Purchase;
import entity.Salesman;
import java.util.Arrays;
import java.util.Scanner;
import managers.BuyerManager;
import managers.ProductManager;
import managers.SalesmanManager;

/**
 *
 * @author spetu
 */
public class App {
    private final Scanner scanner;
    private final ProductManager pm;
    private final BuyerManager bm;
    private final SalesmanManager sm;
    
    private Product[] products;
    private Buyer[] buyers;
    private Salesman[] salesmans;
    private Purchase[] purchases;
    
    public App() {
        scanner = new Scanner(System.in);
        pm = new ProductManager();
        bm = new BuyerManager();
        sm = new SalesmanManager();
        
        products = new Product[0];
        buyers = new Buyer[0];
        salesmans = new Salesman[0];
        purchases = new Purchase[0];   
        
        testProduct1();
        testProduct2();
        testBuyer();
        testSalesman();
    }
    
    public void run(){
        
        boolean repeat = true;
        
        do{
            System.out.println("Функции приложения:");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить товар" );
            System.out.println("2. Список товаров");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список покапателей");
            System.out.println("5. Создать продавца");
            System.out.println("6. Список продавов");
            System.out.println("7. Сделать покупку");
            System.out.println("8. История покупок");
            System.out.print("Выберете функцию:");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task){
                case 0:
                    repeat = false;
                    break;
                case 1:
                    addProduct(pm.createProduct());
                    break;
                case 2:
                    pm.printListProducts(products);
                    break;
                case 3:
                    addBuyers(bm.createBuyer());
                    break;
                case 4:
                    bm.printListBuyers(buyers);
                    break;
                case 5:
                    addSalesman(sm.createSalesman());
                    break;
                case 6:
                    sm.printListSalesmans(salesmans);
                    break;
                case 7:
                    addPurchases(bm.createPurchase(salesmans, buyers, products));
                case 8:
                    bm.printListPurchases(purchases);
                    break; 
                
            }
        }while(repeat);
        System.out.println("Пока!");
    }
    
    private void testProduct1() {
        Product product1 = new Product("Гребешки","10.50/кг",10);
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product1;
    }
    private void testProduct2() {
        Product product2 = new Product("Лук Рэпчаты","4.20/кг",10);
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product2;
    }
    
    private void testBuyer() {
        Buyer buyer1 = new Buyer("Алёша","Калеви 16","5656444211");
        buyers = Arrays.copyOf(buyers, buyers.length + 1);
        buyers[buyers.length - 1] = buyer1;
    }
    
    private void testSalesman() {
        Salesman salesman1 = new Salesman("Петя","Продавец");
        salesmans = Arrays.copyOf(salesmans, salesmans.length + 1);
        salesmans[salesmans.length - 1] = salesman1;
    }
    
    public void addProduct(Product product){
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
        
    }
    
    public void addBuyers(Buyer buyer) {
        buyers = Arrays.copyOf(buyers, buyers.length + 1);
        buyers[buyers.length - 1] = buyer;
    }
    
    public void addSalesman(Salesman salesman) {
        salesmans = Arrays.copyOf(salesmans, salesmans.length + 1);
        salesmans[salesmans.length - 1] = salesman;
    }
    
    private void addPurchases(Purchase purchase){
        purchases = Arrays.copyOf(purchases, purchases.length+1);
        purchases[purchases.length-1] = purchase;
    };

}
