import java.util.Scanner;
public class CeaserCryptography{

	public static String CipherEncryptedMsg(String message, int number){
		StringBuilder encryptedtext = new StringBuilder();

		for(int i = 0; i < message.length(); i++){
			char index = message.charAt(i);
				
			if(Character.isUpperCase(index)){
				index = (char) (((index - 'A' + number ) % 26) + 'A');
			}else if (Character.isLowerCase(index)){
				index = (char) (((index - 'a' + number) % 26) + 'a');
			}
			encryptedtext.append(index);
			}
			return encryptedtext.toString();
	}
		public static String CipherDecryptedMsg(String encryptedtext, int number){	
			return CipherEncryptedMsg(encryptedtext, 26 - number);
			}

		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
		
			System.out.print("Enter a text message : ");
			String msg = input.nextLine();

			System.out.print("Enter a number between 0  and 26 : ");
			int number = input.nextInt();
				String encrypted = CipherEncryptedMsg(msg,number);
				String decrypted = CipherDecryptedMsg(encrypted, number); 
			System.out.println("The coded message is : " + encrypted);
			System.out.println("The decoded message is :" + decrypted);
			}
}