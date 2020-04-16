import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
     
         Scanner me = new Scanner(System.in);
         System.out.println("Enter any number to get harmonic series sum :  ");

         int n =  me.nextInt();
         System.out.println();
        
        
        float sum = 0;
        

        for(float i = 1; i <= n ; i++){
             sum += 1/i;
             
             System.out.println("Your Step 1 +"  + " 1/" + (int)i+ " is = "  + sum);
            

        }
        System.out.println("\n Your Harmonic Sum is = " + sum);
        System.out.println();
    }

}