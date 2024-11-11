import java.util.Scanner;
	public class AgeChecker{
		public static void main(String[] args){
	Scanner input = new Scanner(System.in);

System.out.print("Enter your age :");
int User_age = input.nextInt();

	if (User_age <= 12){
		System.out.println("Child");	

	}else if (User_age <= 17){
		System.out.println("Teen");
	}else if (User_age <= 64){
		System.out.println("Adult");
	}else if (User_age >= 65){
		System.out.println("Senior");
		}






}
}