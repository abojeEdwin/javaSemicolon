import java.util.Scanner;

	public class Raisednumber{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		 
				System.out.print("Enter the first number :");
				int base  = input.nextInt();

				System.out.print("Enter the second number :");
				int power = input.nextInt();
	
				int result = 1;
				int count = 1;

				while(count <= power ){
                             			result *= base;
					count++;
					}

		System.out.print("The raised power is  : " + result);


}

}



