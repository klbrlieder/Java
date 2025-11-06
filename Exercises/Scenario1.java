

public class Scenario1 {
    public static int[] increase(int[] current, int larger) {
        int[] newroster = new int[larger];
        for(int i=0;i<current.length;i++) {
            newroster[i] = current[i];
        }
        return newroster;


    }

    public static void main(String[] args) {
        int[] roster = new int[20];
        for(int i=0;i<20;i++) {
            roster[i] = 1000 + i;
        }
        for(int i=0;i<roster.length;i++) {
            System.out.println(roster[i]);
        }
        System.out.println("Now the new roster:");
        int[] nextroster = increase(roster, 42);
        for(int i=0;i<nextroster.length;i++) {
            System.out.println(nextroster[i]);
        }


    }
}
