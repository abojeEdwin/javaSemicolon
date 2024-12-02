import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

		public class MenstrualApp{
			public static void main(String[] args){
				menstrualCalculator();
				}
	
	public static Boolean menstrualCalculator(){
			Scanner input = new Scanner(System.in);
				System.out.println("""
					Welcome To Your Menstrual Calculator App
					************************************************
				 Do you want a little lecture about menstrual cycles ?\nYes/No
				 """);
			String answer = input.nextLine();

	if(answer.equalsIgnoreCase("Yes")){
				System.out.println("""
			The menstrual cycle is the monthly hormonal cycle a female's body goes through to prepare for pregnancy. Your menstrual cycle is counted from the first day of your period up to the first day of your next period. 			Your hormone levels (estrogen and progesterone) usually change throughout the menstrual cycle and can cause menstrual symptoms.	
							""");

		calculateMenstrualCircle();

		}else if(answer.equalsIgnoreCase("No")){
				System.out.println("Proceed to calculate your menstrual circle ? \n Yes/No");
				String noResponseCalculation = input.next();
					if(noResponseCalculation.equalsIgnoreCase("Yes")){
							calculateMenstrualCircle();

						}else if(noResponseCalculation.equalsIgnoreCase("No")){
							System.out.print("Thank you for using this app, Bye......");
				}
	}else {
		menstrualCalculator();
	}
	System.out.println( );
	}

public static Boolean calculateMenstrualCircle(){
			DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			Scanner input = new Scanner(System.in);
			System.out.println("Do you want to calculate your menstrual circle ? \n Yes/No");
			String response = input.next();

					if(response.equalsIgnoreCase("Yes")){
							System.out.println("Enter your last menstruation flow date (eg.yyyy-MM-dd) : ");
							String date = input.next();

								System.out.println("How many days is your circle ?(eg. 28) ");
								int flowDays = input.nextInt();

								System.out.println("How many days do you always see your flow ? (eg. 7) ");
								int circleFlow = input.nextInt();


								LocalDate lastFlow = LocalDate.parse(date);
								LocalDate nextFlowDate = lastFlow.plusDays(flowDays);
								LocalDate nextFlowDateEnds = nextFlowDate.minusDays(flowDays);
								LocalDate firstSafePeriod = nextFlowDateEnds.plusDays(1);
								LocalDate firstSafePeriodEnds = firstSafePeriod.minusDays(flowDays);
								LocalDate ovulationStartsDate = firstSafePeriodEnds.plusDays(1);
								
								System.out.println("Your next period date is on " + nextFlowDate);
								System.out.println("Your next period end day is : " + nextFlowDateEnds);
								System.out.println("Your next first safe period is " + firstSafePeriod+ " and it ends on "+ firstSafePeriodEnds);
								


					}else if(response.equalsIgnoreCase("No")){
						System.out.print("Thank you for using this app, Bye......");
					}else {
					calculateMenstrualCircle();
				}
		

		}
}