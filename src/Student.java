package src;

public class Student {
    private String name;
    private int codingHours;
    private int aptitudeHours;
    private int gitCommits;

    public Student(String name) {
        this.name = name;
        this.codingHours = 0;
        this.aptitudeHours = 0;
        this.gitCommits = 0;
    }

    public void addCodingHours(int hours) {
        this.codingHours += hours;
    }

    public void addAptitudeHours(int hours) {
        this.aptitudeHours += hours;
    }

    public void addGitCommits(int commits) {
        this.gitCommits += commits;
    }

    public void printProgress() {
        System.out.println("Student: " + name);
        System.out.println("Coding Hours: " + codingHours);
        System.out.println("Aptitude Hours: " + aptitudeHours);
        System.out.println("Git Commits: " + gitCommits);
    }
}