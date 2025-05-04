package studentsclass.tclass;


public class Students extends PersonalClass{
    
   private int studentId;

    public Students() {
    }

    public Students(int studentId) {
        this.studentId = studentId;
    }

    public Students(int studentId, String name, double age) {
        super(name, age);
        this.studentId = studentId;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void getStudentDetials() {
        super.getStudentDetials();
        System.out.println("ID: " + studentId);
    }

    
    
    
   
}
