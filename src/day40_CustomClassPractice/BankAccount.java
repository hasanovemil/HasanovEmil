package day40_CustomClassPractice;

public class BankAccount {

    String AccountType;
    String AccountHolder;
    String AccountNumber;
    double Balance;

    public void setAccountInfo(String AccountType,String AccountHolder, String AccountNumber){
           this.AccountType = AccountType;
           this.AccountHolder = AccountHolder;
           this.AccountNumber = AccountNumber;
    }
    public void getAccountInfo(){
        System.out.println("Accountholder: " + AccountHolder );
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Available balance: " + Balance);
        System.out.println("====================================");
    }


    public void checkbalance(){
        System.out.println("Available balance" + Balance);
    }
    public void deposit(double amount){
        System.out.println("Depositing $" + amount+ " to " + AccountNumber);
        Balance += amount;
    }
    public void withdraw(double amount){
        if(amount > Balance){
            System.out.println("not enough balance");
            return;
        }
        System.out.println("Withdraw" +amount+ " from " + AccountNumber);
        Balance -= amount;
    }


}
