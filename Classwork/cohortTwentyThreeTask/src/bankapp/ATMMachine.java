package bankapp;
import java.util.Scanner;

import static java.lang.System.exit;


public class ATMMachine {
    private static Bank firstBank = new Bank("firstBank");
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
            case '5': transferToOtherBanks(); break;
            case '6': checkBalance(); break;
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
        displayMenu();
    }

    private static void checkBalance() {
        try{
            int accountnumber = inputNumber("Enter account number: ");
            String pin = input("Enter pin: ");
            double balance = firstBank.checkBalance(accountnumber, pin);
            display(String.format("Balance is %s", balance));
        }
        catch(Exception e){
            throw new IllegalArgumentException("Error :"+e.getMessage());
        }
        finally{
            displayMenu();
        }
    }


    private static void transfer() {
        try{
            int sender = inputNumber("Enter sender account number: ");
            int receiver = inputNumber("Enter receiver account number: ");
            String pin = input("Enter pin: ");
            double amount = Double.parseDouble(input("Enter amount: "));
            firstBank.transfer(sender,pin,receiver,amount);
            display("Transfer successful");
        }
        catch(Exception e){
            display("Transfer failed"+e.getMessage());
        }
        finally {
            displayMenu();
        }
    }

    private static void withdraw() {
        try{
            int accountNumber = inputNumber("Enter account number: ");
            double amount = inputDouble("Enter an amount: ");
            String pin = input("Enter pin: ");
            firstBank.withdraw(accountNumber, amount, pin);
            display("withdraw successful");
        }
        catch(Exception e){
            display("withdraw failed " + e.getMessage());
        }
        finally{
            displayMenu();
        }
    }

    private static void deposit() {
        double amount = 0;
        try {
            amount = inputDouble("Enter amount: ");
            int accountnumber = inputNumber("Enter account number: ");
            firstBank.deposit(accountnumber, amount);
            display("Deposited " +  amount + " to " + accountnumber);
        } catch (IllegalArgumentException e) {
            display("Invalid input"+ e.getMessage());
        } finally {
            display("Deposit successful");
            displayMenu();
        }
    }

    public static String input(String prompt) {
        display(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine().trim();
    }
    public static int inputNumber(String prompt){
        display(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static double inputDouble(String prompt){
        display(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public static void transferToOtherBanks() {
        display("This feature is under development");
        displayMenu();
    }

    private static void createAccount() {
        try{
            String fullName = input("Enter first name: ");
            String pin = input("Enter pin: ");
            firstBank.createAccount(fullName,pin);


            Account account = new Account(firstBank.getAccountnumber(), fullName,pin);
            display("Account created>>>");
            display("Account number: " + account.getAccountNumber());
        }
        catch(Exception e){
            throw new IllegalArgumentException("Error :"+e.getMessage());

        }
        finally {
            displayMenu();
        }
    }

    private static void display(String text){
        System.out.println(text);
    }

}
