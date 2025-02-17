package Patterns;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
 * OUTPUT
    Enter the value of N: 
    5
    
    * 
    * * 
    * * * 
    * * * * 
    * * * * * 
 */