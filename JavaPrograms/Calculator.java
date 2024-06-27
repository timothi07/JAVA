import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operands: ");
        double a = sc.nextInt();
        double b = sc.nextInt();

        System.out.println("Enter the operator: ");
        String optr = sc .next();

        switch (optr) {
            case "+": System.out.println(a+b);
                break;
            case "-": System.out.println(a-b);
                break;
            case "*": System.out.println(a*b);
                break;
            case "/": System.out.println(a/b);
                break;
            case "%": System.out.println(a%b);
                break;
            default:System.out.println("Invalid operator");
        }
        sc.close();
    }
}
