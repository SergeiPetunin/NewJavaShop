/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Buyer;
import java.util.Scanner;


/**
 *
 * @author spetu
 */
public class BuyerManager {
    private final Scanner scanner;

    public BuyerManager() {
        scanner = new Scanner(System.in);
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
