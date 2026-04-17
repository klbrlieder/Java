    import java.awt.desktop.SystemSleepEvent;
    import java.util.ArrayList;
    import java.util.Collections;

    public class StudentDemo {
        public static void main(String[] args) {
            ArrayList<Student>students = new ArrayList<>();
            StudentManager manager = new StudentManager();


            Student s1 = new Student(21, "Richard", 34.61, 44.69);
            Student s2 = new Student(20, "Nolan", 77.54, 88.92);
            Student s3 = new Student(19, "Mark", 66.82, 82.65);
            Student s4 = new Student(18, "I made a steak", 85.21, 88.62);

            students.add(s1);
            students.add(s2);
            students.add(s3);
            students.add(s4);

            boolean inRange = manager.checkStudent(s1, s -> s.getGrade() >= 30 && s.getGrade() <= 40);
            double setNewGrade = manager.applyGradeOperation(s1, s->40);
            students.forEach(s-> {
                if(manager.checkStudent(s, st->st.getGrade() >= 30 && st.getGrade() <= 40)) {
                    s.setGrade(40);
                    System.out.println(s.getName()+" had their score changed to 40!");
                }
            });
            students.forEach(s-> {
                if(manager.checkStudent(s, st->st.getGrade() >= 85 && st.getGrade() <= 90)) {
                    s.setGrade(90);
                    System.out.println(s.getName()+" had their score changed to 90!");
                }
            });

            students.forEach(s-> {
                if(manager.checkStudent(s, st->st.getPerformanceGrade() > 75)) {
                    s.setGrade(s.getGrade()+5);
                    System.out.println("Student: "+s.getName()+"\nNew Grade: "+s.getGrade());
                }
                else{
                    s.setGrade(s.getGrade());
                    System.out.println("Student: "+s.getName()+"\nNew Grade: "+s.getGrade());
                }
            });
            Collections.sort(students, (st1,st2) -> Double.compare(st1.getGrade(), st2.getGrade()));

            students.forEach(s->System.out.println(s.getName()+" : "+s.getGrade()));

            Collections.sort(students, (st1, st2) -> st1.getName().compareTo(st2.getName()));

            students.forEach(s->System.out.println(s.getName()+" : "+s.getGrade()));


        }


    }
