import java.util.Scanner;
public class TaxCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
 for (int i = 1; 1 <= 3; i++) {
	System.out.println("Enter the name of citizen" + i + ": " + "\n" );
	String citizen_name = input.nextLine();
	
	System.out.print("\n"+"Enter the earning of " + citizen_name + ":" );
	double earnings = input.nextDouble();
double tax;
if(earnings <= 30000) { 
				tax =earnings * 0.15;
			} else {
				tax = 30000 * 0.15 + (earnings - 30000) * 0.20;
				}
				System.out.println("Citizen's total tax for " + citizen_name + " : $" + tax);	
}
}
}