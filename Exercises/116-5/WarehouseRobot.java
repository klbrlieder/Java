public class WarehouseRobot {
    private String robotID;
    private double internalTemp;

    public double getInternalTemp() {
        return internalTemp;
    }

    public String getRobotID() {
        return robotID;
    }

    public WarehouseRobot(String ID, double temp){
        robotID = ID;
        internalTemp = temp;
    }
    public void performTask() {
        System.out.println("Robot: "+robotID+" Performing task!");
    }
    public void checkStatus() {
        System.out.println("Current temperature: "+internalTemp);
    }

}
