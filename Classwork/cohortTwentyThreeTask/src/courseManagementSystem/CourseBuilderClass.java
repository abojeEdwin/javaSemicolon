package courseManagementSystem;

public class CourseBuilderClass {
    private String courseName;
    private String courseCode;
    private String facilitator;

    public CourseBuilderClass setFacilitator(String facilitator) {
        this.facilitator = facilitator;
        return this;
    }

    public CourseBuilderClass setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    public CourseBuilderClass setCourseCode(String courseCode) {
        this.courseCode = courseCode;
        return this;
    }

    public Course getCourse(){
        return new Course(courseName, courseCode,facilitator);
    }
}
