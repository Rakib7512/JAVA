
package com.mycompany.learnmap;

public class StudentDetails {
    int id;
    String name;
    String subject;
    String email;

    public StudentDetails() {
    }

    public StudentDetails(int id, String name, String subject, String email) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentDetails: " +"\nid= " + id 
                + ",\nname= " 
                + name 
                + ",\nsubject= " 
                + subject 
                + ",\nemail= " 
                + email 
                + '}';
    }
    
    
}
