import java.util.Scanner;

public class FactoryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Robot r1 = new Robot("Omnissiah", 98, "active");
        Robot r2 = new Robot("euler", 32, "Charging");

        r1.displayRobotInfo();
        r2.displayRobotInfo();

        System.out.println("How much battery would you like to consume?");
        int consumed = sc.nextInt();
        r1.consumeBattery(consumed);
        r1.displayRobotInfo();
        r1.chargeBattery(1);
        r1.displayRobotInfo();

        //operation succeeds, but the charge goes negative which it shouldnt so we have to write a try except line

        Task t1 = new Task("Walking", 1);
        Task t2 = new Task("Running", 2);
        Task t3 = new Task("Carrying", 3);
        r1.performTask(t2);
        r1.displayRobotInfo();

        TaskBatch tb = new TaskBatch();
        tb.addTask(t1);
        tb.addTask(t2);
        tb.addTask(t3);
        tb.printBatchInfo();
        r1.chargeBattery(100-r1.getBatteryLevel());
        System.out.println("total energy cost: "+tb.getTotalEnergyCost()+"%");
        r1.performTaskBatch(tb);

    }
}
