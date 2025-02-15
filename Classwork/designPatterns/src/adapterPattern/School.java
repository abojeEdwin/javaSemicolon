package adapterPattern;

public class School {
    //Structural design pattern
    public static void main (String[] args) {
         AssignmentWork aw = new AssignmentWork ();
         Pen pen = new PenAdapter();
         aw.setPen(pen);
        aw.writeAssignment("i am a bit tired to write an assignment");
    }


}
