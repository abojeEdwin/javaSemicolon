import java.util.Arrays;
public class ArrayIntersection{
	public static void main(String[]args){

int [] exampleinput = {1,2,3,4};
int [] example_input = {3,4,5,6};

	for (int number = 0; number < exampleinput.length; number++){
		for(int count = 0; count < example_input.length;count++){
			if(exampleinput[number]==example_input[count]){
				System.out.print(exampleinput[number] + " ");
		}
			}
				}



}
}