package courseManagementSystem;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.*;
import java.util.HashMap;

public class Student extends User{
    HashMap<String, String > emailPasswordMap = new HashMap<>();
    static ArrayList<Course> courseList = new ArrayList<Course>();

    public Student(String name, String email, String password) {
        super(name, email, password);
    }

    public void register(String name, String mail, String password) {
        if(verifyEmail(mail)){
            System.out.println("Email verified");
        }
        if(verifyPassword(password)){
            System.out.println("Password verified");
        }
        if(verifyStudentName(name)){
            System.out.print("StudentName verified");
        }
        else{
            emailPasswordMap.put(mail, password);
            System.out.println(name + " registered successfully");}
    }

    public boolean verifyEmail(String studentEmail) {
        String emailRegex = "^[a-z-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(studentEmail);

        if (!studentEmail.matches(emailRegex)){
            throw new IllegalArgumentException("Invalid email, please try again.");
        }

        return false;
    }

    public boolean verifyPassword(String password){
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);

        if(!password.matches(passwordRegex)) {throw new IllegalArgumentException("Invalid password,( Ensure the password contains at least one lowercase letter, one uppercase letter, at least one digit and at least 8 characters long).");}
        return false;
    }

    public boolean verifyStudentName(String studentName){
        String nameRegex = "^[A-Za-z]+(?:[-'\s][A-Za-z]+)*$";
        Pattern pattern = Pattern.compile(nameRegex);
        if(!studentName.matches(nameRegex)){throw new IllegalArgumentException("Invalid name format, please try again ");}
        if(studentName.equals(" ")){throw new IllegalArgumentException("Name cannot be empty");}
        return false;
    }

    public String login(String email, String password) {
        for(Map.Entry<String , String > entry : emailPasswordMap.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            if(email.equals(key)){
                return ("Login successfully");
            }else{
                return ("Invalid email or password");
            }
        }

        return null;
    }

    public String registerCourse(String email, String courseName,String courseCode,String facilitator) {
        Course course = new CourseBuilderClass()
                .setCourseName(courseName)
                .setCourseCode(courseCode)
                .setFacilitator(facilitator)
                .getCourse();
        verifyEmail(email);
        if(courseCode.equals(course.getCourseCode())){
            courseList.add(course);
            Course.addStudent(Student.this);
            return ("Course registered successfully");
        }else{ return ("Your course has not been added");
        }
    }

    public String viewCourses() {
        if(courseList.isEmpty()){
            return "No courses found";
        }
        StringBuilder courseString = new StringBuilder();
        for(Course course : courseList){
          courseString.append(course.getCourseCode())
                  .append(",");
        }
        if(courseString.length() > 2){
            courseString.setLength(courseString.length() - 1);
        }
        return courseString.toString();
    }

    public static String getCourseCode(){
        for(Course course : courseList){
            return course.getCourseCode();
        }
        return null;
    }

    public static String viewGrade(String studentCourseCode) {
        for(Course course : courseList){
            if(course.getCourseCode().equals(studentCourseCode)){
               return Facilitator.getGrade(studentCourseCode);
            }
        }
       return ("Course not found");
    }

    public String viewCourseFacilitator(String courseCode) {
        for(Course course : courseList){
            if(course.getCourseCode().equals(courseCode)){
                return course.getFacilitator();
            }
        }
        return null;
    }
}



