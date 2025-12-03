public class Robot {
    private String modelName;
    private int batteryLevel;
    private String status;
    public Robot(String name, int battery, String activeStatus) {
        modelName = name;
        batteryLevel = battery;
        status = activeStatus;
    }

    public String getModelName() {
        return modelName;
    }
    public int getBatteryLevel() {
        return batteryLevel;
    }
    public String getStatus() {
        return status;
    }
    public String setModelName(String name) {
        return modelName = name;
    }
    public int setBattery(int n) {
        return batteryLevel = n;
    }
    public String setStatus(String a) {
        return status = a;
    }
    public void displayRobotInfo() {
        System.out.println("Model Name: "+modelName+", Battery Level: "+batteryLevel+"%, Status: "+status);
    }
    public boolean isBatteryEnough(int requiredAmount) {
        if(batteryLevel>=requiredAmount) {
            return true;
        }
        else {
            return false;
        }
    }
    public int consumeBattery(int amount) {
        return batteryLevel = batteryLevel - amount;
    }
    public int chargeBattery(int amount) {
       if(batteryLevel + amount >= 100) {
           status = "Active";
       }
       else {
           status = "Charging";
       }
       return batteryLevel = batteryLevel + amount;
    }
    public void performTask(Task t) {
        System.out.println("Attempting task: "+t.getTaskName());
        if(status == "Charging") {
            System.out.println("Failed task because of charging! ");
        }
        else if(isBatteryEnough(t.getEnergyCost())) {
            consumeBattery(t.getEnergyCost());
            System.out.println("Successfully completed task: "+t.getTaskName());
        }
        else {
            System.out.println("Failed task because of unsufficient battery level!");
        }
    }
    public void performTaskBatch(TaskBatch batch) {
        if(batch.getTaskCount()<1) {
            System.out.println("No tasks in the batch! ");
        }
        else {
            int totalcost = batch.getTotalEnergyCost();
            if(batteryLevel<totalcost) {
                System.out.println("Not enough energy!");
            }
            else if(batteryLevel>totalcost) {
                System.out.println("Robot is processing the batch!");
                for(int i=0;i<batch.getTaskCount();i++) {
                    Task[] fullbatch = batch.getTasks();
                    performTask(fullbatch[i]);
                }
                displayRobotInfo();
            }
        }
    }

}
