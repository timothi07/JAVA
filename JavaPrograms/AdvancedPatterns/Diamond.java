package AdvancedPatterns;
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        //upper part
        for (int i = 1; i <= n; i++){
            //spaces
            for (int j = n-i; j >= 1; j--)
                System.out.print("  ");
            
            //stars
            for (int j = 1; j <= (2 * i) - 1; j++)
                System.out.print("* ");

            System.out.println();
        }

        //lower part
        for (int i = n-1; i >= 1; i--){
            //spaces
            for (int j = n-i; j >= 1; j--)
                System.out.print("  ");
            
            //stars
            for (int j = 1; j <= (2 * i) - 1; j++)
                System.out.print("* ");

            System.out.println();
        }

        sc.close();
    }
}
