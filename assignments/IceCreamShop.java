import java.util.Scanner;
	public class IceCreamShop{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.println("Icecream");
System.out.println("Sundae");
System.out.println("Shake");
int dessert = input.nextInt();

	switch(dessert){
		case 1:
		
			System.out.println("Chocolate");
			System.out.println("Vanilla");
			System.out.println("Strawberry");
			int Icecreamflavour = input.nextInt();

		switch(Icecreamflavour){
				case 1:
					System.out.println("You have selected Icecream in chocolate flavour");
					break;
				case 2:
					System.out.println("You have selected Icecream in  vanilla flavour");
					break;
				case 3:
					System.out.println("You have selected Icecream in strawberry flavour");
					break;
				default :
					System.out.println("Enter a valid number please");
					break;
				}	break;
		case 2:
			System.out.println("Chocolate");
			System.out.println("Vanilla");
			System.out.println("Strawberry");
			int Sundaeflavour = input.nextInt();

		switch(Sundaeflavour){

				case 1:
					System.out.println("You have selected Sundae in chocolate flavour ");
					break;
				case 2:
					System.out.println("You have selected Sundae in vanilla flavour");
					break;
				case 3:
					System.out.println("You have selected Sundae in Strawberry flavour");
					break;
				default :
					System.out.println("Enter a valid number please");
					break;
				}	break;
		case 3:
			System.out.println("Chocolate");
			System.out.println("Vanilla");
			System.out.println("Strawberry");
			int Shakeflavour = input.nextInt();

		switch(Shakeflavour){

				case 1:
					System.out.println("You have selected Shake in chocolate flavour");
					break;
				case 2:
					System.out.println("You have selected Shake in vanilla flavour");
					break;
				case 3:
					System.out.println("You have selected Shake in strawberry flavour");
					break;
				default :
					System.out.println("Enter a valid number please");
					break;
				}
					break;
					
			}
	
	
}

}
