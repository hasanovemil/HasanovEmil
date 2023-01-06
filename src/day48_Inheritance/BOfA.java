package day48_Inheritance;

public class BOfA {

    public static void main(String[] args) {

        BankAccount obj = new BankAccount("Emil","Hasanov");

        obj.setAccountHolder(obj.firstname+" "+obj.lastname);
        obj.setAccountNumber(24279);
        obj.setBalance(1000);

        obj.availablebalance();
        obj.deposit(500);
        obj.availablebalance();
        obj.withdraw(2000);
        obj.withdraw(-300);
        obj.withdraw(0);
        obj.withdraw(300);

        System.out.println(obj);
    }
}
