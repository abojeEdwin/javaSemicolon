import java.util.Scanner;
	public class SumOfEvenNum{
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

	int num1;
	int num2;

do{
	System.out.println("Enter first number :");
	num1 = input.nextInt();

	System.out.println("Enter second number :");
	num2 = input.nextInt();

	if(num2 <= num1){
		System.out.println("Error: Second number must be greater than first number");
}
} while(num2 <= num1);


	int sum = 0;
	
	for(int count = num1; count <= num2;count++ ){

		if (count % 2 == 0){
			sum += count;
		}

		}
			System.out.println("The sum of all even numbers between " + num1 + " and " + num2 + " is " + sum);

}
}