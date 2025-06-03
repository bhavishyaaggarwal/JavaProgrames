import java.util.Scanner;

public class UserDefinedStudentInfoProgram {
    public static void main(String[] args) {
        // Initialize arrays for names and roll numbers of 10 students
        String[] studentNames = new String[10];
        int[] rollNumbers = new int[10];

        // Populate arrays with user-defined values
        getUserDefinedStudentInfo(studentNames, rollNumbers);

        try {
            // Display the names and roll numbers of students
            displayStudentInfo(studentNames, rollNumbers);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("Error: Array index out of bounds. Please check the array lengths.");
        }
    }

    // Method to get user-defined names and roll numbers of students
    private static void getUserDefinedStudentInfo(String[] names, int[] rollNumbers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for 10 students:");

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollNumbers[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }
    }

    // Method to display the names and roll numbers of students
    private static void displayStudentInfo(String[] names, int[] rollNumbers) {
        System.out.println("Student Information:");

        for (int i = 0; i < names.length; i++) {
            // Access each student's information using the same index
            String name = names[i];
            int rollNumber = rollNumbers[i];

            System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
        }
    }
}
