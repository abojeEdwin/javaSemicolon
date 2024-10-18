import java.util.Scanner;
	public class NegetiveOrPositiveInt{

 		public static void main(String[] args){

			Scanner input = new Scanner(System.in);

				System.out.print("Enter first integer :");
				int num1 = input.nextInt(); 

  				System.out.print("Enter second integer :");
				int num2 = input.nextInt();
				
				System.out.print("Enter third integer :");
				int num3 = input.nextInt();

 				System.out.print("Enter fourth integer :");
				int num4 = input.nextInt();

				System.out.print("Enter fifth integer :");
				int num5 = input.nextInt();

					int positiveint = 0;
					int negetiveint = 0;
					int zeroinput = 0;


   					if (num1 > 0){
					    positiveint ++;
}
					else if (num1 < 0){
					    negetiveint ++;
}
					else if (num1 == 0){
					     zeroinput ++;
}
					else {
						System.out.println("no container");	
}
   					if (num2 > 0){
					    positiveint ++;
}
					else if (num2 < 0){
					    negetiveint ++;
}
					else if (num2 == 0){
					     zeroinput ++;
}
					else {
						System.out.println("no container");
  }
   					if (num3 > 0){
					    positiveint ++;
}
					else if (num3 < 0){
					    negetiveint ++;
}
					else if (num3 == 0){
					     zeroinput ++;
}
					else {
						System.out.println("no container");
}
  					if (num3 > 0){
					    positiveint ++;
}
					else if (num4 < 0){
					    negetiveint ++;
}
					else if (num4 == 0){
					     zeroinput ++;
}
					else {
						System.out.println("no container");
}
   					if (num5 > 0){
					    positiveint ++;
}
					else if (num5 < 0){
					    negetiveint ++;
}
					else if (num5 == 0){
					     zeroinput ++;
}
					else {
						System.out.println("no container");
}		
						System.out.printf("%s%d","Positive counts: ",positiveint);
						System.out.printf("\n%s%d","Negetive counts : ",negetiveint);
						System.out.printf("%s%d","\nzero inputs : ",zeroinput);


}
}