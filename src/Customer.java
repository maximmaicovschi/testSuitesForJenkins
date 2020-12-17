import java.util.List;

public class Customer {
    public int id;
    public List<Product> shoppingCart;

    public Customer(int id, List<Product> shoppingCart) {
        this.id = id;
        this.shoppingCart = shoppingCart;
    }

    public double getTotalPrice() {
        double total = 0;
        for(Product p : shoppingCart) {
            total = total + p.getPrice() - p.getTax();
        }
        return total;
    }

}
