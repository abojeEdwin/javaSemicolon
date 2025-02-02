package bankapp;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;


public class ATMMachine {
    Scanner input = new Scanner(System.in);
    private static Bank firstBank = new Bank("firstBank");
    private static Bank drizzyBank = new Bank("drizzyBank");
    static Account accounts = new Account("Accountname","pin","Accountnumber");

    public static void main(String[] args) {
        displayMenu();
    }


    private static void displayMenu() {
        String mainMenu ="""
                            Welcome to DizzyBank
                            
                            1 -> Create a new account.
                            2 -> Deposit.
                            3 -> Withdraw.
                            4 -> Transfer.
                            5 -> Transfer To Other Banks.
                            6 -> Check Balance.
                            7 -> Update Pin
                            8 -> Exit.
                            
                            """;
        display("Enter a number:");
        char userInput = input(mainMenu).charAt(0);
        userChoice(userInput);
    }

    private static void userChoice(char userInput) {
        switch(userInput){
            case '1': createAccount(); break;
            case '2': deposit(); break;
            case '3': withdraw(); break;
            case '4': transfer(); break;
            case '5': checkBalance(); break;
            case '6': updatePin(); break;
            case '7': exit(); break;
            default: display("Invalid input");displayMenu();
        }
    }

    private static void exit() {
        display("Thank you for banking with us");
        System.exit(7);
    }


    private static void updatePin() {
        System.out.print("This feature is under development");
    }

    private static void checkBalance() {
        try{
            Account account = firstBank.findAccount("accountNumber");
            String accountNumber = input("Enter account number: ");
            String pin = input("Enter pin: ");
            display(String.format("balance is %2.f", firstBank.checkBalance(accountNumber, pin)));
        }
        catch(Exception e){
            display("Invalid input");
        }
        finally{
            displayMenu();
        }
    }


    private static void transfer() {
        Account senderAccount = firstBank.findAccount("fromAccountNumber");
        Account recieverAccount = firstBank.findAccount("toAccountNumber");

        try{
            String sender = input("Enter sender account number: ");
            String reciever = input("Enter receiver account number: ");
            String pin = input("Enter pin: ");
            double amount = Double.parseDouble(input("Enter amount: "));
            firstBank.transfer(sender,pin,reciever,amount);
            display("Transfer successful");
        }
        catch(Exception e){
            display("Transfer failed");
        }
        finally {
            displayMenu();
        }
    }

    private static void withdraw() {
        Account account = firstBank.findAccount("accountNumber");

        try{
            String accountNumber = input("Enter account number: ");
            Double amount = Double.valueOf(input("Enter an amount: "));
            String pin = input("Enter pin: ");
            firstBank.withdraw(accountNumber, amount, pin);
            display("withdraw successful");
        }
        catch(Exception e){
            display("withdraw failed");
        }
        finally{
            displayMenu();
        }
    }

    private static void deposit() {
        try {
            double amount = Double.parseDouble(input(" Enter amount: "));
            String accountnumber = input(" Enter account number: ");
            firstBank.deposit(accountnumber, amount);
            display("Deposited " + amount + " to " + accountnumber);
        }
        catch (IllegalArgumentException e){display("Invalid input");
        }
        finally {
            displayMenu();
        }
    }

    public static String input(String prompt) {
        display(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine().trim();
    }

    private static void createAccount() {
        try{
            String fullName = input("Enter first name: ");
            String pin = input("Enter pin: ");
            firstBank.createAccount(fullName,pin);
            display("Account created");
            display(String.format("Account created: %s", accounts.getAccountNumber()));
        }
        catch(Exception e){
            display("Error creating account");

        }
        finally {
            displayMenu();
        }

    }

    private static void display(String text){
        System.out.println(text);
    }

}
