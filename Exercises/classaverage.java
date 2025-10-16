import java.util.Scanner;

public class classaverage {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        int loop = 0;
        System.out.println("Enter -1 to quit");

        while(true) {

            int grade = 0;


            System.out.println("Please enter the grade of student: ");
            grade = sc.nextInt();
            sum = sum + grade;
            num++;
            loop++;
            if (loop >= 10 || grade == -1) {
                break;
            }
        }

        System.out.println("Your class average is: "+(float)sum / (float)num);
    }
}
