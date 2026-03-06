// Task 1: Constructor is used to create classes.
// Task 2: non-static methods are created when class is created whereas static methods are engraved in the memory.
public class BankAccount {
    private String ownerName;
    private double iban;
    private double balance;
    private static int accountCount = 0;
    private static BankAccount[] bankAccounts = new BankAccount[2];
    String[] transactionHistory = new String[10];
    public BankAccount(String name, long IBAN) {
        if(IBAN>=10000000000L && IBAN<=99999999999L) {
            iban = IBAN;
            bankAccounts[accountCount] = this;
            accountCount = accountCount + 1;
        }
        else if (IBAN<=10000000000L || IBAN>=99999999999L) {
            System.out.println("IBAN must be 11 digits!");
            return;
        }

        ownerName = name;
        balance = 0;
    }


    public String getOwnerName() {
        return ownerName;
    }
    public double getIban(){
        return iban;
    }
    public double getBalance(){
        return balance;
    }
    public String setOwnerName(String newName){
        return ownerName = newName;
    }
    public void setIban(long newIban){
        iban = newIban;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    public void depositMoney(int amount) {
        balance = balance + amount;
        System.out.println("Deposited the amount!");
        addTransaction("DEPOSIT: "+amount);
    }
    public void withdrawMoney(int amount) {
        if(balance>=amount) {
            balance = balance - amount;
            System.out.println("Withdrawed the amount!");
            addTransaction("WITHDRAW: "+amount);
        }
        else if(balance<amount) {
            System.out.println("Unsufficient balance!");
            addTransaction("FALIED_WITHDRAW: "+amount);
        }
    }

    public void sendMoney(int amount, long Iban) {
        for(int i=0;i<bankAccounts.length;i++) {
            if (bankAccounts[i].getIban() == Iban) {
                this.withdrawMoney(amount);
                System.out.println("Succesfully sent the money!");
                bankAccounts[i].depositMoney(amount);
                addTransaction("SENT MONEY: "+amount);
                return;
            }
        }
        System.out.println("Couldnt find the account!");
    }
    public void displayAccountInfo() {
        System.out.println("Owner name: "+ownerName);
        System.out.printf("IBAN: %.0f%n", iban);
        System.out.println("Balance: "+balance);
    }

    private void addTransaction (String Record) {
        for(int i=0;i<transactionHistory.length;i++) {
            if(transactionHistory[i] != null) {
                transactionHistory[i] = Record;
                System.out.println("Added transaction to history!");
                return;
            }
        }
        for (int j = transactionHistory.length - 2; j >= 0; j--){
            transactionHistory[j +1] = transactionHistory[j];
        }
        transactionHistory[0] = Record;
    }
    public void displayHistory() {
        for(int i=0;i<transactionHistory.length;i++) {
            System.out.println("#"+(i+1)+":"+transactionHistory[i]);
        }
    }

}
