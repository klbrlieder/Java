import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your values between 1-500! ");
        System.out.println("Please enter lenght A");
        int a = sc.nextInt();

        System.out.println("Please enter lenght B");
        int b = sc.nextInt();

        System.out.println("Please enter lenght C");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("INVALID LENGHT");
        }
        else {
            if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
                if (a == b && b == c) {
                    System.out.println("EQUILATERAL");
                }
                else if (a == b || a == c ||b == c) {
                    System.out.println("ISOSCELES");
                }
                else {
                    System.out.println("SCALENE");
                }
                int perimeter = a + b + c;
                System.out.println("Perimeter = "+perimeter);

            }
            else {
                System.out.println("NOT A TRIANGLE");
            }
        }

    }
}
