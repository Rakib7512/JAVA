
package com.mycompany.employeesoop.e;


public class Employee {
private String name;
private int id;
private int salary;

    public Employee() {
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
public void getAllDetails(){
    System.out.println("Name: "+name+"\nId"+id+"\nSalary"+salary);

}
    
    

}
