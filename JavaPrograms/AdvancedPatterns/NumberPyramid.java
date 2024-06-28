package AdvancedPatterns;
import java.util.Scanner;
public class NumberPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the value of N: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = n-i; j >= 1; j--)
                System.out.print("  ");
            
            //numbers
            for(int j = 1; j <= i; j++)
                System.out.print(i + "   ");
            
            System.out.println("\n");
        }
        sc.close();
    }
}
