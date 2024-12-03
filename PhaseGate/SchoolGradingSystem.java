import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class SchoolGradingSystem{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
   

	ArrayList<Integer> Studentamount = new ArrayList<Integer>();
	ArrayList<Integer> Subject = new ArrayList<Integer>();	
	ArrayList<Integer> StudentScore = new ArrayList<Integer>();

		System.out.println("How many students do you have ?");
		int numberOfStudent = input.nextInt();
		
		System.out.println("How many subjects do they offer ?");
		int numberOfSubject = input.nextInt();
		
		System.out.println("Saving>>>>>>>>>>>>>>>>>");
		
		System.out.println("Saved Successfully ");
		
		int studentcounter = 0;
		System.out.println("Entering score for student 1");

		while(studentcounter != numberOfStudent){


		System.out.print("Entering Score for subject 1 :");
		int studentscore = input.nextInt();
			studentcounter++;
					}
		System.out.println("Saving>>>>>>>>>>>>>");
		System.out.println("Saved Successfully");

		ArrayList<Integer> StudentScore;
		for(int i = 0; i < studentscore.Length; i++){
			StudentScore.add(studentscore[i]);
				}
		 











}
}