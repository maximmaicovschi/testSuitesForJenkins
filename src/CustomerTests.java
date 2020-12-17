import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomerTests {

    List<Product> shoppingCart = new ArrayList<>();
    Customer customer;

    @Before
    public void setUp() {
        shoppingCart.add(new Product(1, "Iphone 12", 1800,1));
        shoppingCart.add(new Product(2, "Iphone 11", 1100,1));
        customer = new Customer(1, shoppingCart);
    }

    @Test
    public void test_right_values_when_applying_tax() {
        Assert.assertEquals(2349.0, customer.getTotalPrice(), 0.0);
    }
}
