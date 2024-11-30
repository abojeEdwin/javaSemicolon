import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.Assert.assertEquals;


public class Testhistogram{
	@Test
	public void testThatHistogramReturnsBoolean(){
	//start
	Histogram histogram = new Histogram();
	String input = "The quick brown Fox jumps over the lazy dog";
	boolean result = Histogram.gethistogram(input);
	assertTrue(result);
		}
	@Test
	public void testThatHistogramIsEqualToGiven(){
	//start
	Histogram histogramme = new Histogram();
	String input = "The quick brown Fox jumps over the lazy dog";
	assertEquals(true,Histogram.gethistogram(input));



		}





	

	}

