import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice.\n");

        System.out.println("1. Find Greater of given two number.");

        System.out.println("2. Reverse the number");

        System.out.println("3. Find odd or even");

        System.out.println("4. Check Given number is prime or not.");
        System.out.println();
        System.out.println("Press 0 to Exit.");

        int operation = sc.nextInt();

        System.out.println();
        switch (operation) {
            case 0:
                System.exit(0);
                ;
                break;

            case 1:
                System.out.println("Enter the first number");
                int first = sc.nextInt();
                System.out.println("Enter the second number");
                int second = sc.nextInt();
               if(first > second){
                   System.out.println("The greater number is " + first);
               }
               else {
                   System.out.println("The greater number is " + second);
               }
                break;
            case 2:

                int r = 0;

                System.out.println("Enter the number to reverse");
                int n = sc.nextInt();
                sc.close();
                while (n != 0) {
                    r = (r * 10) + (n % 10);
                    int y = r;
                    n = n / 10;
                    System.out.print(r);

                }
                break;

            case 3:
                System.out.println("Enter the number to check odd or even.");
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    System.out.println("Given number is even");
                } else {
                    System.out.println("Given number is odd");
                }
                break;
            case 4:
                System.out.println("Enter the number to check prime or not.");
                int numb = sc.nextInt();

                for (int i = 2; i < numb; i++) {
                    if (numb % i == 0) {
                        System.out.println("Given number is not prime.");
                        break;
                    } else {
                        System.out.println("Given number is prime.");
                    }
                }
                if (numb < 2) {
                    System.out.println("Given number is not prime.");
                }
                break;
            default:
                System.err.println("\t(You entered wrong choice.)");
                break;
        }
        System.out.println("\n");

    }

}