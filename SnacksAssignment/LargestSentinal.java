import java.util.Scanner;
public class LargestSentinal{
 	public static void main(String[] args){

Scanner input = new Scanner (System.in);
	while(true){
	System.out.print(" Enter the firstnumber (or -1 to quit ) :");
	int firstnumber = input.nextInt();
if(firstnumber == -1) {
	break;
}
	int largest = firstnumber;
	int smallest = firstnumber;

	if(firstnumber > largest) {
		largest = firstnumber;
	}
	if(firstnumber < smallest) {
		smallest = firstnumber;
	}
	System.out.print("Enter the secondnumber :");
	int secondnumber = input.nextInt();
	
	if(secondnumber > largest) {
		largest = secondnumber;
	}
	if(secondnumber < smallest) {
		smallest = secondnumber;
	}

System.out.println("The largest number is :" + largest +"\n");
System.out.println("The smallest number is :" + smallest);
}	
}
}