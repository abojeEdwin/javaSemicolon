import java.util.Scanner;
import java.util.ArrayList;

public class BankeATM{

        static ArrayList<Double> balance = new ArrayList<Double>();
        static ArrayList<String> names = new ArrayList<String>();
        static String accountNumber;
        static ArrayList<String> pin = new ArrayList<String>();
      
      
      
public static void main(String[] args){
       Scanner input = new Scanner(System.in); 
          
          int choice = 0;
          
         while(choice != 8){
         
       System.out.println("Welcome to Banke ATM \n1.Create Account\n2.Close Account\n3.Deposit Money\n4.Withdraw Money\n5.Check Account Balance\n6.Transfer\n7.Change Pin\n8.Exit");
       choice = input.nextInt(); input.nextLine();
         
          if(choice ==1){
              System.out.println("Open Account");
              System.out.print("Enter your first name: ");
              String firstName = input.nextLine(); 
              System.out.print("Enter your last name :");
              String lastName = input.nextLine();
          
              System.out.print("Create your pin :");
              String Pin = input.nextLine(); 
              pin.add(Pin);
            
              String fullnames = "" + firstName + "" +lastName + "";
              names.add(fullnames);
              accountNumber = generateAccountNumber();
              
              System.out.print("Enter initial deposit amount : ");
              double initDepo = input.nextDouble();
              balance.add(initDepo);
              System.out.println("This is your account number " + accountNumber);
              System.out.println("Account Created Successfully.");
              System.out.print("Press 1 to go back to main menu or 8 to exit : ");
              choice = input.nextInt(); input.nextLine();
              
              }

                  
          
          if(choice == 2){
              System.out.println("You are about to close this account.\nPress 1 to proceed:");
              int closeAccountSelection = input.nextInt();
                if(closeAccountSelection == 1){
                    System.out.print("Account closed successfully.");
                    System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                    choice = input.nextInt(); input.nextLine();
                }else{
                    System.out.print("Please enter a valid input ");
                  System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                  choice = input.nextInt(); input.nextLine();
              
                  }
              
                 } 
      
          if (choice == 3){
              System.out.println("Deposit");
              System.out.print("Enter deposit amount :"); 
              double depositAmount = input.nextDouble();
                if (depositAmount > 0){
                   balance.add(depositAmount);
                   System.out.println("Deposit successful.");
                    }else if (depositAmount <= 0.0) {
                      System.out.println("Invalid deposit amount, Please enter a valid deposit amount."); 
                    }
                    else{
                      System.out.print("Invalid pin, Please enter a valid pin ");
                        System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                        choice = input.nextInt(); input.nextLine();
              
                        }
                  }               
                        
          if (choice == 4){
              System.out.println("Withdrawal");
              System.out.print("Enter your pin: ");
              String withdrawalPin = input.nextLine();
              int index = pin.indexOf(withdrawalPin);
              
              if(index != -1 ){
                System.out.print("Enter withdrawal amount :");
                double withdrawAmount = input.nextDouble();
                String countPin = pin.get(index);
                double count = balance.get(index);
                  if(countPin.equals(withdrawalPin)){
                    if(count >= withdrawAmount){
                   double withdrawalAction = count - withdrawAmount;
                  System.out.println("$" + withdrawAmount + " has been debited from your account ");
                  System.out.print("Press 1 to go back to main menu or 8 to exit : \n");
                  choice = input.nextInt(); input.nextLine();
                  }else if(count <= withdrawAmount){
                        System.out.println("Insufficient Balance");
                        System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                        choice = input.nextInt(); input.nextLine();
                      }
              else{     
                System.out.println("Invalid Pin, Please Enter A Valid Pin");
                System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                choice = input.nextInt(); input.nextLine();
                              }
                            }
                          }
                        }
            
          if(choice == 5){
                System.out.println("Check Account Balance");
                  System.out.print("Enter your pin :");
                  String checkAccountPin = input.nextLine();
                  int index = pin.indexOf(checkAccountPin);
                  double countBalance = balance.get(index);
                  if(index != -1){
                      System.out.println("$"+countBalance);
                      System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                      choice = input.nextInt(); input.nextLine();
                  }else{
                      System.out.println("Incorrect Pin, Please Try Again");
                      System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                      choice = input.nextInt(); input.nextLine();
                      }
                      }
                      
          
          if(choice == 6){
              System.out.println("Transfer");
              System.out.print("Enter your pin :");
              String transferPin = input.nextLine();
              
              int index = pin.indexOf(transferPin);
              double transferBalance = balance.get(index);
              double recepientBalance = 0.0;
              if(index != -1){
                  System.out.println("Enter the account number :");
                  String recepientAccount = input.nextLine();
                  System.out.println("Enter Transfer Amount");
                  double transferAmount = input.nextDouble();
                  
                  if(transferAmount <= transferBalance){
                  double transferAction = transferAmount - transferBalance;
                  double transfer = transferAmount + recepientBalance;
                  System.out.println("Transfer successful.");
                  System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                  choice = input.nextInt(); input.nextLine();    
              }else if(transferAmount >= transferBalance){
                  System.out.println("Insufficient fund");
                  System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                  choice = input.nextInt(); input.nextLine();
              }else{
                  System.out.println("Incorrect Pin");
                  System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                  choice = input.nextInt(); input.nextLine();
                          }
                        }
                    }
                  
          if(choice == 7){
              System.out.println("Change Pin");
              System.out.print("Enter your old pin");
              String resetPin = input.nextLine();
              
              int count = pin.indexOf(resetPin);
              
              if(count != -1){
                  System.out.println("Enter your new pin");
                  String newPin = input.nextLine();
                  pin.set(count, resetPin);
                  System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                  choice = input.nextInt(); input.nextLine();
    
              }else{
                System.out.println("Incorrect pin, please enter a valid pin");
                System.out.println("Press 1 to go back to main menu or 8 to exit : \n");
                choice = input.nextInt(); input.nextLine();
                      } 
                      }  
                      
            if(choice == 8){
                System.out.println("Exiting>>>");
                      }          
                  }
                }
    
  public static String generateAccountNumber(){
    String accountNumber = "";
      for(int index = 0; index <= 8; index++) {
          accountNumber += (int) (Math.random() * 8);
                 if(accountNumber.length() == 8) break;
                   }
              return accountNumber; 
               }
        }

