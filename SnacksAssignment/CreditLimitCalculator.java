import java.util.Scanner;
	public class CreditLimitCalculator{
	public static void main(String[] args){

	 	Scanner input = new Scanner(System.in);

		while(true){
			System.out.print("Enter account number (or -1 to quit):" );
			int Account_Number = input.nextInt();

		if(Account_Number == -1){
			break;
		}
			System.out.print("Enter beginning balance :");
			int Beginning_Balance = input.nextInt();
		
			System.out.print("Enter the charged items :");
			int Charged_Items = input.nextInt();
	
			System.out.print("Enter the total credit applied :");
			int Total_Credit_Applied = input.nextInt();
			
			System.out.print("Enter the credit limit :");
			int Credit_Limit = input.nextInt();

			int new_Balance = Beginning_Balance + Charged_Items - Credit_Limit;

		System.out.print("The new balance is :" + new_Balance + "\n");

		if(new_Balance > Credit_Limit){
			System.out.print("Credit limit exceeded !" + "\n");
		
		}
}
}
}