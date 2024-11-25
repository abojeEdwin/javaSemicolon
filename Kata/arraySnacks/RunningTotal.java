import java.util.List;
public class RunningTotal{

	public static void main(String[]args){

	List <Integer> numbers = List.of(2,3,4,6,7,10);
		 getRunningTotal(numbers);

}
	public static void getRunningTotal(List <Integer> numbers){
		int total = 0;
		for(int num : numbers){
			total+=num;
			System.out.println("The running total after" + numbers + " is" + total);
			}
		}


}