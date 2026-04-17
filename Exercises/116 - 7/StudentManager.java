public class StudentManager {
    public double applyGradeOperation(Student s, Student.GradeOperation operation) {return operation.apply(s.getGrade());}
    public boolean checkStudent(Student s, Student.StudentChecker checker) {return checker.check(s);}
}
