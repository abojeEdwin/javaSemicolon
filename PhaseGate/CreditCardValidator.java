import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Hello, Kindly enter card details to verify ");
	String cardNumbers = input.nextLine();
	String[] splittedCardNumbers = cardNumbers.split("");


	displayCardDetails(splittedCardNumbers);
}
	public static void displayCardDetails(String[] numbers){

			if(numbers.length >=13 && numbers.length<=16){
				checkPrefix(numbers);
				displayCreditCardNumber(numbers);
				displayCreditCardLength(numbers);
				determineCardValidity(numbers);
				}else{
					System.out.println("Invalid card numbers");
					System.out.println("The length must be between 13 and 16")
}
		public static String [] checkPrefix(String[] numbers){
			
				if(nmbers[0].equals("4")){
					System.out.println("Credit Card Type : VisaCard");
				}else if (numbers[0].equals("5")){
						System.out.println("Credit Card Type : MasterCard");
				} else if (numbers[0].equals("3")){
						System.our.println("CreditCard Type : American Express Card");
				} else if (numbers[0].equals("6")){
						System.out.print("CreditCard Type : Discover Card");
				} else{
						System.out.print("Credit Card  Type Invalid");
					}
		
				return numbers;
				}





} 