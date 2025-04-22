package classandobjectarray.students;

public class Students {

    private String name;
    private int id;
    private String email;
    private String phn;
    private String dateOfBirth;
    private String bloodGroup;
    private String password;

    public Students() {
    }

    public Students(String name, int id, String email, String phn, String dateOfBirth, String bloodGroup, String password) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phn = phn;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public void getStudentDetailes() {

        System.out.println(
                "Name: " + this.name + "\n"
                +"ID: " + this.id + "\n"
                +"Email: " + this.email + "\n"
                +"Phone: " + this.phn + "\n"
                +"Date Of Birth: " + this.dateOfBirth + "\n"
                +"Blood Group: " + this.bloodGroup + "\n"
                +"Password: " + this.password + "\n"
       
        );

    }

}
