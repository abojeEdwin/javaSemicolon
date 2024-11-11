import java.util.Scanner;
	public class TaxChecker{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.print("Enter your annual income :");
int income = input.nextInt();

if (income <= 9875){
	System.out.println("Your tax rate based on your income is"+ " 10% ");
} else if (income <= 40125){
	System.out.println("Your tax rate based on your income is " + " 12% ");
} else if (income <= 85525){
	System.out.print("Your tax rate based on your income is " + " 22% ");
} else if (income >= 85526){
	System.out.println("Your tax rate based on your income is" + " 24% ");
}


}
}

