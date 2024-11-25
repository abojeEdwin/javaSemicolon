import java.util.List;
public class OddNumberInList{


	public static void main(String[] args){

		List <Integer> numbers = List.of(20,90,55,58,100,36);
		getEvenInList(numbers);
			
	}
		public static void getEvenInList(List<Integer> numbers){
			for(int num : numbers){
				if(num % 2 != 0){
					System.out.println(num);
				}
			


			}

		
		}





}

