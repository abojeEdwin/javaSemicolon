package courseManagementSystem;
import java.util.Scanner;
import java.lang.System;
import courseManagementSystem.Student;
import courseManagementSystem.Course;
import courseManagementSystem.Facilitator;


public class Main {

    private static String display(String text){
        Scanner input =  new Scanner(System.in);
        System.out.println(text);
        input.nextLine();
        return text;
    }

    private static void displayMenu(){

        String displayMessage = """
                Welcome to Kiriku Management System
                1 -> Register as Student
                2 -> Register as Facilitator
                3 -> Exit
                """;

        char text = display(displayMessage).charAt(0);

    }

    private static void displayStudentMenu(){
        String displayStudentMenu = """
                            1 -> Register Course
                            2 -> View Courses
                            3 -> View Grades
                            4 -> View Course Instructors
                            5 -> Exit
                """;
        char text = display(displayStudentMenu).charAt(0);
        studentChoice(text);

    }

    private static void studentChoice(char text){
        switch (text){
            case '1': String name = display("Enter student name:");
                      String email = display("Enter your email address: ");
                      String password = display("Enter your password: ");
                      Student student = new Student(name, email, password);
                      student.register(name,email,password);

//            case '2': String courseName = display("Enter your course name :");
//                      String courseCode = display("Enter your course code :");
//                      String facilitator = display("Enter your facilitator :");
//                      String email = display("Enter your email address :");
//
//                      student.registerCourse()
        }

    }


    public static void main(String[] args){



    }
}
