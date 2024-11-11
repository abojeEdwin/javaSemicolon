public class MaxMinArray{
	public static void main(String[] args){

	int [] main_array = {50,80,89,90,54,45,100};

	int max = main_array [0];
	int min = main_array [0];

		for(int i = 0; i < main_array.length; i++){

			if(main_array[i] > max){
				max = main_array[i];
			}else if(main_array[i] < min){
				min  = main_array[i];
			}
				}

				System.out.println("The maximum value in the array is " + max);
	
				System.out.println("The minimum  value in the array is " + min);
		

			
	




}
}