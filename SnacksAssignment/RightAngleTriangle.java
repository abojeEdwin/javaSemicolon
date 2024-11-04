import java.util.Scanner;
public class RightAngleTriangle{
		public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	do {
		System.out.println("Enter the length of the base of the triangle(1-10):");
		int baselength = input.nextInt();
	
		if (baselength < 1 || baselength > 10){
		System.out.println("Invalid input");
		}
	} while(baselength < 1 || baselength > 10);

		for(int i = 1; i <= baselength; i++){	
			for(int m = 1; m <= i; m++){
				System.out.print("* ");
			}
			System.out.println();
			}
		


}
}
