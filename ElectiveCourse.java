public class ElectiveCourse extends Course {
    public ElectiveCourse(String courseID, String courseName, int credits) {
        super(courseID, courseName, credits);
    }

    @Override
    public void enrollStudent(String studentName) {
        if (!enrolledStudents.contains(studentName)) {
            enrolledStudents.add(studentName);
            System.out.println(studentName + " enrolled in elective course.");
        } else {
            System.out.println(studentName + " is already enrolled in this elective.");
        }
    }
}
