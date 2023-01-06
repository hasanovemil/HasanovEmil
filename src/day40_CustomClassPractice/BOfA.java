package day40_CustomClassPractice;

public class BOfA {
    public static void main(String[] args) {

        BankAccount Emil = new BankAccount();
        Emil.setAccountInfo("Savings","Hasanov Emil","12345679");
        Emil.getAccountInfo();
        Emil.deposit(1000);
        Emil.checkbalance();
        Emil.withdraw(500);
        Emil.checkbalance();
        Emil.withdraw(10000);
        Emil.checkbalance();

    }
}
