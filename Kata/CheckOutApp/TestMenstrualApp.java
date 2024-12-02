import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMenstrualApp{
		@Test
		public void TestThatMenstrualAppReturnsCorrectNextFlowDate(){
		//start
		TestmenstrualApp menstrualapp = new TestmenstrualApp();
		String date = "2024-12-01";							
		assertEquals(true,TestmenstrualApp. calculateMenstrualCircle(date,28));

	} 
						}