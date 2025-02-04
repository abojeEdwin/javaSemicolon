package bankapp;

import java.util.Objects;

public class Account {
    private double balance;
    private String pin;
    private int accountNumber;
    private String accountName;




    public Account(int accountNumber,String accountName, String pin) {
        this.accountName = accountName;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public void setPin(String pin) {
        if(pin==null|| pin.isEmpty()){
            throw new IllegalArgumentException("Pin cannot be null or empty");
        }
         this.pin = pin;
    }

    public void deposit(double amount) {
        if(amount <= 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        balance += amount;
    }

    public double checkBalance(String pin) {
        if(pin == null){
            throw new IllegalArgumentException("PIN cannot be null");
        }
        if(!this.pin.equals(pin)|| pin.isEmpty()) {
            throw new IllegalArgumentException("Invalid pin or pin cannot be empty");
        }
           return this.balance;
    }

    public void withdraw(double amount, String pin) throws IllegalArgumentException {
       if(!pin.equals(this.pin)){
           throw new IllegalArgumentException("Invalid pin");
       }
       if(amount <= 0){
           throw new IllegalArgumentException("Amount cannot be negative");
       }
       if(amount >= balance){
           throw new IllegalArgumentException("Insufficient balance or Account cannot be empty");
       }
       balance -= amount;

    }

    public void setName(String accountName) {
        if(accountName == null||accountName.isEmpty()){
            throw new IllegalArgumentException("Account name cannot be null or empty");
        }
        this.accountName = accountName;
    }

    public String getName() {
        return accountName;
    }
     public void updatePin(String oldPin, String newPin){
        if(!oldPin.equals(this.pin)){
            throw new IllegalArgumentException("Invalid pin");
        }
        this.pin = newPin;

     }

    public int getAccountNumber() {
        return this.accountNumber;
    }

}
