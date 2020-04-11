import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {


int i;

        Scanner me = new Scanner(System.in);
        System.out.print("Enter any number to print Table = ");
        int a = me.nextInt();

        System.out.println("\n");

        for(i=1; i<=10; i++){
            System.out.println("\t"+a +" * "+ i + " = " + i*a);
        }
        System.out.println("\n");
    }

}