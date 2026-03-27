public class Truck extends Vehicle {
    private int cargoCapacity;


    public Truck() {}

    public int getCargoCapacity() {return cargoCapacity;}
    public void setCargoCapacity(int newCargoCapacity) {cargoCapacity=newCargoCapacity;}

    @Override
    public boolean checkRisk() {
        if(cargoCapacity>20) {return true;}
        else {return false;}
    }




    @Override
    public void safetyCheck() {
        System.out.println("License Plate: "+getLicensePlate()+"\ndailyRate:"+getDailyRate()+"\nCargo Capacity: "+cargoCapacity);
        if(cargoCapacity<40) {System.out.println("Safe!");}
        else {System.out.println("Not Safe!");}

    }
}
