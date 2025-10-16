import java.util.Random;
import java.util.Scanner;

public class operator {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        Scanner sc = new Scanner(System.in);
        int a = randomGenerator.nextInt(1000);

        int b = randomGenerator.nextInt(1000);

        System.out.println("A: "+a+" and B: "+b);

        System.out.println("Please select your operation: \n 1 for summation \n 2 for difference \n 3 for product \n 4 for division result");
        int operator = sc.nextInt();
        switch (operator) {
            case 1:
                int c = a + b;
                System.out.println("Your result is "+c);
            case 2:
                int d = a - b;
                System.out.println("Your result is "+d);
            case 3:
                int e = a * b;
                System.out.println("Your result is "+e);
            case 4:
                if (b == 0) {
                    System.out.println("DIVISION BY ZERO ERROR");
                }
                else {
                    int f = a / b;
                    System.out.println("Your integer division result is "+f);
                    float g = (float) a / b;
                    System.out.println("Your float division result is "+g);
                }

            default:
                System.out.println("Invalid input");
        }


    }
}

