import java.util.Scanner;


public class summ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start value: ");
        int start = sc.nextInt();

        System.out.println("Enter your end value: ");
        int end = sc.nextInt();

        int sum = 0;

        for(;start<=end;start++) {
            sum = sum + start;

        }

        System.out.println("The sum equals to: "+sum );

    }

}
