public class FactorialOf{

	public static long FactorialOf(int number){
		
		if(number == 0 || number == 1){
			return 1;
			}
			int digit = 1;
			for(int i = 2; i <= number; i++){
				digit*=i;
				}
				return digit;

			}
	
	public static void main(String[] args){
		int number = 5;
			System.out.println(FactorialOf(number));


			}





}