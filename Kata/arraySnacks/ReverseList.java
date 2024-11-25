import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReverseList{

	
	public static <Integer> List getReverse(List <Integer> numbers){
		List <Integer> getReverse = new ArrayList<>(numbers);	
		
		Collections.reverse(numbers);




	return getReverse;	
	}
	public static void main(String[] args){
		List<Integer> numbers = List.of(1,2,3,4,5,6,7);
		List<Integer> reversednumber = new ArrayList<>(numbers);
			getReverse(reversednumber);
			System.out.println("Reversed list" + reversednumber);
		
		}
		}