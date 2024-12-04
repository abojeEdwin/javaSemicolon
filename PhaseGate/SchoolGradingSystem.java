import java.util.Arrays;
import java.util.Scanner;


public class SchoolGradingSystem{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
   
		System.out.println("How many students do you have ?");
		int numberOfStudent = input.nextInt();
		
		System.out.println("How many subjects do they offer ?");
		int numberOfSubject = input.nextInt();

		System.out.println("Saving>>>>>>>>>>>>>>>>>");
		System.out.println("Saved Successfully ");

		int [] [] student = new int [numberOfStudent][numberOfSubject];
		int [] total = new int[numberOfStudent];
		int [] newTotal = new int [numberOfStudent];
		double [] average = new double [numberOfStudent];
		int [] position = new int [numberOfStudent];

		
		for(int index = 0,counter = 1; index < numberOfStudent; index++,counter++){
			int sum = 0;
			for(int element = 0, count = 1; element < numberOfSubject; element++,count++){
				System.out.println("Entering score for student"+ counter +"\nEnter score for subject"+count+ " : ");
				student[index][element] = input.nextInt();
				System.out.println("Saving>>>>>>>>>>>>>");
				System.out.println("Saved Successfully");
				System.out.println();

				sum+= student[index][element];


				System.out.println();
				}
				
				total[index] = sum;
				newTotal[index]= sum;
				average[index] = sum / numberOfSubject;
				}

			Arrays.sort(newTotal);

			for(int index = 0, count =1; index < student.length; index++,element++){
 					
				for(int element = 0; element < student.length; element++){
				if(total[index]== newTotal[element]){
					position[index] = student.length - element;

			}
			}
			}






















						System.out.print("""
						========================================================================
						STUDENT		SUB1		SUB2	SUB3     	TOT		AVE		POS	
						========================================================================
			


											""");
		 
					










}
}