import java.util.Random;

public class randomTime {
    public static void main(String[] args) {
        Random rng = new Random();

        int hour = rng.nextInt(25);

        int minute = rng.nextInt(60);


        System.out.println("Its "+hour+":"+minute);

        if (hour > minute) {
            System.out.println("Hour is greater than minute");
        }
        else if (hour < minute) {
            System.out.println("Minute is greater than hour");
        }
        else if (hour == minute) {
            System.out.println("Hour equals to minute");
        }
    }
}
