import java.util.Scanner;
	public class PerfectNumbers{
		public static void main(String[] arg){

Scanner input = new Scanner(System.in);
	System.out.print("Enter a number :");
	int num1 = input.nextInt();

	if(num1 < 0){
		System.out.print("Error: Enter a valid integer!");
	}
			int divisor = 0;
		for(int i = 1; i <= num1; i++){
			if(num1 % 1 == 0){
				divisor += i;
				System.out.print(num1 + " is a perfect number");

			}else  { System.out.print(num1 + "is not a perfect number");

		} 		


		}


}
}