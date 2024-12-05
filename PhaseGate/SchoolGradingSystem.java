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

			for(int index = 0, count =1; index < student.length; index++, count++){
 					
				for(int element = 0; element < student.length; element++){
				if(total[index]== newTotal[element]){
					position[index] = student.length - element;
			}
			}
			}
				System.out.println("============================================================");
				System.out.print("STUDENT");

				for(int index = 1; index <= numberOfSubject; index++){
					System.out.printf("%10s", "SUB" +  index);	
							}
					System.out.printf("%10s%10s%10s%n","TOTAL","AVERAGE","POSITION");

					for(int index = 0, count = 1; index < numberOfStudent; index++,count++){
							System.out.print("Student" + count);
								for(int element = 0; element < numberOfSubject; element++){
									System.out.printf("%10d", student[index][element]);
										}
								System.out.printf("%8d%9.2f%10d",total[index],average[index],position[index]);
							System.out.println();
							
				}










}
}





