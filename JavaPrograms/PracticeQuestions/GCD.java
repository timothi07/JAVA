package PracticeQuestions;
import java.util.Scanner;

public class GCD {
    public static int findGCD(int x, int y){
        int a, b;
        a = (x > y) ? x : y;
        b = (x < y) ? x : y;
        if (b == 0)
            return a;
        else
            return findGCD(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int res = findGCD(n1, n2);
        System.out.println("GCD of "+ n1 + " and " + n2 + " is: " + res);

        sc.close();
    }
}
