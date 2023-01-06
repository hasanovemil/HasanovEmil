package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Rashad = new BankAccount();
        BankAccount Gunel = new BankAccount();
        BankAccount Aida = new BankAccount();
        BankAccount Rustam = new BankAccount();
        BankAccount Rasim = new BankAccount();

        Rashad.setAccountInfo("Checking","Rashad","2427945012");
        Gunel.setAccountInfo("Checking","Gunel","464614664616");
        Aida.setAccountInfo("Checking","Aida","6666166611646");
        Rustam.setAccountInfo("Checking","Rustam","9999945012");
        Rasim.setAccountInfo("Checking","Rasim","555545012");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Rashad,Gunel,Aida,Rustam,Rasim));

        for( BankAccount each : accounts){
            each.deposit(1000);
            each.getAccountInfo();
        }
        accounts.get(3).deposit(1000);
        accounts.get(3).checkbalance();

        System.out.println("*********************************************************");

        accounts.removeIf(each -> each.Balance < 1000);
        for(BankAccount each : accounts){
            each.getAccountInfo();
        }



    }
}
