package PracticeQuestions;
import java.util.Scanner;

public class Fibonacci {
    public static void fib(int n){
        int t1 = 0, t2 = 1, temp=1, i = 1;
        while (i <= n){
            System.out.print(temp + " ");
            temp = t1 + t2;
            t1 = t2;
            t2 = temp;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        fib(n);

        sc.close();
    }
}
