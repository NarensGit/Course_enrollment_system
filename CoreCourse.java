public class CoreCourse extends Course {
    public CoreCourse(String courseID, String courseName, int credits) {
        super(courseID, courseName, credits);
    }

    @Override
    public void enrollStudent(String studentName) {
        enrolledStudents.add(studentName);
        System.out.println(studentName + " enrolled in core course.");
    }
}
