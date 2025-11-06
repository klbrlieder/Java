import java.util.Random;

public class Scenario4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[30];
        int count=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = r.nextInt(100);
        }
        int peak=0;
        int max = peak;
        for(int i=0;i<arr.length;i++) {
            if(i==0 || i==arr.length-1) {
                continue;
            }
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                peak = arr[i];
                System.out.println("Peak at:" +peak);
                count = count+1;
                if (peak>max) {
                    max = peak;
                }

            }

        }
        System.out.println("max:" +max);
    }


}
