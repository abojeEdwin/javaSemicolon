import java.util.Scanner;
	public class Grades{
		public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		System.out.println("Enter grade :");
		int grades = input.nextInt();

		if(grades < 50){
			System.out.println("D");
		}if(grades >= 50 || <= 60){
			System.out.println("C");
		}if(grades > 60 || <= 80){
			System.out.println("B");
		}if(grades > 80 || <= 100){
			System.out.println("A");
			}
			


}
}