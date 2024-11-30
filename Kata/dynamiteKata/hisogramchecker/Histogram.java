public class Histogram{

	public static Boolean gethistogram(String words){
			if(words.length() < 26){
				return false;
				}

				words = words.toLowerCase();

			for(char alpha = 'a'; alpha <= 'z' ; alpha++){
				if(words.indexOf(alpha) == -1){
					return false;	
					}
			
				}
				return true;

		}

	public static void main(String[]args){

		System.out.println(gethistogram("The quick brown Fox jumps over the lazy dog"));
			}


	


	} 