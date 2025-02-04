package bankapp;
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private int counter = 1;

    private ArrayList<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    public int createAccount(String accountName, String pin) {
        Account account = new Account(generateAccountnumber(), pin, accountName);
        int newAccountNumber = account.getAccountNumber();
        accounts.add(new Account(newAccountNumber,accountName,pin));
        return newAccountNumber;

    }

    public int generateAccountnumber() {
       return counter++;
    }

    public void deposit(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if(amount <= 0){
            throw new IllegalArgumentException("Amount cannot be negative or zero");
        }
        if(account == null) {
            throw new IllegalArgumentException("Account not found");
        }
        account.deposit(amount);
    }

    public Account findAccount(int accountnumber) {
       Account account = accounts.get(accountnumber);
       if(account == null) {
           throw new IllegalArgumentException("Account not found");
       }
       return account;

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
        Account senderAccount = findAccount(fromAccountNumber);
        Account recieverAccount = findAccount(toAccountNumber);
        if(senderAccount == null ||recieverAccount == null){
            throw new IllegalArgumentException(" Account not found");
        }
        if(amount <= 0){
            throw new IllegalArgumentException("Amount cannot be negative or zero");
        }
        if(senderAccount.equals(recieverAccount)){
            throw new IllegalArgumentException("Sender account already exists");
        }
        if(recieverAccount.equals(senderAccount)){
            throw new IllegalArgumentException("Reciever account already exists");
        }
        senderAccount.withdraw(amount,senderPin);
        recieverAccount.deposit(amount);
    }
}
