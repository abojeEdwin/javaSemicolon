import java.util.Scanner;
	public class EmploymentChecker{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.println("1.IT");
System.out.println("2.HR");
System.out.println("3.FINANCE");
int employ = input.nextInt();
	
	switch(employ){
		case 1:
			System.out.println("1.Manager");
			System.out.println("2.Analyst");
			System.out.println("3.Intern");
			int ITrole = input.nextInt();

			switch(ITrole){
				case 1:
					System.out.print("Manager");
					break;
				case 2:
					System.out.print("Analyst");
					break;
				case 3:
					System.out.print("Intern");
					break;

				default :
					System.out.print("Try again, Please enter a valid number!");
					break;
	
				}
					break;

		case 2:
	
			System.out.print("1.Manager");
			System.out.print("2.Analyst");
			System.out.print("3.Intern");
			int HRrole = input.nextInt();

		case 3:
			System.out.print("1.Manager");
			System.out.print("2.Analyst");
			System.out.print("3.Intern");
			int FINANCErole = input.nextInt();
		}

	
}

}
