package Shuler.Willie.HurtlockerTest;

import Shuler.Willie.Hurtlocker.Item;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by willieshuler on 10/17/16.
 */
public class ItemTest {

    @Test
    public void addPriceTest(){
        Item item = new Item("Milk", 2.49);
        item.addPrice(3.67);
        int expectedValue = 2;
        int actualValue = item.getPrice().size();
        Assert.assertEquals("The answer should be two", expectedValue, actualValue);
    }

    @Test
    public void totalOfItemsTest(){
        Item item = new Item("Bread", 3.59);
        item.addPrice(2.75);
        item.addPrice(2.67);
        int expectedValue = 3;
        int actualValue = item.totalOfItems();
        Assert.assertEquals("The answer should be three", expectedValue, actualValue);
    }
}
