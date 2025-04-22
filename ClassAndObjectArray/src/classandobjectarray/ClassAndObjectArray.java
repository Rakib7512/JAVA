
package classandobjectarray;

import classandobjectarray.students.Students;
import classandobjectarray.students.mobile.Mobile;



public class ClassAndObjectArray {

    public static void main(String[] args) {
        Students s= new Students("Rakib", 2541, "huidt@gmail.com", "025541","10/12/21", "B+", "jjuf541");
        
        s.getStudentDetailes();
        
        
        Mobile k= new Mobile( 2 ,  " Java ", " fm98.5 ");
        k.getMobileDatiles();
        
    }
    
    
   
    
}
