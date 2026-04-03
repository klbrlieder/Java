public class WarehouseDemo {
    public static void main(String[] args) {
        WarehouseRobot w1 = new WarehouseRobot("Bay Robot",24.63);
        CoolingRobot c1 = new CoolingRobot("Mr White", 21.61,19);

        w1.performTask();
        w1.checkStatus();

        c1.performTask();
        c1.checkStatus();
    }
}
