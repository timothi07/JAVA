package Functions;
import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
        int prod = 1;
        while (n > 0){
            prod *= n;
            n--;
        }
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int res = fact(num);
        System.out.println("Factorial of "+ num + " is: " + res);

        sc.close();
    }
    
}
