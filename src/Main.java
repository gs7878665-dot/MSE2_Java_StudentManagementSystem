import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Create multiple Student objects using the parameterized constructor
        Student student1 = new Student(
                "S101",
                "Aarav Sharma",
                "aarav.sharma@example.com",
                "Computer Science",
                88.5,
                92.0
        );

        Student student2 = new Student(
                "S102",
                "Priya Verma",
                "priya.verma@example.com",
                "Data Science",
                95.0,
                89.0
        );

        // 2. Add technical skills to student1 using the helper method
        student1.addTechnicalSkill("Java");
        student1.addTechnicalSkill("SQL");
        student1.addTechnicalSkill("Git");

        // Add technical skills to student2 by retrieving the ArrayList via getter
        student2.getTechnicalSkills().add("Python");
        student2.getTechnicalSkills().add("Machine Learning");
        student2.getTechnicalSkills().add("Statistics");

        // 3. Demonstrate Getters and Setters
        System.out.println("Updating details for " + student1.getStudentName() + "...");
        student1.setCourseName("Software Engineering"); // Updating course via setter
        student1.setProgrammingScore(91.0);             // Updating score via setter

        // Attempting to set an invalid score to show setter validation
        student1.setMathematicsScore(150.0);

        // 4. Demonstrate calculating and retrieving average scores
        System.out.println("\n--- Average Score Check ---");
        System.out.println(student1.getStudentName() + "'s Average: " + student1.calculateAverageScore());
        System.out.println(student2.getStudentName() + "'s Average: " + student2.calculateAverageScore());

        // 5. Display complete details of each student
        System.out.println("\n=== Complete Student Records ===");
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // 6. Demonstrate the overridden toString() method
        System.out.println("=== Compact Summary (using toString) ===");
        System.out.println(student1);
        System.out.println(student2);
    }
}