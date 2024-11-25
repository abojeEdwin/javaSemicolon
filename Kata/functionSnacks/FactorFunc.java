public class FactorFunc{


	public static int FactorFunc(int number){
			if(number<=0){
				return 0;
			}
		
		int numberOfFactors = 0;
			
		for(int i = 1; i <= number; i++){
			if (number % i == 0){

				numberOfFactors++;
				}

			}
		return numberOfFactors;
				
		}
		
			public static void main(String[] args){

			System.out.println(FactorFunc(12));
		}

}