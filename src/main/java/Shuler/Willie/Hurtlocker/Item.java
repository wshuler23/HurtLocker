package Shuler.Willie.Hurtlocker;

import java.util.ArrayList;

/**
 * Created by willieshuler on 10/17/16.
 */
public class Item {

    private String name;
    private ArrayList <Price> price = new ArrayList<Price>();


    public Item(String name, double price) {
        this.name = name;
        this.getPrice().add(new Price(price));
    }

    public void addPrice(double price){getPrice().add(new Price(price));}

    public int totalOfItems(){

        int total = 0;

        for(Price price : getPrice()){ total += price.getQuantity();}

        return total;
    }

    public ArrayList<Price> getPrice() {return price;}

    public String getName() {return name;}
}