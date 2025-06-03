public class NestedForLoopPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   "); // Adjust the spaces based on the pattern
            }

            // Inner loop for ascending numbers
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            // Inner loop for descending numbers
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();// Move to the next line after completing each row
        }
    }
}
