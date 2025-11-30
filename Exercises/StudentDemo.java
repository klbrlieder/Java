public class StudentDemo {
    public static void main(String[] args) {
        Student std = new Student();
        std.printStudentInfo();
        Student std2 = new Student("Spongebob", 21);
        std2.printStudentInfo();

        //no errors observed and the values of name and age from the default constructor class represented correctly.
        //no errors observed again and the values are the parameters we've given in the code that were sent to the parameterized constructor

    }
}
