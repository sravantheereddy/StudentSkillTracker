package src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StudentSkillTrackerGUI extends JFrame {
    private JTextField nameField, rollField, skillsField;
    private DefaultTableModel tableModel;
    private StudentManager manager = new StudentManager();

    public StudentSkillTrackerGUI() {
        setTitle("Student Skill Tracker");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Input form panel
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Add Student"));

        nameField = new JTextField();
        rollField = new JTextField();
        skillsField = new JTextField();

        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Roll Number:"));
        inputPanel.add(rollField);
        inputPanel.add(new JLabel("Skills (comma-separated):"));
        inputPanel.add(skillsField);

        JButton addButton = new JButton("Add Student");
        inputPanel.add(new JLabel());
        inputPanel.add(addButton);

        // Table panel
        tableModel = new DefaultTableModel(new String[]{"Name", "Roll Number", "Skills"}, 0);
        JTable table = new JTable(tableModel);
        JScrollPane tablePane = new JScrollPane(table);

        add(inputPanel, BorderLayout.NORTH);
        add(tablePane, BorderLayout.CENTER);

        // Add Button Action
        addButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String roll = rollField.getText().trim();
            String[] skillsArray = skillsField.getText().split(",");

            if (name.isEmpty() || roll.isEmpty() || skillsField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled out!", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            List<String> skills = new ArrayList<>();
            for (String skill : skillsArray)
                skills.add(skill.trim());

            Student s = new Student(name, roll, skills);
            manager.addStudent(s);

            tableModel.addRow(new Object[]{s.getName(), s.getRollNumber(), String.join(", ", s.getSkills())});

            nameField.setText("");
            rollField.setText("");
            skillsField.setText("");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentSkillTrackerGUI().setVisible(true));
    }
}
