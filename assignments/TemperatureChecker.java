import java.util.Scanner;
	public class TemperatureChecker{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.print("Enter a temperature in celcius :");
int temp = input.nextInt();

if (temp <= 10){
	System.out.println("Cold");
}else if (temp <= 25){
	System.out.println("Warm");
} else if (temp >= 25){
	System.out.println("Hot");
}



}
}