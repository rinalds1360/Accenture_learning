package day3_inheritance;

public class BankAccount {
   private double balance;

   public BankAccount(){

   }
   public BankAccount(double bal){
       this.balance = bal;
   }

   public void deposit(double amount){
       if (amount <= 5000) {
           this.balance = balance + amount;
           System.out.println("deposit completed");
       } else {
           System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amount);
       }
   }
   public void withdraw(double amount){
       if (this.balance > amount) {
           this.balance = balance - amount;
           System.out.println("withdraw completed.");
       } else {
           System.out.println("There is no enough funds.");
       }
   }
   public void printBalance(){
       System.out.printf("%.2f",this.balance);
       System.out.println();
   }

   public void transferFrom(BankAccount transFrom, double bal){
       if (bal <= transFrom.balance){
           transFrom.withdraw(bal);
           this.deposit(bal);
           System.out.println("Transfer completed");
       } else {
           System.out.println("Transfer cancelled. You are trying to transfer "+bal+" units, but only "+transFrom.balance+" are available");
       }
   }
}
