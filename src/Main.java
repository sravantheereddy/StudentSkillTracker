package src;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n1. Add Student\n2. Display Students\n3. Exit");
            System.out.print("Enter your choice: ");
            
            // Input validation for number
            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter roll number: ");
                    String roll = scanner.nextLine();

                    System.out.print("Enter skills (comma separated): ");
                    String[] skills = scanner.nextLine().split(",");

                    List<String> skillList = new ArrayList<>();
                    for (String skill : skills)
                        skillList.add(skill.trim());

                    Student s = new Student(name, roll, skillList);
                    manager.addStudent(s);
                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    System.out.println("🚪 Exiting...");
                    return;

                default:
                    System.out.println("❌ Invalid choice! Please enter 1, 2, or 3.");
            }
        }
    }
}
