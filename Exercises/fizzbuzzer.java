
public class fizzbuzzer {
    public static String fizzBuzz(int n) {
        String result = "";
        for(int i=1;i<=n;i++) {
            if(i%3==0 && i%5==0) {
                result += "FizzBuzz ";
                break;
            }
            if(i%3==0) {
                result = result +  "Fizz ";
            }
            if(i%5==0) {
                result = result +  "Buzz ";
            }
            else {
                result = result + ""+i+" ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

}
