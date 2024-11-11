import java.util.Scanner;
	public class VDDChecker{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.print("Enter you age :");
int user_age = input.nextInt();

if (user_age < 16){
	System.out.print("You are not eligible to Vote\nYou are not eligble to Drink\nYou are not eligble to Drive\nYou should be in school.");
}else if(user_age == 16){
	System.out.print("You are eligble to Drive");
}else if (user_age < 18){
	System.out.print("You are eligible to Drive");
}else if(user_age >= 18){
	System.out.print("You are eligble to Drive\nYou are eligible to Vote");
}else if(user_age >= 21){
	System.out.print("You are eligle to Vote\nYou are eligble to Drink\nYou are eligble to Drive");
}


}
}