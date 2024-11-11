import java.util.Scanner;
	public class CourseInstructor{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.println("Math");
System.out.println("Science");
System.out.println("History");
int course = input.nextInt();

	switch(course){
		case 1:
		
			System.out.println("Freshman");
			System.out.println("Sophomore");
			System.out.println("Junior");
			System.out.println("Senior");
			int mathinstructor = input.nextInt();

		switch(mathinstructor){
				case 1:
					System.out.println("Your course instructor is Miss Jennifer");
					break;
				case 2:
					System.out.println("Your course instructor is Miss Kim");
					break;
				case 3:
					System.out.println("Your course instructor is Mr Evans");
					break;
				case 4:
					System.out.println("Your course instructor is Mr Chibuzor");
					break;
				default :
					System.out.println("Enter a valid number please");
					break;
				}	break;
		case 2:
			System.out.println("Freshman");
			System.out.println("Sophomore");
			System.out.println("Junior");
			System.out.println("Senior");
			int scienceinstructor = input.nextInt();

		switch(scienceinstructor){

				case 1:
					System.out.println("Your course instructor is Miss Jennifer");
					break;
				case 2:
					System.out.println("Your course instructor is Miss Kim");
					break;
				case 3:
					System.out.println("Your course instructor is Mr Evans");
					break;
				case 4:
					System.out.println("Your course instructor is Mr Chibuzor");
					break;
				default :
					System.out.println("Enter a valid number please");
					break;
				}	break;
		case 3:
			System.out.println("Freshman");
			System.out.println("Sophomore");
			System.out.println("Junior");
			System.out.println("Senior");
			int historyinstructor = input.nextInt();

		switch(historyinstructor){

				case 1:
					System.out.println("Your course instructor is Miss Jennifer");
					break;
				case 2:
					System.out.println("Your course instructor is Miss Kim");
					break;
				case 3:
					System.out.println("Your course instructor is Mr Evans");
					break;
				case 4:
					System.out.println("Your course instructor is Mr Chibuzor");
					break;
				default :
					System.out.println("Enter a valid number please");
					break;
				}
					break;
					
			}
	
	
}

}
