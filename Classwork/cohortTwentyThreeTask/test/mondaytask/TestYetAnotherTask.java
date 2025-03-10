package mondaytask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestYetAnotherTask {
    YetAnotherTask task = new YetAnotherTask();

    @BeforeEach
    public void setUp() {
        task = new YetAnotherTask();
    }

//    @Test
//    public void testYetAnotherTaskExist(){
//        YetAnotherTask.findMultiple(1,10,2);
//        assertEquals(new int[]{4, 6, 8, 10},YetAnotherTask.findMultiple(1,10,2));
//    }
}
