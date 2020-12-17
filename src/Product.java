public class Product {
    public int id;
    public String productName;
    public double price;
    public double tax;
    public int productCategory;

    public Product(int id, String productName, double price, int productCategory) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.tax = price * 0.19;
        this.productCategory = productCategory;
    }

    public double getTotalTax() {
        return this.tax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(int productCategory) {
        this.productCategory = productCategory;
    }
}
