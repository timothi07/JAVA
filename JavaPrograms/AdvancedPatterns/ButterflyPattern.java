package AdvancedPatterns;
import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        //Upper half
        for( int i = 1; i <= n; i++){
            // 1st part
            for( int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            //spaces
            int spaces = 2 * (n - i);
            for( int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }

            // 2nd part
            for( int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        //lower half
        for( int i = n; i >= 1; i--){
            // 1st part
            for( int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            //spaces
            int spaces = 2 * (n - i);
            for( int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }

            // 2nd part
            for( int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        sc.close();
    }
}
