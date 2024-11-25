import java.util.Arrays;
public class CheckElementInList{

	public static void main(String [] args){
		
		int [] numbers = {20,39,50,90,100};
		int elementToSearch = 87;

		if (checkElement(numbers, elementToSearch)){
			System.out.println(elementToSearch +" is in the list");
		}else{ System.out.println(elementToSearch + " is not in the list");

			}

		}

		public static boolean checkElement(int [] list, int elementToSearch){
			Arrays.sort(list);
			return Arrays.binarySearch(list,elementToSearch) >= 0;
			
		}


	}