import java.util.HashSet;
import java.util.Set;

public class problem06 {
    static class Student {
        private final String name;
        private final int regId;

        Student(String name, int regId) {
            this.name = name;
            this.regId = regId;
        }

        public int getId() {
            return regId;
        }
    }

    static class StudentRegister {
        private  Set<Integer> studentIds = new HashSet<>();

        void addStudent(Student student) {
            if (studentIds.add(student.getId())) {
                System.out.println("Succed");
            } else {
                System.out.println("Already exists");
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Madhav", 14);
        Student s2 = new Student("Dravin", 14);
        StudentRegister register = new StudentRegister();
        register.addStudent(s1);
        register.addStudent(s2);
    }
}
