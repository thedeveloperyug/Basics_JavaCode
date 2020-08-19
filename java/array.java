import java.util.Scanner;

/**
 * array
 */
public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index size\n");
        int a = sc.nextInt();

        int numbers1 []= new int [a] ;
        System.out.println("Enter elements to print");

        for(int i = 0; i < a ; i++){
            numbers1 [i] = sc.nextInt();
        }

        System.out.print("Your element is:  ");

        for(int i = 0; i < a ; i++){
           System.out.print(numbers1[i]+"  ");
        }

    }
}
