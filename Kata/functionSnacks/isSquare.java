public class isSquare{

	public static boolean isSquare(int number){

		if(number <= 0){
			return false;
			}
				int square = (int)(Math.sqrt(number));
				return square * square == number;
			
			}
	public static void main(String[] args){

		System.out.print(isSquare(25));
	
		}





}