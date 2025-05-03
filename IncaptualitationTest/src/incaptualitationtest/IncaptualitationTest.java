package incaptualitationtest;

import incaptualitationtest.food.Food;
import incaptualitationtest.food.Fruits;
import incaptualitationtest.food.bread.Bread;

public class IncaptualitationTest {

    public static void main(String[] args) {

        Food f = new Food();

        f.setWight(6);
        f.getWight();
        f.setTest("Sweet");
        System.out.println(f.getResult());

        Bread b = new Bread("Soft", "Sweet", 5, "B");
        System.out.println(b.toString());

//        Fruits u = new Fruits("BAN", "good", "jfui", "Mix", 5, "c");
//
//        System.out.println(b);
//        System.out.println(u);

    }

}
