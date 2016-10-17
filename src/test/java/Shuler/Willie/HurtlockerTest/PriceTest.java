package Shuler.Willie.HurtlockerTest;

import Shuler.Willie.Hurtlocker.Price;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by willieshuler on 10/17/16.
 */
public class PriceTest {

    @Test
    public void countTest(){

        double dogFoodPrice = 10.50;
        Price price = new Price(dogFoodPrice);
        price.count();
        price.count();

        int expectedValue = 3;

        int actualValue = price.getQuantity();

        Assert.assertEquals("The answer should be two", expectedValue, actualValue);
    }
}
