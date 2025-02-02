package bankapp;


import java.util.ArrayList;

public class Bank {
    private String bankName;
    private int counter;

    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();

    }

    public void createAccount(String accountName, String pin) {
        accounts.add(new Account( accountName, pin,generateAccountnumber()));
    }

    public String generateAccountnumber() {
        String number = "";
        counter++;
        number+=counter;
        return number;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if(amount <= 0){
            throw new IllegalArgumentException("Amount cannot be negative or zero");
        }
        if(account != null) {
            account.deposit(amount);
        }
    }

    public Account findAccount(String accountNumber) {
        if (accountNumber == null) {
            throw new IllegalArgumentException(" Account not found");
        }
        if (accountNumber.isEmpty()) {
            throw new IllegalArgumentException(" Account cannot be empty");
        }
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;

    }


    public double checkBalance(String accountNumber, String pin) {
        Account account = findAccount(accountNumber);

        if (accountNumber == null || pin == null) {
            throw new IllegalArgumentException(" Account not found");
        }
        return account.checkBalance(pin);
    }

    public void withdraw(String accountNumber, double amount , String pin) {
        Account account = findAccount(accountNumber);
        if(amount <= 0){
            throw new IllegalArgumentException("Amount cannot be negative or zero");
        }
        if(account == null){
            throw new IllegalArgumentException(" Account not found");
        }
        if(pin == null){
            throw new IllegalArgumentException(" PIN cannot be null");
        }
        account.withdraw(amount, pin);
    }

    public void transfer(String fromAccountNumber, String senderPin,String toAccountNumber, double amount) {
        Account senderAccount = findAccount(fromAccountNumber);
        Account recieverAccount = findAccount(toAccountNumber);
        if(senderAccount == null ||recieverAccount == null){
            throw new IllegalArgumentException(" Account not found");
        }
        if(amount <= 0){
            throw new IllegalArgumentException("Amount cannot be negative or zero");
        }
        if(senderAccount == recieverAccount){
            throw new IllegalArgumentException("Sender account already exists");
        }
        if( recieverAccount == senderAccount){
            throw new IllegalArgumentException("Reciever account already exists");
        }
        senderAccount.withdraw(amount,senderPin);
        recieverAccount.deposit(amount);
    }
}
