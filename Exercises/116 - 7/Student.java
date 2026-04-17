public class Student {
    private int id;
    private String name;
    private double grade;
    private double performanceGrade;

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public double getPerformanceGrade() {
        return performanceGrade;
    }

    public String getName() {
        return name;
    }

    public Student(int id, String name, double grade, double performanceGrade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.performanceGrade = performanceGrade;
    }

    public void displayInfo() {
        System.out.println("ID: "+id+"\nName: "+name+"\nGrade: "+grade+"\nPerformance Grade: "+performanceGrade);
    }

    @FunctionalInterface
    interface GradeOperation {
        double apply(double grade);
    }

    @FunctionalInterface
    interface StudentChecker {
        boolean check(Student s);
    }


}
