package problemnodeyfinish;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestProblem {
    String name = "focus problem";
    ProblemType type =  ProblemType.TECHNICAL;
    Problem problem = new Problem(name,type);

    @BeforeEach
    public void setUp() {
         problem = new Problem(name,type);
    }

    @Test
    public void testThatProblemClassTakesValidInput() {
        Problem problem = new Problem(null,null);
        assertThrows(NullPointerException.class,()-> problem.getName());
        assertThrows(NullPointerException.class,()-> problem.getType());
    }

    @Test
    public void testThatProblemReturnsCorrectNameAndProblemType() {
        assertEquals(name, problem.getName());
        assertEquals(type, problem.getType());
    }

    @Test
    public void testThatProblemIsSolved(){
        Problem problem = new Problem(name,type);
        problem.solve();
        assertTrue(problem.isSolved());
    }

    @Test
    public void testThatProblemIsNotSolved(){
        Problem problem = new Problem(name,type);
        assertFalse(problem.isSolved());
    }


}
