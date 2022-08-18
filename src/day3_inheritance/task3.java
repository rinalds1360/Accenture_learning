package day3_inheritance;

public class task3 {
    public static void main(String[] args) {
        BankAccount Mark = new BankAccount();
        Mark.printBalance();
        BankAccount Steven = new BankAccount(255.55);
        Steven.withdraw(300);
        Steven.printBalance();
        Steven.deposit(5025);
        Steven.printBalance();
        Steven.deposit(250.25);
        Steven.printBalance();
        Steven.withdraw(75.90);
        Steven.printBalance();
        BankAccount Max = new BankAccount(100.35);
        Steven.transferFrom(Max, 105.40);
        Steven.transferFrom(Max, 35.40);
        Steven.printBalance();
        Max.printBalance();

    }
}
