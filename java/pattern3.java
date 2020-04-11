import java.util.Scanner;

public class pattern3 {

    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);
        int a = me.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j < a- i  +1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
