// github.com/klbrlieder

import java.util.Random;



public class bonusScenario {
    public static void main(String[] args) {
        Random r = new Random();

        int[][] scores = new int[5][4];
        for(int i=0;i<scores.length;i++) {
            for(int j=0;j<scores[0].length;j++) {
                scores[i][j] = r.nextInt(100);
            }
        }
        System.out.println("scores table:");
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[0].length; j++) {
                System.out.print(scores[i][j] +" ");
            }
            System.out.println(" ");
        }
        System.out.println("Student averages:");
        for(int i = 0;i < scores.length; i++) {
            int sum = 0;
            int count =0;
            for(int j = 0;j <scores[0].length;j++) {
                sum = sum + scores[i][j];
                count = count + 1;
            }
            float average = (float)sum / (float)count;
            System.out.printf("average of student %d is: %.2f \n", i+1, average);
        }
        System.out.println("Quiz averages: ");
        for(int j = 0;j < scores[0].length; j++) {
            int sum = 0;
            int count = 0;
            for(int i = 0;i <scores.length;i++) {
                sum = sum + scores[i][j];
                count = count + 1;
            }
            float average = (float)sum / (float)count;
            System.out.printf("average of quiz %d is: %.2f \n", j+1, average);
        }
        int scoreMax = -1;
        int studentMax = -1;
        int quizMax = -1;
        for(int i =0;i<scores.length;i++) {
            for(int j=0;j<scores[0].length;j++) {
                if(scores[i][j]>scoreMax) {
                    scoreMax = scores[i][j];
                    studentMax = i+1;
                    quizMax = j+1;
                }
            }
        }
        System.out.println("Highest score is "+scoreMax+" from student: "+studentMax+" on quiz : "+quizMax);


    }
}
