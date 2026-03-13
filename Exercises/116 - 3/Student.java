import java.util.Comparator;

public class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student other) {
        return Long.compare(this.studentID, other.getStudentID());
    }

    private long studentID;
    private String name;
    private double gpa;


    public Student(long ID, String newName, double newGPA) {
        studentID = ID;
        name = newName;
        gpa = newGPA;
    }

    public long getStudentID() {return studentID;}
    public String getName() {return name;}
    public double getGpa() {return gpa;}

    public void setStudentID(long newID) {studentID = newID;}
    public void setName(String newName) {name = newName;}
    public void setGpa(double newGPA) {gpa = newGPA;}

    public void printInfo() {
        System.out.printf("Student Name: %s Student ID: %d Student GPA: %.2f%n", name, studentID, gpa);
    }


}
