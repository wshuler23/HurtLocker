package Shuler.Willie.Hurtlocker;

/**
 * Created by willieshuler on 10/17/16.
 */
public class Price {

    private double price;
    private int quantity;

    public Price(double price) {
        this.price = price;
        count();
    }

    public double getPrice() {return price;}

    public int getQuantity() {return quantity;}

    public void count(){this.quantity++;}
}