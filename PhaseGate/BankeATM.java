import java.util.Scanner;
import java.util.ArrayList;

public class BankeATM{

        static ArrayList<Double> balance = new ArrayList<Double>();
        static ArrayList<String> names = new ArrayList<String>();
        static String accountNumber;
        static ArrayList<String> pin = new ArrayList<String>();
      
      
      
public static void main(String[] args){
       Scanner input = new Scanner(System.in); 
          
          int starter = 0;
          
         while(starter != 1){
         
       System.out.println("Welcome to Banke ATM \n1.Create Account\n2.Close Account\n3.Deposit Money\n4.Withdraw Money\n5.Check Account Balance\n6.Transfer\n7.Change Pin\n8.Exit");
       int choice = input.nextInt(); input.nextLine();
         
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
              
              System.out.println("Account Created Successfully.");
              
             
              System.out.println("This is your account number " + accountNumber);
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

