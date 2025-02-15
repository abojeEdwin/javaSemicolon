package problemnodeyfinish;

public class Problem {
    public boolean isSolved;
    private  ProblemStatus status;
    private String name;
    private ProblemType type;

    public Problem(String name, ProblemType type) {
        this.type = type;
        this.name = name;
        this.status = ProblemStatus.UNSOLVED;
    }

    public String getName() {
        if(this.name == null) {
            throw new NullPointerException("Problem name cannot be null");
        }
        if(this.name.equals("")) {
            throw new NullPointerException("Problem name cannot be empty");
        }
         return this.name = name;
    }

    public ProblemType getType() {
        if(this.type == null) {
            throw new NullPointerException("Problem type cannot be null");
        }
        return this.type = type;
    }

    public ProblemStatus solve(){
        return this.status = ProblemStatus.SOLVED;
    }
    public boolean isSolved() {
        return this.status == ProblemStatus.SOLVED;
    }
}
