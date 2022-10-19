/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author spetu
 */
public class Salesman {
    
    private String name;
    private String jobTitle;
    
    public Salesman() {
    }

    public Salesman(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Salesman{" + "name=" + name + ", jobTitle=" + jobTitle + '}';
    }
    
}
