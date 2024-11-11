import java.util.Scanner;
	public class HCFCalculator{
		public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number :");
int num1 = input.nextInt();

System.out.print("Enter a number :");
int num2 = input.nextInt();


	while (num2 != 0){
		int remainder = num2;
		num2 = num1 % num2;
		num1 = remainder;
		}
		System.out.print(num1);








}
}