import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductTests {

    Product product;

    @Before
    public void setUp() {
        product = new Product(1, "Iphone 12", 1800,1);
    }

    @Test
    public void test_right_values_when_applying_tax() {
        double expectedTax = product.getPrice() * 0.19;
        Assert.assertEquals(expectedTax, product.getTotalTax(), 0.0);
    }
}
