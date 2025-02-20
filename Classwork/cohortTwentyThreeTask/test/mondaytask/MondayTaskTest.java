package mondaytask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MondayTaskTest {
    MondayTask mondayTask = new MondayTask();
    @BeforeEach

    public void setUp(){
        mondayTask = new MondayTask();
    }

    @Test
    public void testThatMondayTaskFunctionCanTaskAMultiDimentionalArray(){
        int [][]arr = {{'X','0','X'},{'X','0','X'},{'X','0','X'}};
        mondayTask.returnOX(arr);
    }

}
