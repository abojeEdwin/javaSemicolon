package problemnodeyfinish;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Person {
    private String name;
    private ProblemType type;
    private final ArrayList<Problem> problems;

    public Person(String name) {
        this.name = name;
        problems = new ArrayList<>();

    }


    public String getName() {
        return this.name = name;
    }


    public void addProblem(String name, ProblemType type) {
        problems.add(new Problem(name, type));
    }

    public ArrayList<Problem> getProblem() {
        return problems;
    }

    public void solveProblem(String input) {
        Problem problem = findProblemByName(input);
        problem.solve();

    }

    private Problem findProblemByName(String name) {
        for (Problem problem : problems) {
            if (problem.getName().equals(name)) {
                return problem;
            }
        }
        throw new NullPointerException("Problem not found");
    }

    public ArrayList<Problem> getUnSolvedProblems() {
        return problems
                .stream()
                .filter(problem -> !problem.isSolved())
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
