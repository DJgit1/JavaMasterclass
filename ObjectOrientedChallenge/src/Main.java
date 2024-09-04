public class Main {

    public static void main(String[] args) {

//        BankAccount bankAccount = new BankAccount(12345,500,"NA","abc@123",
//                1765429876);

        BankAccount bankAccount =new BankAccount();
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setAccountNumber(12345);
//        bankAccount.setBalance(500);
//        bankAccount.setEmail("abc@123");
//        bankAccount.setPhoneNumber(1239876540);
//        bankAccount.setName("NA");

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getPhoneNumber());

        bankAccount.withdrawFunds(100);
        bankAccount.depositFunds(600);
        bankAccount.withdrawFunds(700);
        bankAccount.depositFunds(900);
        bankAccount.depositFunds(-900);
        bankAccount.withdrawFunds(-900);
        bankAccount.withdrawFunds(2100);

        BankAccount account = new BankAccount("DJ","12@23",4565);
        System.out.println("Account number - " + account.getAccountNumber() +
                "; name " + account.getName());
    }
}
