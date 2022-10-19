/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Salesman;

/**
 *
 * @author spetu
 */
public class SalesmanManager {
    
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
