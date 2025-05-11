
package com.mycompany.employeesoop;

import com.mycompany.employeesoop.e.Employee;


public class Manager extends Employee{
    private int teamSize;

    public Manager() {
    }

    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }

    public Manager(int teamSize, String name, int id, int salary) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void getAllDetails() {
        super.getAllDetails(); 
        System.out.println("Team Size: "+teamSize);
    }
    


    
}
