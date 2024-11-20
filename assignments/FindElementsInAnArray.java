import java.util.Scanner;
public class FindElementsInAnArray{
public static void main(String[]args){

	Scanner input = new Scanner(System.in);


System.out.print("Enter the element you wish to check for :");
int  element = input.nextInt();


	int [] Exampleinput = {10,20,30,40};

		for(int i = 0; i < Exampleinput.length; i++){

			if(Exampleinput[i]== element){
				System.out.print("True");
				return;
			}
				
			}
				System.out.print("False");
				

	}
}