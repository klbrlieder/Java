// github.com/klbrlieder

public class Product {
    private String name;
    private int stock;
    public Product(String firstName, int firstStock) {
        name = firstName;
        stock = firstStock;
    }
    public int buyOne() {
        if(stock > 0) {
            return stock = stock - 1;
        }
        else {
            System.out.println("Out of stock!");
            return stock;
        }
    }
    public void printInfo() {
        System.out.println("Product Name: "+name+"\nRemaining stock: "+stock);
    }
    public String getName() {
        return name;
    }
}
