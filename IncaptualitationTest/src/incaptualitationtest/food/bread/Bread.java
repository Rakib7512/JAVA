
package incaptualitationtest.food.bread;

import incaptualitationtest.food.Food;


public class Bread extends Food{
    private String type;

    public Bread() {
    }

    public Bread(String type) {
        this.type = type;
    }

    public Bread(String type, String test, int wight, String catagory) {
        super(test, wight, catagory);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bread{" + "type=" + type + ", test=" + test + ", wight=" + wight + ", catagory=" + catagory + '}';
    }
    
    

    
    

    
    
    
}
