import java.util.Random;

public class Scenario2 {
    public static int[] rotate(int[] current) {
        int[] rotated = new int[current.length];
        for(int i=0;i<rotated.length;i++){
            if(i==0) {
                rotated[i] = current[current.length-1];
            }
            else {
                rotated[i] = current[i-1];
            }

        }
        return rotated;
    }
    public static void main(String[] args) {

        Random r = new Random();

        int[] arr = new int[15];
        for(int i=0;i<arr.length;i++){
            arr[i] = r.nextInt(100);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Rotate::");
        int[] roster = rotate(arr);
        for(int i=0;i<roster.length;i++) {
            System.out.println(roster[i]);
        }
    }


}
