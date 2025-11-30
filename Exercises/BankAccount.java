import java.util.Scanner;

public class BankAccount {
    Scanner sc = new Scanner(System.in);
    private long accountID;
    private double balance;
    public BankAccount(long accID, double firstBalance) {
        accountID = accID;
        balance = firstBalance;
    }
    public void setAccountID(long a) {
        accountID = a;
    }
    public void setBalance(double b) {
        balance = b;
    }
    public long getAccountID() {
        return accountID;
    }
    public double getBalance() {
        return balance;
    }
    public double deposit(int deposit_) {
        if(deposit_>0) {
            return balance = balance + deposit_;
        }
        return balance;
    }
    public double withdraw(int withdraw_) {
        if(withdraw_<=balance) {
            balance = balance-withdraw_;
            System.out.println("Your new balance is: "+balance);
            return balance;
        }
        if(withdraw_>balance) {
            boolean borrowed=false;
            System.out.println("Would you like to borrow? 1 for yes, 2 for no");
            int borrow = sc.nextInt();
            if(borrow==1) {
                borrowed = true;
            }
            else if(borrow==2) {
                System.out.println("Unsufficient balance!");
                return balance;
            }

            if(borrowed == true) {
                balance = balance - withdraw_;
                System.out.println("Your new balance is: "+balance);
                return balance;
            }
            else if(borrowed == false) {
                System.out.println("Unsufficient balance!");
                return balance;
            }
        }
        return balance;
    }
    public void accountDetails() {
        System.out.println("Your account ID is: "+accountID+"\nYour Balance is: "+balance);
    }
    public void accountMenu() {
        while(true) {
            System.out.println("1 --> deposit\n2--> Withdraw\n3--> Account Details\n4--> Change ID\n5--> Exit");
            int menu = sc.nextInt();
            if(menu == 1) {
                System.out.println("How much would you like to deposit?");
                int deposited = sc.nextInt();
                System.out.println("Your new balance is: "+deposit(deposited));
            }
            else if(menu == 2) {
                System.out.println("How much would you like to Withdraw?");
                int withdrawal = sc.nextInt();
                withdraw(withdrawal);
            }
            else if(menu == 3) {
                accountDetails();
            }
            else if(menu == 4) {
                System.out.print("Your account ID is: ");
                System.out.println(getAccountID());
                System.out.println("What would you like to change it into? ");
                long newID = sc.nextLong();
                setAccountID((newID));
                System.out.println("Your new accountID is: "+ getAccountID());
            }
            else if(menu == 5) {
                System.out.println("Exiting...");
                break;
            }
        }
    }

}
