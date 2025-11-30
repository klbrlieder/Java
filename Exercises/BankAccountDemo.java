import java.util.Scanner;

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount BankAccount1 = new BankAccount(963654,100);
        BankAccount1.accountMenu();

        BankAccount BankAccount2 = new BankAccount(654321, 200);
        BankAccount2.accountMenu();

    }
}
