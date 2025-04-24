
package incaptualitationtest.food;

import incaptualitationtest.food.bread.Bread;

public class Fruits extends Bread{
    private String country;
    private String quality;

    public Fruits() {
    }

    public Fruits(String country, String quality) {
        this.country = country;
        this.quality = quality;
    }

    public Fruits(String country, String quality, String type) {
        super(type);
        this.country = country;
        this.quality = quality;
    }

    public Fruits(String country, String quality, String type, String test, int wight, String catagory) {
        super(type, test, wight, catagory);
        this.country = country;
        this.quality = quality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
    
}
