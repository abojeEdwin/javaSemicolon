import java.util.Arrays;
import java.util.Scanner;


public class SchoolGradingSystem{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
   

	int Studentamount [] = new int[0];
	int Subject[] = new int[0];	
	
		System.out.println("How many students do you have ?");
		int numberOfStudent = input.nextInt();
		
		System.out.println("How many subjects do they offer ?");
		int numberOfSubject = input.nextInt();

		System.out.println("Saving>>>>>>>>>>>>>>>>>");
		System.out.println("Saved Successfully ");
		
		int studentcounter = 0;
			System.out.println("Entering score for student 1");
			int StudentScore[] = new int[numberOfStudent];

			while(studentcounter != numberOfStudent){

				System.out.print("Entering Score for subject 1 :");
					int studentscore = input.nextInt();	
					for(int i = 0; i < studentscore; i++){
						StudentScore.push(i);						
						}
					studentcounter++;
						}
						System.out.println("Saving>>>>>>>>>>>>>");
						System.out.println("Saved Successfully");

						for(int count = 0; count < StudentScore.length ; count ++){
								System.out.print(count);
								}
























						System.out.print("""
						========================================================================
						STUDENT		SUB1		SUB2	SUB3     	TOT		AVE		POS	
						========================================================================
			


											""");
		 
					










}
}