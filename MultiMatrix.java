import java.util.*;

class MultiMatrix {
    void printMatrix(int M[][], int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] inputMatrix(int rowSize, int colSize, Scanner sc) {
	System.out.println("enter elementes of matrix");
        int M[][] = new int[rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                M[i][j] = sc.nextInt();
            }
        }
        return M;
    }

    void multiplyMatrix(int row1, int col1, int A[][], int row2, int col2, int B[][]) {

        int i, j, k;
        System.out.println("\nMatrix A:");
        printMatrix(A, row1, col1);
        System.out.println("\nMatrix B:");
        printMatrix(B, row2, col2);
        if (row2 != col1) {
            System.out.println("\nMultiplication Not Possible");
            return;
        }
        int C[][] = new int[row1][col2];
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("\nResultant Matrix:");
        printMatrix(C, row1, col2);
    }

    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the first matrix:");
        int p = sc.nextInt();
        System.out.print("Enter the number of columns in the first matrix:");
        int q = sc.nextInt();
        int A[][] = inputMatrix(p, q, sc);
        System.out.print("Enter the number of rows in the second matrix:");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns in the second matrix:");
        int n = sc.nextInt();
        int B[][] = inputMatrix(m, n, sc);
	MultiMatrix MM = new MultiMatrix();
        MM.multiplyMatrix(p, q, A, m, n, B);
    }
}
