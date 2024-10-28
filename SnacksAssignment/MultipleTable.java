import java.util.Scanner;
public class MultipleTable{
	public static void main(String[] args ){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter the number :");
	int number = input.nextInt();

	System.out.print("Enter the number of terms :");
	int terms = input.nextInt();

	for( int i = 0; i <= terms; i++) {
		System.out.println(number + "X" + i  + "=" + (number * i) + "\n");
	}
}
}