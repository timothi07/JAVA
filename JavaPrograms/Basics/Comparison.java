import java.util.*;

public class Comparison {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b)
            System.out.println("Equal");
        else if (a > b)
            System.out.println(a+" is greater than "+b);
        else
            System.out.println(a+" is less than "+b);

        sc.close();
    }
}
