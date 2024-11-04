import java.util.Scanner;
public class DistanceBetweenTwoPoints{
		public static void main(String[] args){
	Scanner input = new Scanner(System.in);

System.out.println("Enter x1");
double x1 = input.nextDouble();
System.out.println("Enter y1");
double y1 = input.nextDouble();
System.out.println("Enter x2");
double x2 = input.nextDouble();
System.out.println("Enter y2");
double y2 = input.nextDouble();

if (x1 == x2){
	System.out.println("The two points are located on a line perpendicular to the x axis");

}else if (y1 == y2){
	System.out.println("The two points are located on a line perpendicular to the y axis");

}else {
	System.out.println("The two points are not located on either axis");
}

}
}