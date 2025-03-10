package courseManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFacilitator {
    Facilitator facilitator = new Facilitator("Mr Evans Okewuro","evansflash@gmail.com","Test1234@");
    Course course = new Course("Biology","Bio402","Mr Evans Okewuro");

    @BeforeEach
    public void setUp() {
        facilitator = new Facilitator("Mr Evans Okewuro","evansflash@gmail.com","Test1234@");

    }
     @Test
    public void testThatFacilitatorCanCreateCourse() {
        assertEquals("Created Course Biology with code Bio402 successfully",facilitator.createCourse("Biology","Bio402","Mr Evans Okewuro"));
        facilitator.createCourse("Physics","Phy402","Mr Jerry");
        assertEquals(2,facilitator.getCourseSize());
     }

     @Test
    public void testThatFacilitatorCanLogin(){
        facilitator.register("Mr Evans Okewuro","evansflash@gmail.com","Test1234@");
        facilitator.login("evansflash@gmail.com","Test1234@");
        assertEquals("Login successfully",facilitator.login("evansflash@gmail.com","Test1234@"));
     }

     @Test
    public void testThatFacilitatorCanAssignGradeToStudent() {
         facilitator.register("Tesco Evans","tes@gmail.com","Ques123!");
         facilitator.login("tes@gmail.com","Que123!");
         facilitator.createCourse("Statistics","STA322","Mr Evans");
         Student student = new Student("Fred Delvan","del@yahoo.com","Delvan@123");
         student.register("Fred Delvan","del@yahoo.com","Delvan@123");
         student.login("del@yahoo.com","Delvan@123");
         student.registerCourse("del@yahoo.com","Statistics","STA322");
         facilitator.assignGrade("A","STA322");
         assertEquals("Course:STA322,Grade:A", facilitator.getGrade("STA322"));


     }

}
