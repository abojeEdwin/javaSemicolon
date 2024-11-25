public class isPalindrome{

	public static boolean isPalindrome(int number){

		if(number < 10000 || number > 99999){
			throw new IllegalArgumentException("Input a five digit integer");

			}
				int firstnumber = number;
				int reversednumber = 0;


				while(number != 0){
					int num = number %10;
					reversednumber = reversednumber * 10 + num;
					number/=10;
					}
		
				return firstnumber == reversednumber;

			}

	public static void main(String[] args){

		int number = 999991;
		System.out.println(isPalindrome(number));
			}

}



