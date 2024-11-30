import java.util.ArrayList;
import java.util.Scanner;

public class SemicolonStore{
	
		public static void main(String[] args){
				Scanner input = new Scanner(System.in);
	 		ArrayList<String>  productName = new ArrayList<>();
			ArrayList<Integer> productNum = new ArrayList<>();
			ArrayList<Double> productPrice = new ArrayList<>();

		
		System.out.println("What is the customer's name\n");
		String CustomerName = input.nextLine();
		
			sampleQuestions(name,input,productBought,ProductNumber,productPrice);
		}
public static void userQuestions( String name, Scanner input , ArrayList<String> productBought,ArrayList<Integer> productNumber,ArrayList<Double> productPrice){
		System.out.println("What did the user buy?\n ");
		String productPurchased = input.nextLine();
		productBought.add(ProductPurchased);

		System.out.println("How many pieces\n ");
		int productNum = input.nextInt();
		productNumber.add(productNum);

		System.out.println("How many unit?\n" );
		double productAmount = input.nextDouble();
		productPrice.add(productAmount);

		System.out.println("Add more items? \n ");
		String choice = input.nextLine();
		if(choice.equalsIgnoreCase("yes")){
			func_Purchased(name,input,productBought,productNumber,productPrice);
		} else {

			System.out.println("What is your name ?\n ");
			String cashier = input.nextLine();

			System.out.println("How much discount will he get");
			double discount = input.nextDouble();
			
			userCustomerInvoice(name, cashier,input,productBought,productNumber,productPrice,discount){
			}	
		}
			public static void func_Purchased( String name , Scanner input , ArrayList <String> productBought, ArrayList <Integer> productNumber, ArrayList <Double> productPrice);
				sampleQuestions(name,input,productBought,ProductNumber,productPrice);
		}
			public static void customerInvoice(String name, String cashier, Scanner input, ArrayList<String> productBought, ArrayList <Integer> productNumber, ArrayList<Double> productPrice, double discount){

				System.out.println("""
				SEMICOLON STORES
				MAIN BRANCH
				LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
				TEL: 03293828343
				DATE : 18-DEC-22 8:48:11 PM
					""");
				System.out.printf("Cashier: %s%nCustomer Name: %s%n, cashier, CustomerName");
				System.out.print("======================================================================");
				System.out.printf("%s\t%s\t%s\t%s", "Item", "QTY", "PRICE", "TOTAL");
				viewProduct(input, productBought, productNumber,productPrice,discount);
				}
				
		public static void viewProduct(Scanner input, ArrayList<String> productBought, ArrayList<Integer> productNumber, ArrayList<Double> productPrice, double discount){
					double subTotal = 0.0;
					for(int item = 0; item < productBought.size(); item++){
						System.out.printf("%n%s\t%d\t%.1f\t%\n", productBought.get(item), productNumber.get(item), productPrice.get(item), (productNumber.get(item) * productPrice(item)));
						subTotal+=productNumber.get(item) * productPrice(item);
						}
					double discountOne = discount / 100;
					double totalDiscount = subTotal * discountOne;
					double VAT = subTotal *(17.50 / 100);
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.printf("subtotal: %.1f%nDiscount: %1f%nVAT  @ 17.50: %.2f%n ", subTotal, totalDiscount, VAT);
					System.out.println("--------------------------------------------------------------------------------------------------------");
					double billTotal = (subTotal - totalDiscount) + VAT;
					System.out.printf("Bill Total: %2f%n", billTotal);
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("THIS IS NOT A RECIEPT KINDLY PAY " + billTotal);
					System.out.println("----------------------------------------------------------------------------------------------------------");


					System.out.println("How much the customer give you?\n");
					double payment =  input.nextDouble();

					if(payment > billtotal) {
						
							}
}