import java.util.Scanner;

public class studentID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your student id: ");
        long studentid = sc.nextLong();

        if ((studentid % 2) == 0 && (studentid % 3) != 0) {
            System.out.println("Student is in ALPHA TEAM! ");
        }
        else if ((studentid % 5) == 0 || (studentid % 7) == 0) {
            System.out.println("Student is in BETA TEAM");
        }
        else if ((studentid % 9) > 5) {
            System.out.println("Student is in THETA TEAM");
        }
        else {
            System.out.println("student is SIGMA TEAM");
        }


    }
}
