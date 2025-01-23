import java.util.Scanner;
public class SalesCommission{
		public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		double basicsalary = 200.00;
		double commissionrate = 0.09;
		double totalsales = 0.0;

	System.out.println("Enter the value of items(or 0 to quit)");
	int itemvalue = input.nextInt();
		while(itemvalue != 0){
	double itemvalue = input.nextDouble();


		if (itemvalue == 0){

		break;	}
			totalsales += itemvalue;
		}
	double commission = totalsales * commissionrate;
	double earnnings = basicsalary + commission ;

	System.out.println("Total sales for the week :" + totalsales);
	System.out.println("Total earning for the week :" + earnnings);


}
}