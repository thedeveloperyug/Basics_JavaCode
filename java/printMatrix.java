
import java.util.Scanner;

public class printMatrix {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows");
    
    int rows = sc.nextInt();
    System.out.println("Enter cols");
    int cols = sc.nextInt();
    System.out.println();

    int numbers1[][] = new int[rows][cols];
    int numbers2[][] = new int [rows] [cols];
    int c [][] = new int [rows][cols];
    int sum = 0;
    

    
    System.out.println("Enter 1st matrix element");

    for(int a = 0; a < rows; a++){
        for(int b=0; b<cols; b++){
        numbers1[a][b] = sc.nextInt();
        }
    }
    System.out.println("Enter 2nd matrix element");

    for(int i= 0; i < rows; i++){
        for(int j =0; j<cols; j++){
        numbers2[i][j] = sc.nextInt();
        }
    }
  


    System.out.println("your 1st matrix is: ");

    for(int a= 0; a < rows; a++){
        System.out.println();
        for(int b =0; b<cols; b++){
       System.out.print(numbers1[a][b]+"  ");
      
        }
    }

    System.out.println("\n");


System.out.println("your 2nd matrix is: ");

    for(int i= 0; i < rows; i++){
        System.out.println();
        for(int j = 0; j<cols; j++){
       System.out.print(numbers2[i][j]+"  ");
      
        }
    }
    System.out.println();
    
    System.out.print("your matrix mul is: ");
    for (int i = 0; i < rows; i++) {
        System.out.println();
        for (int j = 0; j < cols; j++) {
          System.out.print(c[i][j]+" ");
        } 

      }

    }
}
