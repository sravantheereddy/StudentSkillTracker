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

    // ✅ Getter methods
    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public List<String> getSkills() {
        return skills;
    }
}
