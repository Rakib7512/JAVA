package usurnameandpasswordmatching;

import java.util.Scanner;

public class UsurNameAndPasswordMatching {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Name");
        
        String userName = s.next();

//        System.out.println("Enter password");
//        int password=s.nextInt();
        String[] names = {"Rakib", "Parvez", "Eiasin"};

        int[] passwords = {123, 234, 345};

        for (int i = 0; i < names.length; i++) {

            if (userName.equalsIgnoreCase(names[i])) {
                System.out.println(" Enter password");
                int userPassword=s.nextInt();
                
                
                if(userPassword==passwords[i]){
                
                    System.out.println(" Welcome ");
                }

            }
            
            else{System.out.println(" password Wrong")};

        }

    }

}
