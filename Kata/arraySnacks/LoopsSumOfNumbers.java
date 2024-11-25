
public class LoopsSumOfNumbers{

	public static int forSumOfNums(int number){
			int total = 0;			

		for(int i = 1; i <= number; i++){
			total+=i;
			}
			return total;


		}

		public static void main(String[] args){
				int number = 10;
			System.out.println(forSumOfNums(number));

			}



}