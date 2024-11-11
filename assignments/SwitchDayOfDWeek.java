import java.util.Scanner;
	public class SwitchDayOfDWeek{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.print("Enter the day of the week :");
int DayWeek = input.nextInt();

	switch(DayWeek){

		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		case 7:
			System.out.print("Sunday");
			break;
		default:
			System.out.print("Try again, Please enter a valid number!");

}
	
}

}