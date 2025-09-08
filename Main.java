import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course core = new CoreCourse("C101", "Data Structures", 4);
        Course elective = new ElectiveCourse("E201", "Photography", 2);

        System.out.println("=== Course Enrollment System ===");
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();
        core.enrollStudent(studentName);
        elective.enrollStudent(studentName);

        elective.enrollStudent(studentName);

        System.out.println("\n--- Course Details ---");
        core.displayCourseInfo();
        elective.displayCourseInfo();

        sc.close();
    }
}
