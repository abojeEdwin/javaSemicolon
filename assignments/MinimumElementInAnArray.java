public class MinimumElementInAnArray{
public static void main(String[] args){


	int[] exampleinput = {4,2,9,1,6};
	int mini = exampleinput[0];

		for(int i = 0; i < exampleinput.length; i++){
			if(exampleinput[i] < mini){
				mini = exampleinput[i];
					}
				}
					System.out.print(mini);






}
}