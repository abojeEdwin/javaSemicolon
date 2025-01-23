import java.util.Scanner;
	public class EnergyNeeded{
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter amount of water in kilogram :");
		double amount = input.nextDouble;
		
		System.out.print("Enter the initial temperature :");
		double initial_temp = input.nextDouble;

		System.out.print("Enter the finial temperature :");
		double finial_temp = input.nextDouble;


		double Energy = amount * (finial_temp - initial_temp) * 4184;

			System.out.printf("%s The Energy needed is :%f",Energy);

		 }}