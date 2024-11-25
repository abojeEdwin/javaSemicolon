import java.util.List;
import java.util.ArrayList;

public class ConcatenateFunc{

	public static List <Object> ConcatenatedList(List <String> firstList, List<Integer> secondList){
		List <Object> answer = new ArrayList<>(firstList);
		answer.addAll(secondList);

		return answer;

			}

		public static void main(String[] args){
			
		List<String> firstList = List.of("a","b","c");
		List<Integer> secondList = List.of(1,2,3);



		System.out.println(ConcatenatedList(firstList,secondList));

			}






}