package courseManagementSystem;
import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String courseName;
    private String courseCode;
    private ArrayList<Student> students = new ArrayList<>();
    private String facilitator;
    private HashMap<String,String> Grades = new HashMap<>();

    public Course(String courseName, String courseCode,String facilitator) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.facilitator = facilitator;
    }
    public String getCourseName() {
        return this.courseName;
    }

    public String getCourseCode() {
        return this.courseCode ;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setFacilitator(String facilitator) {
        this.facilitator = facilitator;
    }

    public String getFacilitator() {
        return this.facilitator;
    }

    public String getFacilitatorByCourseCode(String courseCode) {
        if (courseCode.equals(this.courseCode)) {
            return this.facilitator;
        }
        return ("No facilitator assigned or check your coursecode again") ;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public String getStudentList(String courseCode) {
        ArrayList<String> studentname = new ArrayList<>();
            for(Student student : students){
                if(courseCode.equals(this.courseCode)){
                    studentname.add(student.fullName);
                    return studentname.toString();
                }
            }
        return null;
    }


}
