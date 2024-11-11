import java.util.Scanner;
	public class SumPositiveNum{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);


System.out.print("Enter a number :");
int number = input.nextInt();

	int sum = 0;

	while(number > 0){
		int remainder = number % 10;
		sum += remainder;
		number /=10;

}
		System.out.print(sum);

}
}