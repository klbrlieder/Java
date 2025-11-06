


public class Scenario0 {
    public static void main(String[] args) {
        int[] myArr = {4, 8, 15, 16, 23, 42};

        System.out.println(myArr.length);

        System.out.println(myArr[1]);

        int last = myArr.length - 1;
        System.out.println(myArr[last]);

        System.out.println(myArr[2]);

        System.out.println(myArr[3]);

        // System.out.println(myArr[10]);
        // out of boundries error, since array doesnt contain 11th element, code cannot reach it and gives error.
    }



}
