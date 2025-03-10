package mondaytask;
import java.util.ArrayList;
import java.util.Arrays;
public class YetAnotherTask {


    static ArrayList<Integer>task = new ArrayList<>();

    public static ArrayList<Integer> findMultiple(int a, int b, int c){
        for(int i=a;i<b+1;i++){
            if(i%c==0){
                task.add(i);
            }
        }
        return task;
    }

    @Override
    public String toString() {
        return task.toString();
    }
}
