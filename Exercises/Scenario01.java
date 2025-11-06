//https://github.com/klbrlieder

public class Scenario01 {
    public static long sumDigits(int n){
        if(n<10) {
            return n;
        }
        return (n%10) + sumDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(12345));
    }
}
