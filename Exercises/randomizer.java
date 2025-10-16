import java.util.Random;

public class randomizer {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int a = randomGenerator.nextInt(100);

        int b = randomGenerator.nextInt(100);

        System.out.println("A: "+a+" and B: "+b);


    }

}
