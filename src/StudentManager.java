package src;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("✅ Student added successfully!");
    }

    public void displayAllStudents() {
        for (Student s : studentList) {
            s.displayInfo();
            System.out.println("----------------------");
        }
    }
}
