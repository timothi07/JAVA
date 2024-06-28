import java.util.*;

public class Area {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        double area = 3.24 * r * r;
        System.out.format("%.2f",area);

        sc.close();
    }
}