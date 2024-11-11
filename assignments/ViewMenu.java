import java.util.Scanner;
	public class ViewMenu{
		public static void main(String[] args){

Scanner scanner = new Scanner(System.in);	

	int menu;

	do{
		System.out.println("1.Add");
		System.out.println("2.View");
		System.out.println("3.Delete");
		System.out.println("4.Quit");
		menu = scanner.nextInt();
		
		switch(menu){
				case 1:
					System.out.println("You have selected add option");
					break;

				case 2:
					System.out.println("You have selected view option");
					break;

				case 3:
					System.out.println("You have selected delete option");
					break;

				case 4:
					System.out.println("You are quiting the program now");
					break;

				default:
					System.out.println("Invalid selection, Try again");

				}
	}while(menu != 4);


}

}