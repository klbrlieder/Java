public class CoolingRobot extends WarehouseRobot {
    private int coolantLevel;

    public CoolingRobot(String ID, double temp, int lvl) {
        super(ID, temp);
        coolantLevel = lvl;
    }
    @Override
    public void performTask() {
        super.performTask();
        System.out.println("Activating cooling fans. Coolant level at: "+coolantLevel+"%");
    }
    @Override
    public void checkStatus() {
        super.checkStatus();
        if(coolantLevel<20){
            System.out.println("Warning: low coolant!: "+coolantLevel);
        }
    }
}
