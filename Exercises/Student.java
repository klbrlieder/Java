public class Student {
    String name;
    int age;
    public Student() {
        name = "Patrick";
        age = 30;
    }
    public Student(String firstName, int firstAge) {
        name = firstName;
        age = firstAge;

    }
    void printStudentInfo() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }

}
