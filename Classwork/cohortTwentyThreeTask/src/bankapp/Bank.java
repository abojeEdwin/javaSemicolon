package bankapp;
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private int counter = 1;
    private int accountNumber;

    private ArrayList<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    public void createAccount(String accountName, String pin) {
        accountNumber = counter++;
        Account account = new Account(accountNumber, pin, accountName);
        accounts.add(new Account(accountNumber,accountName,pin));
    }

    public int getAccountnumber() {
       return this.accountNumber;
    }

    public void deposit(int accountNumber, double amount) {
        Account findAccount = findAccount(accountNumber);
        int accountnum = findAccount.getAccountNumber();
        findAccount.deposit(amount);
        if(amount <= 0){
            throw new IllegalArgumentException("Amount cannot be negative or zero");
        }

    }

    public Account findAccount(int accountnumber) {
      for(Account account : accounts){
          if(account.getAccountNumber() == accountnumber){
              return account;
          }
      }
      return null;



    }


    public double checkBalance(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);

        if (account == null || pin == null) {
            throw new IllegalArgumentException(" Account not found");
        }
        return account.checkBalance(pin);
    }

    public void withdraw(int accountNumber, double amount , String pin) {
        Account account = findAccount(accountNumber);
        if(account == null){
            throw new IllegalArgumentException(" Account not found");
        }
        account.withdraw(amount, pin);
    }

    public void transfer(int fromAccountNumber, String senderPin,int toAccountNumber, double amount) {
        if( toAccountNumber == fromAccountNumber){
            throw new IllegalArgumentException("Accounts cannot be the same");
        }
        Account senderAccount = findAccount(fromAccountNumber);
        Account recieverAccount = findAccount(toAccountNumber);
        senderAccount.withdraw(amount,senderPin);
        recieverAccount.deposit(amount);


    }
}
