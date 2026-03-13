import java.lang.reflect.Array;
import java.util.ArrayList;


public class Course {
    private String courseCode;
    private String courseName;
    ArrayList<Student> enrolledStudents;
    ArrayList<Student> probationList;
    public Course(String Code, String name) {
        courseCode = Code;
        courseName = name;
        enrolledStudents = new ArrayList<>();
        probationList = new ArrayList<>();
    }

    public void addStudent(Student s){
        enrolledStudents.add(s);
    }
    public void displayEnrolledStudents(){
        for(int i=0;i<enrolledStudents.size();i++) {
            if (enrolledStudents.get(i) != null) {
                enrolledStudents.get(i).printInfo();
            }
            else {
                return;
            }
        }
    }
    public void removeStudentByID(long id) {
        for(int i=0;i<enrolledStudents.size();i++) {
            if(enrolledStudents.get(i).getStudentID() == id) {
                enrolledStudents.remove(i);
                System.out.println("Student: "+id+" has been removed");
                return;
            }
        }
            System.out.println("Error: Student not found in this course");
    }
    public void filterProbation(ArrayList<Student> list1) {
        for(int i=0;i<list1.size();i++) {
            if(list1.get(i).getGpa()<2) {
                probationList.add(list1.get(i));
                System.out.println("Successfully transferred: "+list1.get(i).getName());
                list1.remove(i);
                i = i-1;
            }
        }

    }
    public ArrayList searchByName(String keyword) {
        keyword = keyword.toLowerCase();
        ArrayList<Student> results = new ArrayList<>();
        for(int i=0; i<enrolledStudents.size();i++) {
            if(enrolledStudents.get(i).getName().toLowerCase().equals(keyword)) {
                results.add(enrolledStudents.get(i));
            }
        }
        for(int i=0;i<probationList.size();i++) {
            if(probationList.get(i).getName().toLowerCase().equals(keyword)) {
                results.add(probationList.get(i));
            }
        }
        return results;
    }
}
