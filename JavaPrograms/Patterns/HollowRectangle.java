package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if( i == 0 || j == 0 || i == r-1 || j == c-1)
                    System.err.print("* ");
                else
                    System.err.print("  ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

// OUTPUT
// Enter the number of rows and columns: 
// 4 5
// * * * * * 
// *       * 
// *       * 
// * * * * * 