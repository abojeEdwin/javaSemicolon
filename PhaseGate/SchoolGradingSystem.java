import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class SchoolGradingSystem{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
   

	ArrayList<Integer> Studentamount = new ArrayList<Integer>();
	ArrayList<Integer> Subject = new ArrayList<Integer>();	
	
		System.out.println("How many students do you have ?");
		int numberOfStudent = input.nextInt();
		
		System.out.println("How many subjects do they offer ?");
		int numberOfSubject = input.nextInt();

		System.out.println("Saving>>>>>>>>>>>>>>>>>");
		System.out.println("Saved Successfully ");
		
		int studentcounter = 0;
			System.out.println("Entering score for student 1");
			ArrayList<Integer> StudentScore = new ArrayList<Integer>();

			while(studentcounter != numberOfStudent){

				System.out.print("Entering Score for subject 1 :");
					int studentscore = input.nextInt();	
					for(int i = 0; i < studentscore; i++){
						StudentScore.add(i);						
						}
					studentcounter++;
						}
						System.out.println("Saving>>>>>>>>>>>>>");
						System.out.println("Saved Successfully");
		 
					










}
}