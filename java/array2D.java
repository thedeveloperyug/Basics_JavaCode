import java.util.Scanner;

/**
 * array2D
 */
public class array2D {

    public static void main(final String[] args) {

        System.out.println("//Program to add two Matrix:");
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total rows of the matrix.");
         int rows = sc.nextInt();
         System.out.println("Enter total coloumn of the matrix.");
         int cols = sc.nextInt();

        System.out.println();

        int a[][] = new int[rows][cols];
         int b[][] = new int[rows][cols];

         System.out.println();

         System.out.println("Enter the 1st matrix elements.");
        

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
               

                a[i][j] = sc.nextInt();

            }
        }

        System.out.println("Enter 2nd matrix elements.");

         for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){

                b[i][j] = sc.nextInt();

            }
        }
         
        int c [] [] = new int [rows] [cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                c[i] [j] = a[i] [j] + b [i] [j];
            
            }
        }
            System.out.println();
            System.out.print("Your Matrix addition is:");

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {

             System.out.print( "  "+c[i][j] + "  " );
              
            }
        }    
System.out.println();
        
    }
}
