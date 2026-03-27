import java.awt.*;

public class FleetManagementSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        Vehicle v1 = new Vehicle();
        v1.setLicensePlate("123BA123");
        v1.setDailyRate(12);
        Truck v2 = new Truck();
        v2.setLicensePlate("231BA231");
        v2.setDailyRate(13);
        v2.setCargoCapacity(36);
        HeavyDutyTruck v3 = new HeavyDutyTruck();
        v3.setLicensePlate("321BA321");
        v3.setDailyRate(14);
        v3.setCargoCapacity(44);
        v3.setAxleCount(5);

        v1.safetyCheck();
        System.out.println("Rental cost of: "+v1.getLicensePlate()+" is: "+v1.calculateRental(7));
        System.out.println(v1.checkRisk());

        v2.safetyCheck();
        System.out.println("Rental cost of: "+v2.getLicensePlate()+" is: "+v2.calculateRental(7));
        System.out.println(v2.checkRisk());
        v3.safetyCheck();

        System.out.println("Rental cost of: "+v3.getLicensePlate()+" is: "+v3.calculateRental(7));
        System.out.println(v3.checkRisk());
    }
}
