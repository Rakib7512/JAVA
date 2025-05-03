
public class Iteams {
    
    double quentaty;
    String productName;
    
    double price;
    String quality;

    public Iteams() {
    }

    public Iteams(double quentaty, String productName, double price, String quality) {
        this.quentaty = quentaty;
        this.productName = productName;
        this.price = price;
        this.quality = quality;
    }

    public double getQuentaty() {
        return quentaty;
    }

    public void setQuentaty(double quentaty) {
        this.quentaty = quentaty;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
    
}
