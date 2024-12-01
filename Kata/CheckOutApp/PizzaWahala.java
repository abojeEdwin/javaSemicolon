import java.util.Scanner;
import java.lang.Math;

			public class PizzaWahala{
				public static void main(String[] args){
					
				System.out.print("""
				
				Welcome to Iya Afeez Pizza Joint, Ajegunle.

							MENU  						
.........................................................................................................................................................
		Pizza type			Number of Slices		Price of box		
.........................................................................................................................................................

		1. Sapa Size			        	4			                 2,000			
		
		2. Small Money			   	    	6			               	 2,400			
		
		3. Big Boys				      	8				         3,000			
	
		4. 0dogwu 				      	12				         5,200			
..........................................................................................................................................................	
		0: Exit

	
	What pizza type are you buying today?

	(pick options 1-4).
			""");

				Scanner input = new Scanner(System.in);
				int typeChosen = input.nextInt();

				switch(typeChosen){
			

				case 1: 
					System.out.print("How many customer are paying ?  ");	
						int customersForSapaSize  = input.nextInt();
						System.out.println(" ");

						if(customersForSapaSize > 0){
							int sapaSize = 4;
							int sapaPrice = 2000;
						
							double sapa = (double)customersForSapaSize / sapaSize;
							double sapaBoxCounter = Math.ceil(sapa);
							int sapaBoxes = (int) sapaBoxCounter;

							int sapaSlicesLeft = (sapaBoxes*sapaSize) - customersForSapaSize;
	

							float price = sapaPrice * sapaBoxes;

							System.out.println("          PURCHASE DETAILS");
							System.out.println("Pizza Type: sapa Size:");
							System.out.println(" ");

							System.out.println("  Total  Boxes: "+ sapaBoxes);
							System.out.println("	For "+ customersForSapaSize + "person(s)\n Total Price: #" + price + "\n LeftOver Slices:" +sapaSlicesLeft);
							System.out.println(" ");


							System.out.print("     Enjoy Your Pizza");

					}else{
						System.out.print("Invalid Input, please try again");
						}



						break;
		
				
				case 2:
					System.out.print("How many customers are paying ? ");
						int customersForsmallBoysSize = input.nextInt();
				
					if(customersForsmallBoysSize > 0){
						int smallBoysSize = 6;
						int smallBoysSizePrice = 2400;

						double smallBoys = (double)customersForsmallBoysSize / smallBoysSize;
						double smallBoysBoxCounter = Math.ceil(smallBoys);
						int smallBoysBoxes = (int) smallBoysBoxCounter;

						int smallBoysSlicesLeft = (smallBoysBoxes*smallBoysSize) - customersForsmallBoysSize;

						float price = smallBoysSizePrice * smallBoysBoxes;

								System.out.println("			PURCHASE DETAILS");
								System.out.println("pizza Type : Small Boys Size:");
								System.out.println(" ");

								System.out.println("  Total Boxes: "+ smallBoysBoxes);
								System.out.println("  For  "+ customersForsmallBoysSize + " person(s)\nTotal Price: #" + price + "\nLeftover Slices: "+ smallBoysSlicesLeft);
								System.out.print(" ");


								System.out.println("		Enjoy Your Pizza");

					}else{
						System.out.print("Invalid Input, Please try again");
						}
						break;



				case 3:
					System.out.print("How many customers are paying ? ");
						int customersForbigBoysSize = input.nextInt();
						System.out.println(" ");



					if(customersForbigBoysSize > 0){
						int bigBoysSize = 8;
						int bigBoysSizePrice = 3000;


						double bigBoys = (double) customersForbigBoysSize / bigBoysSize;
						double bigBoysBoxCounter = Math.ceil(bigBoys);
						int bigBoysBoxes = (int) bigBoysBoxCounter;

						int bigBoySlicesLeft = (bigBoysBoxes);

						System.out.println("		PURCHASE DETAILS");
						System.out.println("Pizza Type: Big Boys Size");
						System.out.println(" ");

						System.out.print("		Enjoy Your Pizza");
									
					}else{
						System.out.println("Invalid Input, Please Try Again");
						}
						break;


				case 4:
					System.out.print("How many customers are paying ? ");
						int customersForOdogwuSize = input.nextInt();
						System.out.println(" ");

					if(customersForOdogwuSize > 0){
						int odogwuSize = 12;
						int odogwuPrice = 5200;

							double odogwu = (double) customersForOdogwuSize / odogwuSize;
							double odogwuBoxCounter = Math.ceil(odogwu);
							int odogwuBoxes = (int) odogwuBoxCounter;

							int odogwuSlicesLeft = (odogwuBoxes*odogwuSize) - customersForOdogwuSize;
							
							float price = odogwuPrice * odogwuBoxes;
							
								System.out.println("		PURCHASE DETAILS");
								System.out.println("Pizza Type : ODOGWU Size");
								System.out.println(" ");


								System.out.println("Total Boxes: "+ odogwuBoxes);
								System.out.println("For  "+  customersForOdogwuSize  +  "person(s)\nTotal Price : #"  + price + "\nLeftover Slices : " + odogwuSlicesLeft ); 
								System.out.print(" ");
						
								System.out.print("		Enjoy Your Pizza");
			
					}else{
						System.out.print("Invalid Input, Please Try Again");					
								}
						break;

				case 0:
					System.out.print("Thank you for your patronage, See you next time");
					break;
				default:
					System.out.print("Invalid input, please enter the correct option");
					break;

				
				
				


									}
									}


									}