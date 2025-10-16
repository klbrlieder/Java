import java.util.Scanner;


public class grader_for {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.println("Please enter a negative value to exit");

        while(true) {

            int c = 0;

            System.out.println("Please enter your value: ");

            c = sc.nextInt();

            if(c<0) {
                break;
            }

            else if(b!=0) {
                a = c;
            }
            else if(b==0) {
                ;
            }

        }
        if(b+1 == a || a+1 == b) {
            System.out.println("Last 2 values entered are consecutive!!");
        }
        else {
            System.out.println("Last 2 values entered are not consecutive ");
        }

    }
}
