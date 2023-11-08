import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for grade ranges
        final double A_GRADE = 90.0;
        final double B_GRADE = 80.0;
        final double C_GRADE = 70.0;
        final double D_GRADE = 60.0;

        int totalSubjects;
        double totalMarks = 0.0;

        System.out.print("Enter the number of subjects: ");
        totalSubjects = scanner.nextInt();

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            double subjectMarks = scanner.nextDouble();
            totalMarks += subjectMarks;
        }

        double averagePercentage = (totalMarks / (totalSubjects * 100)) * 100;

        char grade;
        if (averagePercentage >= A_GRADE) {
            grade = 'A';
        } else if (averagePercentage >= B_GRADE) {
            grade = 'B';
        } else if (averagePercentage >= C_GRADE) {
            grade = 'C';
        } else if (averagePercentage >= D_GRADE) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
