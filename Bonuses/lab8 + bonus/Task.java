public class Task {
    private String taskName;
    private int energyCost;

    public Task(String name, int energy) {
        taskName = name;
        energyCost = energy;
    }
    public String getTaskName() {
        return taskName;
    }
    public int getEnergyCost() {
        return energyCost;
    }
    public String setTaskName(String name) {
        return taskName = name;
    }
    public int setEnergyCost(int cost) {
        return energyCost = cost;
    }
    public void describeTask() {
        System.out.println("Task name: "+taskName+" Energy cost: "+energyCost+"%");
    }
}
