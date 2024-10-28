import java.util.Scanner;
	public class LeapYearApp{
		public static void main(String[] args){	
	Scanner input = new Scanner(System.in);

		System.out.println("Input the year :");
		int Year = input.nextInt();

	boolean isLeapYear = (Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0); {
	}

		if (isLeapYear) {
			System.out.println(Year + " is a leap year");
		}else {
                        System.out.println(Year + " is not a leap year");
		}
}	
}