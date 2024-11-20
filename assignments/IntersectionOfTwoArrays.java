import java.util.ArrayList;
import java.util.List;
public class IntersectionOfTwoArrays{
public static void main(String[] args){


int [] first_element = {1,2,3,4};
int [] second_element ={3,4,5,6};


		public static List<Integer>IntersectionOfTwoArrays(int[]first_element,int [] second_element){
				List<Integer> output = new ArrayList <>();

				for(int i = 0; i < first_element.length; i++){

	
					for(int j = 0; j < second_element.length; j++){

						if(first_element[i] == second_element[j]){
							output.add(first_element[i]);
								break;
			}
			}
			}
			}	
						return output;
			










}
}