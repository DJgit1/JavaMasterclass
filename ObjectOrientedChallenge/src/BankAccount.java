public class BankAccount {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(0,0,"Default name","Default address",0);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String name, String email, int phoneNumber){
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber= accountNumber;
        this.balance=balance;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String name, String email, int phoneNumber) {
        this(12344,100,name,email,phoneNumber);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        if (amount>0){
            balance += amount;
            System.out.println("Updated balance after deposit of " + amount + " is " + balance);
        } else if (amount<0) {
            System.out.println("Can not deposit negative amount");
        }
    }

    public void withdrawFunds(double amount){
        if (amount>0 && balance-amount>0){
            System.out.println("Amount withdrawn = " + amount + " New balance is " + (balance-amount));
        }else if (balance-amount<0) {
            System.out.println("Not enough balance available for withdrawal. Available Balance = " + balance);
        } else if (amount<0) {
            System.out.println("Sorry, can not withdraw negative amount.");
        }
    }
}
