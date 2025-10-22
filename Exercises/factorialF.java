


public class factorialF {

    public static double factorial(int n) {

        double result = 1;
        for(int j=1;j<=n;j++){
            result = result * j;

        }
        return result;


    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}
