//https://github.com/klbrlieder

public class Scenario00 {

    public static long factorial(int a) {
        if (a == 0) {
            return 1;
        }
        return a * factorial(a-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));

    }
}
