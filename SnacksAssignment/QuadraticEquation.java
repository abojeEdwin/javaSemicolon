import java.util.Scanner;
	public class QuadraticEquation{
		public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a :");
	double a = input.nextDouble();
	
	System.out.print("Enter b :");
	double b = input.nextDouble();

	System.out.print("Enter c :");
	double c = input.nextDouble();

	double x = -b + Math.sqrt(b * b * 4 * a * c);
	double y = -b- Math.sqrt( b + b * 4 * a *c);

	double root1 = x / 2 * a;
	double root2 = y / 2 * a;

	System.out.print("The roots are " + root1+ " and " + root2);

	
	



}
}