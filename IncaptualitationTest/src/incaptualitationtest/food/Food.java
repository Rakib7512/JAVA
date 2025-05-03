package incaptualitationtest.food;

public class Food {

    public String test;
    public int wight;
    public String catagory;

    public Food() {
    }

    public Food(String test, int wight, String catagory) {
        this.test = test;
        this.wight = wight;
        this.catagory = catagory;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void getWight() {
        if (wight > 5) {
            System.out.println("Food  Quality Is Good");
        }
        else{
            System.out.println("Food Quality is Bad");
        }
    }

    public void setWight(int wight) {
        if(wight<1){
            System.out.println("Weight can't be less than 1");
        }
        else{
            this.wight = wight;
        }
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getResult() {

        String result = "Test" + test + "Wight" + wight;
        return result;

    }

    @Override
    public String toString() {
        return "Food{" + "test=" + test + ", wight=" + wight + ", catagory=" + catagory + '}';
    }

    
}
