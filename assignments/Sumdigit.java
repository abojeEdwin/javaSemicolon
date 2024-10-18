import java.util.Scanner;

	public class Sumdigit{
		public static void main(String[] args){

			Scanner input = new Scanner(System.in);
				
			System.out.print("Enter the number between 0 and 1000 :");
			int number = input.nextInt();

			int firstremainder = number % 10 ;
			int secondnum = number / 10;
        		int thirdnum = number % 10;
			int fourthnum = secondnum / 10;


      				int sumdigit = firstremainder + thirdnum + fourthnum;
					System.out.printf("%s%d","The sum of the digit is :", sumdigit);
}
}