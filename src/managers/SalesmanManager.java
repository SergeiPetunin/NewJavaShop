/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Salesman;
import java.util.Scanner;

/**
 *
 * @author spetu
 */
public class SalesmanManager {
    private final Scanner scanner;

    public SalesmanManager() {
        scanner = new Scanner(System.in);
    }
    
    public Salesman createSalesman() {
        Salesman salesman = new Salesman();
        System.out.println("Введите имя продавца: ");
        salesman.setName(scanner.nextLine());
        System.out.println("Введите долность: ");
        salesman.setJobTitle(scanner.nextLine());
        
        return salesman;
    }
    
    public void printListSalesmans(Salesman[] salesmans) {
        for(int i  = 0; i < salesmans.length; i++) {
            System.out.printf("%d. Имя: %s  Должность: %s%n"
                    ,i+1
                    ,salesmans[i].getName()
                    ,salesmans[i].getJobTitle()       
            );
        }
    }

}
