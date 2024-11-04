import java.util.Scanner;
public class ValidatingUserInput{
		public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		 int Input = 1;
		while (Input != 0){
		System.out.println("Enter 1 or 2 :");
		int userInput = input.nextInt();

		if (userInput == 1 || userInput ==2){
			break;
		}else {
			System.out.println("Invalid input.");
		}
		}		

}

}