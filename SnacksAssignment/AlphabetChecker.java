import java.util.Scanner;
	public class AlphabetChecker{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.print("Enter an Alphabet :");
	String alpha = input.nextLine();
	
	if(alpha.length() != 1)
		System.out.print("Error: Enter a single Character");
	char ch = alpha.charAt(0);
	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
		System.out.println("The letter is  a Vowel  ");
	} else{
		System.out.print(" The Letter is a Consonant");
		}
}
}

	
	