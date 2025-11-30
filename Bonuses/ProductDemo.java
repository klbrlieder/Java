import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many products does the store have?:");
        int amount = sc.nextInt();

        Product[] productArr = new Product[amount];
        for(int i = 0;i<productArr.length;i++) {
            System.out.println("What is the name of product #"+(i+1)+" ?:");
            String name = sc.next();
            System.out.println("What is the stock of the product?");
            int stock = sc.nextInt();
            productArr[i] = new Product(name, stock);
        }
        while(true) {
            System.out.println("Please enter the product you want to buy stocks from: (press Q to exit)");
            String productName = sc.next();
            if(productName.equals("Q")) {
                System.out.println("Exiting...");
                for(int i=0;i<productArr.length;i++) {
                    Product prd = productArr[i];
                    prd.printInfo();
                }
                break;
            }
            boolean contains = false;
            for(Product prod : productArr) {
                if(prod.getName().equals(productName)) {
                    prod.buyOne();
                    contains = true;
                    break;
                }

            }
            if(contains == false) {
                System.out.println("No such product!");

            }

        }
    }
}
