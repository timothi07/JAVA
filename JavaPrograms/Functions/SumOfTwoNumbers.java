package Functions;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static int calculateSum(int n1, int n2){
        return n1 + n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = calculateSum(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + res);

        sc.close();
    }
}
