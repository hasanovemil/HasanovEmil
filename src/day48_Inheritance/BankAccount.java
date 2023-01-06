package day48_Inheritance;

public class BankAccount {

    public String firstname;
    public String lastname;

    public BankAccount(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public static String Bankname;

    static{
        Bankname = "Bank of America";
    }




    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        System.out.println("Depositing: "+amount);
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid balance");
            return;
        }
        if(amount>balance || amount > 1000){
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdraw: "+amount);
        balance-=amount;
    }
    public void availablebalance(){
        System.out.println("Available balance: " + getBalance());
    }

    public String toString(){
        return Bankname +
                "\n==========================================="+
                "\n"+firstname+" "+lastname+
                "\nAccountNumber: "+getAccountNumber()+
                "\n============================================="+
                "\nBalance: "+getBalance();




}
