import java.util.Scanner;
public class Palindromes{
		public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a five digit number");
	int number = input.nextInt();
		int firstnumber = number / 10000;
		int secondnumber = number / 1000 % 10;
		int thirdnumber = number / 100 % 10;
		int reversednumber = number / 10 % 10;
		int fifthnumber = number % 10;

	if (firstnumber == fifthnumber && secondnumber == reversednumber) {
		System.out.println("its a palindrome");
	} else {
		System.out.println("its not a palindrome");
	}
}
}


