import java.util.Scanner;
	
		public class Meters{
			public static void main(String[] args ){

		Scanner input = new Scanner(System.in);

			System.out.println("Enter number for feet :");
			double initialFeet = input.nextDouble();

			double meters = (initialFeet * 0.305) ;
   		
			System.out.printf(" %f %s %f %s",initialFeet , "is" , meters , "meters" );
}
}