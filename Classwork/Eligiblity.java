import java.util.Scanner;
public class Eligiblity{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

	System.out.print("Enter your name:");
	String user_name = input.nextLine();

	System.out.print("Enter your age:");
	int user_age = input.nextInt();

	System.out.print("Enter your height:");
	int user_height = input.nextInt();
	
	

		if(user_height == 43 && user_height <= 90){
			System.out.println(user_name + " You are eligble");
			}
		if(user_age == 56 && user_age <= 69){
			System.out.println(user_name + " You are eligble");
			}














}
}