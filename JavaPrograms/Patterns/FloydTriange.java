package Patterns;
import java.util.Scanner;
public class FloydTriange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed: ");
        int n = sc.nextInt();
        int ele=1;
        for (int i = 1; i<= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(ele + " ");
                ele ++;
            }
            System.out.println();
        }
        sc.close();
    }
}
