package courseManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCourse {
    Course course = new Course("Chemistry","Chem 302","Mr Shibuzo");

    @BeforeEach
    public void setUp() {
        course = new Course("Chemistry","Chem 302","Mr Shibuzo");
    }

    @Test
    public void testThatCourseCanReturnCorrectFacilitator() {
        Course course1 = new Course("Design Thinking","DGT201","Mrs Kim");
        Course course2 = new Course("Statistics","SAT322","Mr Francis");
        assertEquals("Mr Francis",course2.getFacilitator());
    }

    @Test
    public void testThatCourseCanReturnFacilitatorByCourseCode() {
        Course course1 = new Course("Design Thinking","DGT201","Mrs Kim");
        Course course2 = new Course("Statistics","STA322","Mr Francis");
        assertEquals("Mr Francis",course1.getFacilitatorByCourseCode("STA322"));
    }

    @Test
    public void testThatCourseCanGetStudentsByCourseCode() {
        Course course1 = new Course("Design Thinking","DGT201","Mrs Kim");
        Course course2 = new Course("Statistics","STA322","Mr Francis");

        Student student = new Student("Tesla Edwin","tesride@gmail.com","Test1234@");
        student.registerCourse("tesride@gmail.com","Design Thinking","DGT201","Mr Francis");

        Student student2 = new Student("Tesla Frank","ridekick@gmail.com","Rock9089@");
        student2.registerCourse("ridekick@gmail.com","Design Thinking","DGT201","Mr Francis");

        Student student3 = new Student("Ruth Rubison","rubydia@gmail.com","Diehard@23");
        student3.registerCourse("rubydia@gmail.com","Statistics","STA322","Mr Francis");

        assertEquals("[Tesla Edwin]",course1.getStudentList("DGT201"));
    }

}
