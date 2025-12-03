public class TaskBatch {
    private Task[] tasks;
    private int taskCount;

    public TaskBatch() {
        this.tasks = new Task[5];
        taskCount = 0;
    }
    public int getTaskCount() {
        return taskCount;
    }
    public void addTask(Task t) {
        int i = taskCount;
        if(taskCount>5) {
            System.out.println("Too many tasks!");
        }
        else {
            tasks[i] = t;
        }
        taskCount = taskCount + 1;
    }
    public int getTotalEnergyCost() {
        int totalcost = 0;
        if(taskCount<1) {
            System.out.println("Not enough tasks!");
        }
        else {
            for(int i = 0;i<taskCount;i++) {
                Task realt = tasks[i];
                totalcost = totalcost + realt.getEnergyCost();
            }
        }
        return totalcost;

    }
    public Task[] getTasks() {
        Task[] taskt = new Task[taskCount];
        if(taskCount<1) {
            System.out.println("Not enough tasks!");
        }
        else {
            for(int i = 0; i<taskCount; i++) {
                taskt[i] = tasks[i];
            }
        }
        return taskt;
    }
    public void printBatchInfo() {
        if(taskCount<1) {
            System.out.println("Not enough tasks!");
        }
        else {
            for(int i=0; i<taskCount; i++) {
                Task ty = tasks[i];
                System.out.println("Task name: "+ty.getTaskName()+", Task cost: "+ty.getEnergyCost()+"%");
            }
        }
    }
}
