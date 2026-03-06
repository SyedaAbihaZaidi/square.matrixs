import java.util.Scanner;

public class AbihaMatrixSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of square matrix
        System.out.print("Enter matrix size (n for n x n): ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        // Input matrix elements
        System.out.println("Enter matrix values:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Row sums
        System.out.println("\nRow sums:");
        for (int i = 0; i < n; i++) {
            int sumRow = 0;
            for (int j = 0; j < n; j++) {
                sumRow += a[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sumRow);
        }

        // Column sums
        System.out.println("\nColumn sums:");
        for (int j = 0; j < n; j++) {
            int sumCol = 0;
            for (int i = 0; i < n; i++) {
                sumCol += a[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sumCol);
        }

        // Diagonal sums
        int forwardDiag = 0;
        int reverseDiag = 0;

        for (int i = 0; i < n; i++) {
            forwardDiag += a[i][i];
            reverseDiag += a[i][n - 1 - i];
        }

        System.out.println("\nForward diagonal sum: " + forwardDiag);
        System.out.println("Reverse diagonal sum: " + reverseDiag);

        sc.close();
    }
}