import java.util.ArrayList;

public class Student {
    // 1. Private Attributes (Encapsulation)
    private String studentId;
    private String studentName;
    private String emailAddress;
    private String courseName;
    private double programmingScore;
    private double mathematicsScore;
    private ArrayList<String> technicalSkills;

    // 2. Parameterized Constructor
    public Student(String studentId, String studentName, String emailAddress,
                   String courseName, double programmingScore, double mathematicsScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.emailAddress = emailAddress;
        this.courseName = courseName;
        this.programmingScore = programmingScore;
        this.mathematicsScore = mathematicsScore;
        // Initialize an empty list so skills can be added safely later
        this.technicalSkills = new ArrayList<>();
    }

    // 3. Getters and Setters for Controlled Access
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getProgrammingScore() {
        return programmingScore;
    }

    public void setProgrammingScore(double programmingScore) {
        // Validation prevents invalid scores
        if (programmingScore >= 0 && programmingScore <= 100) {
            this.programmingScore = programmingScore;
        } else {
            System.out.println("Invalid programming score. Must be between 0 and 100.");
        }
    }

    public double getMathematicsScore() {
        return mathematicsScore;
    }

    public void setMathematicsScore(double mathematicsScore) {
        if (mathematicsScore >= 0 && mathematicsScore <= 100) {
            this.mathematicsScore = mathematicsScore;
        } else {
            System.out.println("Invalid mathematics score. Must be between 0 and 100.");
        }
    }

    public ArrayList<String> getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(ArrayList<String> technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    // 4. Helper Method to Add a Single Skill
    public void addTechnicalSkill(String skill) {
        if (skill != null && !skill.trim().isEmpty()) {
            this.technicalSkills.add(skill);
        }
    }

    // 5. Business Logic Method: Calculate Average Score
    public double calculateAverageScore() {
        return (programmingScore + mathematicsScore) / 2.0;
    }

    // 6. Display Method for Formatted Output
    public void displayStudentDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Student ID        : " + studentId);
        System.out.println("Name              : " + studentName);
        System.out.println("Email             : " + emailAddress);
        System.out.println("Course            : " + courseName);
        System.out.println("Programming Score : " + programmingScore);
        System.out.println("Mathematics Score : " + mathematicsScore);
        System.out.printf("Average Score     : %.2f%n", calculateAverageScore());
        System.out.println("Technical Skills  : " + (technicalSkills.isEmpty() ? "None listed" : String.join(", ", technicalSkills)));
        System.out.println("----------------------------------------");
    }

    // 7. Overriding toString() for Easy Object Representation
    @Override
    public String toString() {
        return "Student{" +
                "ID='" + studentId + '\'' +
                ", Name='" + studentName + '\'' +
                ", Course='" + courseName + '\'' +
                ", AvgScore=" + String.format("%.2f", calculateAverageScore()) +
                ", Skills=" + technicalSkills +
                '}';
    }
}