package studentsclass.tclass;

public class PersonalClass {

    private String name;
    private double age;

    public PersonalClass() {
    }

    public PersonalClass(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void getStudentDetials() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }

}
