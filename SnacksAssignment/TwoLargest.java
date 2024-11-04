import java.util.Scanner;
public class TwoLargest{
		public static void main(String[] args){
	Scanner input = new Scanner(System.in);
int largest = 0;
int secondlargest = 0;

System.out.println("Enter 10 numbers:");

for (int i =0 ; i< 10; i++) {
	int number = input.nextInt();

	if(number > largest) {
		secondlargest = largest;
		largest = number;
	}else if (number > secondlargest) {
		secondlargest = number;
}
}
		System.out.println("The Largest number is " + largest);
		System.out.println("The secondlargest number is " + secondlargest);

}
}
