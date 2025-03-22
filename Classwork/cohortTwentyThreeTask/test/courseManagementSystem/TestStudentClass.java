package courseManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestStudentClass {
    Student student = new Student("Aboje Edwin","abojeedwin@gmail.com","Test123!");
    HashMap<String,String> emailPasswordMap = new HashMap<>();

    @BeforeEach
    public void setUp(){
        student = new Student("Aboje Edwin","abojeedwin@gmail.com","Test123!");
        emailPasswordMap = new HashMap<>();
        emailPasswordMap.put("abojeedwin@gmail.com","Lovelife@14");
    }

    @Test
    public void testThatStudentCanRegister(){
        student.register("Aboje Edwin","abojeedwin@gmail.com","LoveLife@14");
        assertEquals("abojeedwin@gmail.com",student.getEmail());
    }

    @Test
    public void testThatStudentRegistersWithTheCorrectEmail(){
        assertThrows(IllegalArgumentException.class, () -> student.register("Aboje Edwin","abojeedwin.com","Test123!"));
    }

    @Test
    public void testThatStudentCannotRegistersWithInvalidPassword(){
        assertThrows(IllegalArgumentException.class, () -> student.register("Aboje Edwin","abojeedwin@gmail.com","Test12"));
    }

    @Test
    public void testThatStudentCannotRegisterWithInvalidName(){
        assertThrows(IllegalArgumentException.class, () -> student.register(" ","abojeedwin@gmail.com","Lovelife@14"));
    }

    @Test
    public void testThatStudentCanLogin(){
        student.register("Aboje Edwin","abojeedwin@gmail.com","Lovelife@14");
        assertEquals("Login successfully", student.login("abojeedwin@gmail.com","Lovelife@14"));
    }

    @Test
    public void testThatStudentCanRegisterForACourse(){
        Course course = new Course("Biology","Bio402","Mr Evans Okuwuru");
        Facilitator facilitator = new Facilitator("Mr Evans Okewuro","evansflash@gmail.com","Test1234@");
        facilitator.createCourse("Biology","Bio402","Mr Evans Okuwuru");
        assertEquals("Bio402",course.getCourseCode());
        student.register("Aboje Edwin","abojeedwin@gmail.com","Lovelife@14");
        assertEquals("Course registered successfully",student.registerCourse("abojeedwin@gmail.com","Biology","Bio402","Mr Evans Okuwuru"));
    }

    @Test
    public void testThatStudentCanViewCoursesEnrolledFor(){
        Course course = new Course("Biology","Bio402","Mr Evans Okuwuru");
        Facilitator facilitator = new Facilitator("Mr Evans Okuwuro","evansflash@gmail.com","Test1234@");
        facilitator.register("Mr Evans Okuwuru","evansflash@gmail.com","Test1234@");
        facilitator.createCourse("Biology","Bio402","Mr Evans Okuwuru");
        facilitator.createCourse("Statistics","STA322","Mr Francis");
        student.register("Aboje Edwin","abojeedwin@gmail.com","Lovelife@14");
        student.registerCourse("abojeedwin@gmail.com","Biology","Bio402","Mr Francis");
        student.registerCourse("abojeedwin@gmail.com","Statistics","STA322","Mr Francis");
        student.registerCourse("abojeedwin@gmail.com","Chemistry","CHM322","Mr Francis");
        assertEquals("Bio402,STA322,CHM322",student.viewCourses());
    }

    @Test
    public void testThatStudentCanViewGrades(){
        Facilitator facilitator = new Facilitator("Jack Robinson","robjack@gmail.com","Test1234@");
        facilitator.register("Jack Robinson","robjack@gmail.com","Test1234@");
        facilitator.login("robjack@gmail.com","Test1234@");
        facilitator.createCourse("Economics","ECO420","Mr Evans Okuwuru");
        student.register("Marek Phil","maric@gmail.com","Maric123@");
        student.login("maric@gmail.com","Maric123@");
        student.registerCourse("maric@gmail.com","Economics","ECO420","Mr Evans Okuwuru");
        facilitator.assignGrade("B","ECO420");
        assertEquals("Course:ECO420,Grade:B",Student.viewGrade("ECO420"));
    }

    @Test
    public void testThatStudentCanViewACourseFacilitator(){
        Facilitator facilitator = new Facilitator("Jack Robinson","robjack@gmail.com","Test1234@");
        facilitator.register("Jack Robinson","robjack@gmail.com","Test1234@");
        facilitator.login("robjack@gmail.com","Test1234@");
        facilitator.createCourse("Economics","ECO420","Mr Evans Okuwuru");
        student.register("Marek Phil","maric@gmail.com","Maric123@");
        student.login("maric@gmail.com","Maric123@");
        student.registerCourse("maric@gmail.com","Economics","ECO420","Mr Evans Okuwuru");
        assertEquals("Mr Evans Okuwuru",student.viewCourseFacilitator("ECO420"));
    }

}
