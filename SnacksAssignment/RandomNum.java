import java.util.Random;
import java.util.Scanner;

public class RandomNum{
	public static void main(String[] args){

		Random random = new Random();
		Scanner input = new Scanner(System.in);

			int randomNumber = random.nextInt(101);

		System.out.print("Guess what the number is :");
		int guessnumber = input.nextInt();

if (guessnumber > randomNumber) {
	System.out.println("Too high, try again");
} else if ( guessnumber < randomNumber) {
	System.out.println("Too low, try again");
}

 while
	 (guessnumber != randomNumber);
	System.out.println("Congratulations,You've got it!");




}
}
