import java.util.Scanner;
public class GasMilage{
		public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int totalmiles = 0;
	int totalgallons =0;
	int trip = 0;

		System.out.println("Enter a number");
		int number = input.nextInt();

		while (number != 0) {

		System.out.println("Enter a number");
		int miles = input.nextInt();

		if(miles ==0){
		break;
		}
		
		System.out.println("Enter a number");
		int gallons = input.nextInt();

		double milespergallon = (double) miles / gallons;

		System.out.println("Miles per gallon for each trip is :" + milespergallon);


		totalmiles += miles;
		totalgallons += gallons;
		trip++;
		}

		if(trip > 0) {
			double combinedmilespergallon = (double) totalmiles / totalgallons;
			System.out.print("Combined miles per gallon for all trips is " + combinedmilespergallon);
		}else {
			System.out.println("No trip");
			}
}
}
			
