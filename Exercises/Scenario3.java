import java.util.Random;

public class Scenario3 {
    public static void main(String[] args) {
        Random r = new Random();
        String[] arr = new String[1000000];
        for(int i=0;i<1000000;i++) {
            int chance = r.nextInt(100);
            if (chance<40) {
                arr[i] ="Sunny";
            }
            else if(chance<70) {
                arr[i] ="Cloudy";
            }
            else if(chance<90) {
                arr[i] ="Rainy";
            }
            else {
                arr[i] ="Stormy";
            }

        }

        long countSunny = 0;
        long countCloudy = 0;
        long countRainy = 0;
        long countStormy = 0;


        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("Sunny")) {
                countSunny = countSunny+1;
            }
            else if(arr[i].equals("Cloudy")) {
                countCloudy = countCloudy+1;
            }
            else if(arr[i].equals("Rainy")) {
                countRainy = countRainy+1;
            }
            else if(arr[i].equals("Stormy")) {
                countStormy = countStormy+1;
            }
        }
        float probabilitySunny = ((float)countSunny * 100) / arr.length;
        float probabilityCloudy = ((float)countCloudy * 100) / arr.length;
        float probabilityRainy = ((float)countRainy * 100) / arr.length;
        float probabilityStormy = ((float)countStormy * 100) / arr.length;
        System.out.printf("Probability of sunny weather is: %.2f \n",probabilitySunny);
        System.out.printf("Probability of cloudy weather is: %.2f \n",probabilityCloudy);
        System.out.printf("Probability of rainy weather is: %.2f \n",probabilityRainy);
        System.out.printf("Probability of stormy weather is: %.2f \n",probabilityStormy);




    }


}
