import java.util.Scanner;
public class SumOfTwoNumbers{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);	

	do{
		System.out.print("Enter the first number :");
		int number1 = input.nextInt();
		
		System.out.print("Enter the second number :");
		int number2 = input.nextInt();
		
		int sum = number1 + number2;
		System.out.println("The sum of the two number is :" + sum);
}
while(true); 
	System.out.print(" Do you wish to perform the task again (or 0 to quit):");
	int crosscheck = input.nextInt();
		System.exit(0);

}
}