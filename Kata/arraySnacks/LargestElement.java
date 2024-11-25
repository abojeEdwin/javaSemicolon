	public class LargestElement{



	public static int getMax(int [] numbers){
		int largest = numbers [0];
	for(int i = 1; i < numbers.length; i++){
		if(numbers[i] > largest){ 
			largest = numbers[i];
		}
	}
	return largest;
	}

	
	public static void main (String[] args){
	
		int [] numbers = {1,2,4,10,16,200,201,500};
			System.out.println("The largest element is " + getMax(numbers));
	}
	
}