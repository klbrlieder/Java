

public class numberreverser {
    public static int reverseNumber(int a) {
        int number = 0;
        while(true) {
            int digit = a % 10;
            number = (number * 10) + digit;
            a = a / 10;
            if(a==0){
                break;
            }
        }
        return number;

    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(1234));
    }
}
