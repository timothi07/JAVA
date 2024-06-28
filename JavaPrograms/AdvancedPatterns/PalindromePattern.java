package AdvancedPatterns;
import java.util.Scanner;
public class PalindromePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = n-i; j >= 1; j--)
                System.out.print("  ");
            
            //1st half numbers
            for(int j = i; j >= 1; j--)
                System.out.print(j + " ");
            
            //2nd half numbers
            for(int j = 2; j <= i; j++)
                System.out.print(j + " ");


            System.out.println("\n");
        }
        sc.close();
    }
}
