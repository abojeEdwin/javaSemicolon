import java.util.Scanner;
public class Palindrome{

	public static void main(String[] args){
	  
		Scanner input = new Scanner(System.in);



		              System.out.print("Enter three digit integer :");
                               int number = input.nextInt();

							int originalNum = number;
                        				 int remainder = 0;
				                          int reversedNumber = 0;

               				while(number > 0){
                                   		remainder =  number % 10;
						reversedNumber = reversedNumber * 10 + remainder;
						number = number / 10;
} 

					if(originalNum == reversedNumber){
						System.out.println("It is a palindrome");
}

					else{

						System.out.println("it is not a palindrome");
}          
}
}