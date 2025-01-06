import java.util.Scanner;

public class IT24103544Lab10Q2 {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the mark
        System.out.print("Enter the mark (0-100): ");
        int mark = scanner.nextInt();
        
        // Using assertion to check if the mark is within the valid range
        assert mark >= 0 && mark <= 100 : "Invalid Mark"; // Assertion to check range
        
        // Determine the grade
        char grade = ' ';
        
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Assertion to check if the grade is correctly assigned
        assert (grade == 'A' && mark >= 75) || (grade == 'B' && mark >= 60 && mark < 75) ||
               (grade == 'C' && mark >= 50 && mark < 60) || (grade == 'D' && mark >= 40 && mark < 50) ||
               (grade == 'F' && mark < 40) : "Incorrect Grade Assigned";
        
        // Display the grade
        System.out.println("Grade: " + grade);
        
        // Close the scanner
        scanner.close();
    }
}
