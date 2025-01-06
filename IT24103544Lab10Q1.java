import java.util.Scanner;

public class IT24103544Lab10Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();
        
        // Using assertion to verify that the mark is within the range of 0 to 100
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";
        
        System.out.println("Mark is Validated");
    }
}
