public class Bank {
    static double transferFeeRate;

    public static void setTransferFeeRate(double rate) {
        transferFeeRate = rate;
    }
    public double getTransferFeeRate() {return transferFeeRate;}

    public static double calculateTransferFee(double amount) {return amount*transferFeeRate;}

    public static void main(String[] args) {
        Bank.setTransferFeeRate(0.02);

        BankAccount account1 = new BankAccount("Gary", 12345678912L);
        BankAccount account2 = new BankAccount("Michael",  23456789123L);




        account1.displayAccountInfo();
        account2.displayAccountInfo();

        account1.depositMoney(1000);
        account2.depositMoney(1500);
        account1.displayAccountInfo();
        account1.sendMoney(500, 23456789123L);
        double feeCost = Bank.calculateTransferFee(500);
        account1.withdrawMoney(feeCost);

        account1.withdrawMoney(200);
        account1.withdrawMoney(5000);
        account2.withdrawMoney(120);
        account2.withdrawMoney(100000);

        account1.sendMoney(200, 1726381273651L);

        account1.displayAccountInfo();
        account2.displayAccountInfo();

        account1.displayHistory();
        account2.displayHistory();
    }
}
