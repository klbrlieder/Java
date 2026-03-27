public class Vehicle {
    private String licensePlate;
    private int dailyRate;

    public Vehicle() {}
    public int calculateRental(int days) {
        return days * dailyRate;
    }

    public String getLicensePlate() {return licensePlate;}
    public int getDailyRate() {return dailyRate;}
    public void setLicensePlate(String newLicensePlate) {licensePlate = newLicensePlate;}
    public void setDailyRate(int newDailyRate) {dailyRate=newDailyRate;}

    public boolean checkRisk() {
        return false;
    }

    public void safetyCheck() {
        System.out.println("License Plate: "+licensePlate+"\ndailyRate:"+dailyRate);
    }
}

