import java.util.Scanner;
	public class IndexOfArray{
		public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the value you wish to check :");
	int value = input.nextInt();

	int [] blossom = {5,67,78,23,65,67};

	for(int i =0; i < blossom.length; i++){

		if(blossom[i] == value){
			System.out.print("The index of " + value + " is " + i);
			return;
	}

}	

		System.out.print("The value " + value + " is not in the array");
}
}