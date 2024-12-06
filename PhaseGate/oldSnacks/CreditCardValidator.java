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
					determineCreditCardValidity(numbers);
			}else{
				System.out.println("Invalid card numbers");
				System.out.println("The length must be between 13 and 16");
				}
			}
			public static String [] checkPrefix(String[] numbers){
			
			if(numbers[0].equals("4")){
				System.out.println("Credit Card Type : VisaCard");
			}else if (numbers[0].equals("5")){
				System.out.println("Credit Card Type : MasterCard");
			} else if (numbers[0].equals("3")){
				System.out.println("Credit Card Type : American Express Card");
			} else if (numbers[0].equals("6")){
				System.out.println("Credit Card Type : Discover Card");
			} else{
				System.out.println("Credit Card  Type : Invalid");
				}
			return numbers;
				}

				public static void displayCreditCardLength(String[] numbers){

					if(numbers.length >= 13 && numbers.length <=16){
						System.out.printf("%n%s %d%n", "Credit Card Digit Length : ",numbers.length);
						}
					}

					public static void displayCreditCardNumber(String[] numbers){
						System.out.print("Credit Card Number :");
						for(String cardNumber : numbers){
							System.out.print(cardNumber);
						}
						
					}		
					public static void determineCreditCardValidity(String[] numbers){

						int [] cardNumbers = new int[numbers.length];
						for(int count = 0; count < numbers.length; count++){
							cardNumbers[count] = Integer.parseInt(numbers[count]);
				 		}						
							int sumOfNumbersLessThanOrEqualToFour = 0;
							int sumOfNumberGreaterThanFour = 0;
							for(int index = cardNumbers.length - 1 ; index>=0; index--){
								if(index % 2 == 0 && cardNumbers[index] <= 4){
									sumOfNumbersLessThanOrEqualToFour += cardNumbers[index]*2;
								}
							}
								for(int index = cardNumbers.length - 1 ; index >= 0; index--){
									if (index % 2 == 0 && cardNumbers[index] > 4){
										sumOfNumberGreaterThanFour += (cardNumbers[index] * 2) -9;
									}
								}

								int total = sumOfNumbersLessThanOrEqualToFour + sumOfNumberGreaterThanFour;

								int sumOfOddPositions = 0;
								for(int index = cardNumbers.length - 1; index >= 0; index--){
								if(index % 2 != 0){
									sumOfOddPositions += cardNumbers[index];
									}
								}

								int sumTotal = sumOfOddPositions + total;

								if(sumTotal % 10 == 0){
									System.out.println("Credit Card Validity Status : Valid");
								}else{
									System.out.println("Credit Card Validity Status : Invalid");
									}
								}
							} 