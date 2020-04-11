import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the Third number");
        int c = sc.nextInt();
        System.out.println("Enter the fourth number");
        int d = sc.nextInt();

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println("The Greator number is " + a);
                }
             else {
                System.out.println("The Greator number is " + d);
            }
        }
        }

        else 
            if (b > c) {
                if (b > d) {
                    System.out.println("The Greator number is " + b);
                }
            
             else {
                System.out.println("The Greator no is " + d);
            }
        }
        

       else  if (c > b) {
                    if (c > d) {

                        System.out.println("The Greator number is " + c);
                    }
                    else {
                        System.out.println("The Greator number is " + d);
                    }
           
        }
                 else {
                    System.out.println("The Greator number is " + d);
                }

            }
        }

    

