import java.util.Scanner;


public class numericalmazefinal {

    public static boolean prime(int a) {
        if(a<2) {
            return false;
        }

        for(int i = 2;i < a;i++) {
            if(a % i == 0) {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = -1;
        int end = -1;

        System.out.println("Please enter your start value: ");
        start = sc.nextInt();

        System.out.println("Please enter your end value: ");
        end = sc.nextInt();
        String result = "";
        int step = 0;
        int n = start;
        while(true) {
            if(n==end) {
                System.out.println("You've reached the end!");
                break;
            }
            if(step>1000) {
                System.out.println("Infinite loop detected!");
                break;
            }
            if(n%2==0) {
                result = "even, n / 2";
                n = n / 2;
            }
            else if(n%3==0) {
                result = "divisible by 3, n + 4";
                n = n + 4;
            }
            else if(prime(n)==true) {
                result = "prime, n * 2";
                n = n * 2;
            }
            else {
                result = "no conditions apply";
                n = n + 1;
            }
            System.out.println("Step "+step+" --> "+n+" is "+result);
            step = step + 1;

        }


    }
}
