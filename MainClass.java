class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class MainClass {
    public static void main(String[] args) {
        try {
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int userInput = getUserInput();

            // Check if the number is less than 500
            if (userInput < 500) {
                throw new CustomException("Number should be greater than or equal to 500.");
            }

            System.out.println("Entered number: " + userInput);

        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to get user input
    private static int getUserInput() {
        try {
            // Read user input from the console
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            return scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            // Handle non-integer input
            System.out.println("Error: Please enter a valid integer.");
            System.exit(1);
            return 0;  // This is just to satisfy the compiler; the program should never reach here
        }
    }
}
