package src;
import java.util.List;

public class Student {
    private String name;
    private String rollNumber;
    private List<String> skills;

    public Student(String name, String rollNumber, List<String> skills) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.skills = skills;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Skills: " + String.join(", ", skills));
    }
}
