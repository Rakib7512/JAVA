
package com.mycompany.trypoz;

public class Shop {
    double price;
     String productName;
     double quentaty;

    public Shop() {
    }

    public Shop(double price, String productName, double quentaty) {
        this.price = price;
        this.productName = productName;
        this.quentaty = quentaty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getQuentaty() {
        return quentaty;
    }

    public void setQuentaty(double quentaty) {
        this.quentaty = quentaty;
    }
public void getPriceQuantaty(){
    System.out.println(productName+price+quentaty);
};


    }
     
     

