import java.util.ArrayList;
import java.util.Collections;

public class EnrollmentDemo {
    public static void main(String[] args) {
        Student st1 = new Student(20240602, "Mcgill", 3.14);
        Student st2 = new Student(20250613, "Goodman", 2.72);
        Student st3 = new Student(20230610, "Bazinga", 1.67);
        Student st4 = new Student(20250604, "Tyrion", 3.44);
        Student st5 = new Student(20210603, "Antimage", 1.44);

        Student st6 = new Student(20200601, "Alice",2.11);
        Student st7 = new Student(20220708, "Alice", 1.55);
        Student st8 = new Student(20210304, "Bob Jones", 1.44);

        st1.printInfo();
        st2.printInfo();
        st3.printInfo();

        Course crs1 = new Course("SE116", "Programming II");
        crs1.addStudent(st1);
        crs1.addStudent(st2);
        crs1.addStudent(st3);
        crs1.addStudent(st4);
        System.out.println();
        crs1.displayEnrolledStudents();

        crs1.removeStudentByID(20230610);
        crs1.removeStudentByID(123123123);

        System.out.println(crs1.enrolledStudents.size());

        Collections.sort(crs1.enrolledStudents);
        crs1.displayEnrolledStudents();
        System.out.println();
        Collections.sort(crs1.enrolledStudents, new GpaComparator());
        crs1.displayEnrolledStudents();

        crs1.addStudent(st5);
        crs1.addStudent(st3);

        crs1.filterProbation(crs1.enrolledStudents);

        System.out.println("New size of the course: "+crs1.enrolledStudents.size());

        Course crs2 = new Course("SE 115", "Programming I");
        crs2.addStudent(st6);
        crs2.addStudent(st7);
        crs2.addStudent(st8);
        crs2.filterProbation(crs1.enrolledStudents);
        System.out.println();
        ArrayList<Student> alices = crs2.searchByName("Alice");
        System.out.println("Amount of Alice's: "+alices.size());
    }
}
