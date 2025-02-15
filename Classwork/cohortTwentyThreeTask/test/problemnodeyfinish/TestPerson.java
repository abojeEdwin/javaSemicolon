package problemnodeyfinish;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestPerson {

    private  final ProblemType BURNOUTS = null;
    String name = "Focus problem";
    String name2 = "Hunger problem";
    String name3 = "Devotion problem";

    Person person = new Person(name);
    @BeforeEach
    public void setUp() {
        person = new Person(name);
    }
    @Test
    public void testPersonReturnsCorrectName() {
        assertEquals(name,person.getName());
    }
    
    @Test
    public void testPersonCanAddToHisProblem(){
        String problemName = "Transportation";
        ProblemType problemType = ProblemType.FINANCIAL;
        person.addProblem(problemName, problemType);
        assertEquals(1,person.getProblem().size());
    }

    @Test
    public void testThatProblemAddedIsNotSolved(){
        String firstProblemName = "Transportation";
        String secondProblemName = "Focus problem";
        String thirdProblemName = "Hunger problem";
        String fourthProblemName = "Devotion problem";

        ProblemType FirstproblemType = ProblemType.FINANCIAL;
        ProblemType secondProblemType = ProblemType.TECHNICAL;
        ProblemType thirdProblemType = ProblemType.FINANCIAL;
        ProblemType fourthProblemType = ProblemType.SPIRITUAL;

        person.addProblem(firstProblemName,FirstproblemType);
        person.addProblem(secondProblemName, secondProblemType);
        person.addProblem(thirdProblemName, thirdProblemType);
        person.addProblem(fourthProblemName , fourthProblemType);
        assertEquals(4,person.getProblem().size());
        assertEquals(4,person.getUnSolvedProblems().size());
    }

    @Test
    public void testThatProblemAddedCanBeSolved(){
        String firstProblemName = "Transportation";
        ProblemType FirstproblemType = ProblemType.FINANCIAL;
        person.addProblem(firstProblemName,FirstproblemType);
        person.solveProblem(firstProblemName);
        assertEquals(0,person.getUnSolvedProblems().size());

    }

}
