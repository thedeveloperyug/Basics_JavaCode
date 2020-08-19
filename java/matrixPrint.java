import java.util.Scanner;

/**
 * array2D
 */
public class matrixPrint {

    public static void main(final String[] args) {

        System.out.println("//Program to Print Matrix:");
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total rows of the matrix.");

        int rows = sc.nextInt();
        System.out.println();

        System.out.println("Enter total coloumn of the matrix.");
        int cols = sc.nextInt();
        System.out.println();

        int a[][] = new int[rows][cols];

        System.out.println("Enter the matrix details in row wise.");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                a[i][j] = sc.nextInt();

            }
        }
            System.out.println();
            System.out.print("Your matrix is:\t\n");
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {

                System.out.print("  " + a[i][j] + "  ");
            }
        }

        System.out.println("\n");

    }
}
