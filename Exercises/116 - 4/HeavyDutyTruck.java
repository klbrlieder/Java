public class HeavyDutyTruck extends Truck {
    private int axleCount;



    public HeavyDutyTruck() {}

    @Override
    public boolean checkRisk() {
        if(axleCount>4) {return true;}
        else {return false;}
    }

    public void setAxleCount(int newAxleCount) {
        axleCount=newAxleCount;
    }

    @Override
    public int calculateRental(int days) {
        return (days * getDailyRate()) + axleCount;
    }

}
