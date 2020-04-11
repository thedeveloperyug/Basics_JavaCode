import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        int i;

        Scanner me = new Scanner(System.in);
        // System.out.print("Enter any number to print Table = ");
        // int a = me.nextInt();


        System.out.println("");

        for (int j = 1; j <= 30; j++){

            if(j < 31){
                System.out.println("");
             
                
            }

       for (i = 1; i <= 10; i++) {
           if (i > 20) {
               System.out.print("\n");
           }
            System.out.print("\t" + i * j);
        }
        System.out.println("\n");
    }
    }
}