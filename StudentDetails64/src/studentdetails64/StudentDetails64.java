package studentdetails64;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDetails64 {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int key = s.nextInt();
            Map<Integer, BasicDetails> stuList = new HashMap<>();
            stuList.put(1287039, new BasicDetails("Md. Atiqul Islam", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        stuList.put(1287046, new BasicDetails("Halima Akter", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        stuList.put(1287271, new BasicDetails("Atiqur Rahman", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        stuList.put(1287283, new BasicDetails("Md. Arifur Rahman", "JEE", "CCSL", "Emran Hossain", "Withdrawn","0178569858"));
        stuList.put(1287315, new BasicDetails("Sathe Khanom", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        stuList.put(1287462, new BasicDetails("Abdullah Al Masud", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        stuList.put(1287470, new BasicDetails("Eiasin Prodhan", "JEE", "CCSL", "Emran Hossain", "Running","01888118271"));
        stuList.put(1287519, new BasicDetails("Md. Rahmatullah", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        stuList.put(1287528, new BasicDetails("Md. Rahim Khan", "JEE", "CCSL", "Emran Hossain", "Running","01777051706"));
        stuList.put(1287647, new BasicDetails("Md. Sadiar Rahman", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        stuList.put(1287675, new BasicDetails("Md. Rakib Islam", "JEE", "CCSL", "Emran Hossain", "Running","01568086569"));
        stuList.put(1287748, new BasicDetails("Samim Junayet Istiaq", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        stuList.put(1287759, new BasicDetails("Rejaul Karim", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        stuList.put(1287799, new BasicDetails("Md. Parvej Hossen", "JEE", "CCSL", "Emran Hossain", "Running","01906600275"));
        stuList.put(1287829, new BasicDetails("Md. Imran Mia", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
            System.out.println(stuList.get(key).toString());
        } catch (Exception e) {
            System.out.println("Data Can't Found");
        }
    }

}
