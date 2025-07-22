package src;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayAllStudents() {
        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            System.out.println("Roll Number: " + s.getRollNumber());
            System.out.println("Skills: " + String.join(", ", s.getSkills()));
            System.out.println("---------------------------");
        }
    }

    // ✅ Getter to be used by GUI
    public List<Student> getStudents() {
        return students;
    }
}
