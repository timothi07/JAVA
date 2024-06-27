import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int product;
        for(int i = 1; i <= 10; i++){
            product = n * i ;
            System.err.println(n + " x " + i + " = " + product);
        }

        sc.close();
    }
}
