package courseManagementSystem;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;


public class Facilitator extends User{


    ArrayList<Course> courses = new ArrayList<>();
    HashMap<String,String> emailPasswordMap = new HashMap<>();
   static Map<String,String > grades = new HashMap<>();

    public Facilitator(String name, String email, String password) {
        super(name, email, password);
        this.email = email;
        this.password = password;
        this.fullName = name;
    }

    public String createCourse(String courseName,String courseCode,String facilitator) {
        Course course = new Course(courseName,courseCode,facilitator);
        courses.add(course);
        return ("Created Course " + course.getCourseName() + " with code " + course.getCourseCode() + " successfully");
    }

    public int getCourseSize() {
        return courses.size();
    }

    public void register(String name, String mail, String password) {
        if(verifyEmail(mail)){
            System.out.println("Email verified");
        }
        if(verifyPassword(password)){
            System.out.println("Password verified");
        }

        if(verifyFacilitatorName(name)){
            System.out.println("Name verified");
        } else{
            emailPasswordMap.put(mail,password);
            System.out.println(name + " registered successfully");
        }


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

    public boolean verifyFacilitatorName(String facilitatorName){
        String nameRegex = "^[A-Za-z]+(?:[-'\s][A-Za-z]+)*$";
        Pattern pattern = Pattern.compile(nameRegex);
        if(!facilitatorName.matches(nameRegex)){throw new IllegalArgumentException("Invalid name format, please try again ");}
        if(facilitatorName.equals(" ")){throw new IllegalArgumentException("Name cannot be empty");}
        return false;
    }

    public String login(String email, String password){
        for(Map.Entry<String,String> entry : emailPasswordMap.entrySet()){
            String key = entry.getKey();
            if(email.equals(key)){
                return ("Login successfully");
            }else{
                return ("Invalid email or password");
            }
        }
        return null;
        }

    public String assignGrade(String grade, String studentCourseCode) {
        if(studentCourseCode.equals(Student.getCourseCode())){
            grades.put(studentCourseCode,grade);
            return ("Grade updated successfully");
        }
        return null;
    }

    public static String getGrade(String studentCourseCode){
        if(studentCourseCode.equals(Student.getCourseCode())){
           for(Map.Entry<String,String> entry: grades.entrySet()){
               return ("Course:"+entry.getKey() + ",Grade:"+entry.getValue());
           }
        }
        return ("Course or Course grades has not been updated");
    }


}
