import java.util.Scanner;
		public class BMIcalculator{
				public static void main(String[] args){
     	
		Scanner input = new Scanner(System.in);{
				System.out.print("Enter the value for weight in Kilograms : ");
				double weightinkg = input.nextDouble();

				System.out.print("Enter the value for height in Meters : ");
                                double heightinmeters = input.nextDouble();

		
				double	BMI = weightinkg / (heightinmeters * heightinmeters);
						
					System.out.printf("%s %f", "Your BMI is", BMI);

				
									
}
}
}