import java.util.ArrayList;

public abstract class Course {
    private String courseID;
    private String courseName;
    private int credits;
    protected ArrayList<String> enrolledStudents = new ArrayList<>();

    public Course(String courseID, String courseName, int credits) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.credits = credits;
    }
    public abstract void enrollStudent(String studentName);
    public void displayCourseInfo() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
        System.out.println("Enrolled Students: " + enrolledStudents);
        System.out.println("-----------------------------------");
    }
}
