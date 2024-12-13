import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCeaserCryptography{
	
	public void CipherEncryptedMsgReturunsCorrectValue(){
	//start
	CeaserCryptography cipherEncrypted = new CeaserCryptography();
	String input = "Edwin";
	int number = 3;
	assertEquals(true, CeaserCryptography.CipherEncryptedMsg(input,number));
	}
	
	@Test
	public void CipherDecryptedMsgReturnsCorrectValue(){
	//start
	CeaserCryptography cipherDecrypted = new CeaserCryptography();
	String input = "Hgzlq";
	int number = 3;
	assertEquals(false, CeaserCryptography.CipherDecryptedMsg(input,number));

}


}